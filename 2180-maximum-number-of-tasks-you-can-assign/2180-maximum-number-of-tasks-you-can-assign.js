const count = new Uint32Array(256);
const prefix = new Uint32Array(256);

const toRadixSorted = (a) => {
    const n = a.length;
    if (n < 2) return a;
    let buffer = new Uint32Array(a);
    let output = new Uint32Array(n);
    let maxShift = 0;
    for (let i = 0; i < n; ++i) maxShift |= a[i];
    maxShift = maxShift ? (32 - Math.clz32(maxShift)) : 0;

    for (let shift = 0; shift < maxShift; shift += 8) {
        count.fill(0);
        for (let i = 0; i < n; ++i)
            ++count[(buffer[i] >>> shift) & 0xFF];
        prefix[0] = 0;
        for (let i = 1; i < 256; ++i)
            prefix[i] = prefix[i - 1] + count[i - 1];
        for (let i = 0; i < n; ++i) {
            const val = buffer[i];
            const b = (val >>> shift) & 0xFF;
            output[prefix[b]++] = val;
        }
        const temp = buffer;
        buffer = output;
        output = temp;
    }
    return buffer;
}

const a = new Uint32Array(50000);
const guess = (k, tasks, workers, pills, strength) => {
    const m = workers.length;
    for (let i = m - k, j = 0, l = 0, r = 0; i < m; i++) {
        const w = workers[i];
        while (j < k && tasks[j] <= w + strength) {
            a[r++] = tasks[j++];
        }
        if (l === r) return false;
        if (a[l] <= w) l++;
        else if (pills > 0) {
            pills--;
            r--;
        } else return false;
    }
    return true;
};

const maxTaskAssign = (tasks, workers, pills, strength) => {
    tasks = toRadixSorted(tasks);
    workers = toRadixSorted(workers);

    let left = 0;
    let right = Math.min(tasks.length, workers.length);

    while (left <= right) {
        const mid = (left + right) >> 1;
        if (guess(mid, tasks, workers, pills, strength)) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return right;
};
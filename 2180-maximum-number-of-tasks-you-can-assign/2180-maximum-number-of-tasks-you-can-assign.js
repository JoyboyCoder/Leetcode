var maxTaskAssign = function(tasks, workers, pills, strength) {
    tasks.sort((a, b) => a - b);
    workers.sort((a, b) => a - b);

    function canAssign(mid) {
        let boosted = [];
        let w = workers.length - 1;
        let freePills = pills;

        for (let t = mid - 1; t >= 0; t--) {
            const task = tasks[t];

            if (boosted.length && boosted[0] >= task) {
                boosted.shift();
            } else if (w >= 0 && workers[w] >= task) {
                w--;
            } else {
                while (w >= 0 && workers[w] + strength >= task) {
                    boosted.push(workers[w--]);
                }
                if (!boosted.length || freePills === 0) return false;
                boosted.pop();
                freePills--;
            }
        }

        return true;
    }

    let low = 0, high = Math.min(tasks.length, workers.length);
    while (low < high) {
        let mid = Math.floor((low + high + 1) / 2);
        if (canAssign(mid)) low = mid;
        else high = mid - 1;
    }
    return low;
};
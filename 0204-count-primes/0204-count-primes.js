var countPrimes = function(n) {
    if (n <= 2) return 0;
    
    // Initialize an array of length n with all entries true.
    const isPrime = new Array(n).fill(true);
    isPrime[0] = isPrime[1] = false;
    
    let count = 0;
    for (let i = 2; i < n; i++) {
        if (isPrime[i]) {
            count++;
            // Mark multiples of i as non-prime starting from i*i.
            for (let j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    return count;
};
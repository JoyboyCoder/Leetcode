/**
 * @param {number} k
 * @param {number[]} operations
 * @return {character}
 */
var kthCharacter = function(k, operations) {
    let len = 1n;         // Use BigInt for large numbers
    let shift = 0;
    let i = 0;

    // Convert k to BigInt since it can be very large
    k = BigInt(k);

    // Step 1: Expand length until it >= k
    while (i < operations.length && len < k) {
        len *= 2n;
        i++;
    }

    // Step 2: Work backward
    while (i-- > 0) {
        len /= 2n;
        if (k > len) {
            k -= len;
            if (operations[i] === 1) shift++;
        }
    }

    // Step 3: Return final character
    return String.fromCharCode('a'.charCodeAt(0) + (shift % 26));
};
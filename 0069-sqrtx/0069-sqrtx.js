/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let l = 0;
    let r = x;
    while (l <= r) {
        let m = l + Math.floor((r - l) / 2);
        let square = m * m;
        if (square === x) {
            return m;
        } else if (square < x) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }
    return r;
};
/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let n=s.length-1;
    let i = 0;
        while(i<=n){
            let temp= s[i];
            s[i]=s[n];
            s[n]=temp;
            i++;
            n--;
        }
};
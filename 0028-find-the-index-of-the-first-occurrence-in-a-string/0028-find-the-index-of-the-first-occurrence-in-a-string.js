/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
  let len = haystack.length-needle.length;
  for(let i=0; i<=len; i++){
    let k = i;
    let j = 0;
    while(haystack[k] == needle[j] && j<needle.length){
        k++;
        j++;
        if(j == needle.length) return i;
    }
  } 
return -1;
};
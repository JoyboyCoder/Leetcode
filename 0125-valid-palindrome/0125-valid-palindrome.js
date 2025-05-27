/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
   let str = "";
   for (let i = 0; i < s.length; i++) {
      let char = s[i].toLowerCase();
      if ((char >= "a" && char <= "z") || (char >= "0" && char <= "9")) {
         str += char;
      }
   }
   let start = 0;
   let end = str.length - 1;
   while (start < end) {
      if (str[start] !== str[end]) {
         return false;
      } else {
         start++;
         end--;
      }
   }
   return true;
};
class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
        for(int i = 0;i<ch.length;i++){
            int firstInd = i;

            while(i < ch.length && ch[i] != ' '){
                ch[i] |= 32;
                i++;
            }

            if(i - firstInd > 2){
                ch[firstInd] &= ~32;
            }
        }

        return String.valueOf(ch);
    }
}
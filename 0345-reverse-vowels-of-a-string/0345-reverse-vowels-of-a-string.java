class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int n=s.length()-1;
        int i = 0;
        while(i<n){
            char a = charArray[i];
            if(a=='a' || a=='A'|| a=='e' || a=='E'|| a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
                char b = charArray[n];
                if(b=='a' || b=='A'|| b=='e' || b=='E'|| b=='i' || b=='I' || b=='o' || b=='O' || b=='u' || b=='U'){
                    char temp=charArray[i];
                    charArray[i]=charArray[n];
                    charArray[n]=temp;
                    i++;
                    n--; 
                }
                else{
                    n--;
                }
               
            }
            else{
                i++;
            }
            
        }
        String str = new String(charArray);
        return str;
    }
}
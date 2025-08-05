class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int count=1;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length && chars[i]==chars[i-1]) count++;
            else{
                chars[ans++] = chars[i-1];
                if(count>1){
                    char[] array = String.valueOf(count).toCharArray();
                    for(int k=0;k<array.length;k++) chars[ans++] = array[k];
                }
                count=1;
            }
        }
    return ans;
    }
}
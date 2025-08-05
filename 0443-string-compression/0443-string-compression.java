class Solution {
    public int compress(char[] chars) {
       
       if(chars.length == 1){
        return 1;
       }

        int start = 0, index = 0, count = 1;

        for(int i = 1; i < chars.length; i++){
            if(chars[start] == chars[i]){
                count++;
            }
            else{
                chars[index++] = chars[start];

                if(count > 1){
                    if(count > 9){
                        String str = Integer.toString(count);
                        for(int j = 0; j < str.length(); j++){
                            chars[index++] = str.charAt(j);
                        
                        }
                    }
                    else{
                        chars[index++] = (char)(count + '0');
                    }
                    
                }
                count = 1;
                start = i;
            }
        }
        chars[index++] = chars[start];
        if(count > 1){
            if(count > 9){
                String str = Integer.toString(count);
                for(int j = 0; j < str.length(); j++){
                    chars[index++] = str.charAt(j);
                
                }
            }
            else{
                chars[index++] = (char)(count + '0');
            }
        }
        return index;

    }
        
}
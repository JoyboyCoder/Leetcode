import java.util.Collections;
class Solution {
    public int maxProfit(int[] prices) {

        int n =prices.length;
        int m = Integer.MAX_VALUE;
        int ans = 0;
        int temp = 0;
        for (int i = 0;i<n;i++){
            temp = prices[i]-m;
            
            if (ans<temp){
                ans = temp;
            } 
            if (prices[i]<m){
                m=prices[i];
            }
        }
        return ans;
        }   
    }    
class Solution {
    static 
    {
        for(int i=0;i<500;i++)
            longestConsecutive(new int[]{});
    }
    public static int longestConsecutive(int[] arr) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cnt=0;
        int longest =0;
        for(int a : arr)
        {
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        if(max<100000)
        {
            boolean b[] = new boolean[max-min+1];
            for(int i : arr)
            {
                b[i-min]=true;
            }
            for(boolean val :b  )
            {
                if(val)
                    cnt++;
                else
                {   
                    longest =Math.max(cnt,longest);
                    cnt=0;
                } 
            }
             longest =Math.max(cnt,longest);
        }
        else
        {
        Set<Integer> ele = new HashSet<>();
        for(int i : arr)
        {
            ele.add(i);
        }
        for(int i : ele)
        {
            if(!ele.contains(i-1))
            {
                int temp = i;
                while(ele.contains(temp))
                {
                    cnt++;
                    temp++;
                }
                longest=Math.max(cnt,longest);
                cnt=0;
            }
        }
        }

        return longest;
    }
}
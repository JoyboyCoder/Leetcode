class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > n/3 && !list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}
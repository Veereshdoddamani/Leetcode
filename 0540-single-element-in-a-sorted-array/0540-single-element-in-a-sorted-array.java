class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
        for(Map.Entry<Integer,Integer> e : entries){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }
}
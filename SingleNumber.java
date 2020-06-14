// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int count = 1 + map.get(nums[i]);
                map.put(nums[i], count);
            }
        }
        
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) { 
            int temp = mapElement.getValue();
            if(temp != 2){
                int result = mapElement.getKey();
                return result;
            }
        }
        
        return -1;
    }
}

// Given a non-empty array of integers, every element appears three times except for one,
// which appears exactly once. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(!map.containsKey(temp)){
                map.put(temp, 1);
            }else{
                int count = map.get(temp);
                count++;
                map.put(temp, count);
            }
        }
        
        int result = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                break;
            }
        }
        
        return result;
    }
}

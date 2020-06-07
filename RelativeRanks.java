// Given scores of N athletes, find their relative ranks and the people with the top three highest scores;
// who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        String[] result = new String[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        int arr[] = nums.clone(); 
        Arrays.sort(arr);
        
        int place = 4;
        for(int i = arr.length - 1; i >= 0; i--){
            int index = map.get(arr[i]);
            
            if(i == arr.length - 1){
                result[index] = "Gold Medal";
            }else if(i == arr.length - 2){
                result[index] = "Silver Medal";
            }else if(i == arr.length - 3){
                result[index] = "Bronze Medal";
            }else{
                result[index] = Integer.toString(place);
                place++;
            }
        }
        return result;
    }
}

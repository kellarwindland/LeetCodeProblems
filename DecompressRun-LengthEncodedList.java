// We are given a list nums of integers representing a list compressed with run-length encoding.
// Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0). 
// For each such pair, there are freq elements with value val concatenated in a sublist.
// Concatenate all the sublists from left to right to generate the decompressed list.
// Return the decompressed list.

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        
        List<Integer> temp = new LinkedList<>();
        
        int freqIndex = 0;
        for(int i = 1; i < nums.length; i += 2){
            int freq = nums[freqIndex];
            int val = nums[i];
            
            for(int j = 0; j < freq; j++){
                temp.add(val);
            }
            
            freqIndex += 2;
        }
        
        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        
        return result;
    }
}

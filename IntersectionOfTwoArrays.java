// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int temp : nums1){
            set.add(temp);
        }
        
        for(int temp : nums2){
            if(set.contains(temp)){
                list.add(temp);
                set.remove(temp);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}

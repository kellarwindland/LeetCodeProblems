// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
// More formally check if there exists two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] != 0){
                set.add(arr[i] / 2);
            }
            if(arr[i] == 0){
                count++;
            }
        }
        
        if(count > 1){
            return true;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }
        }
        
        return false;
    }
}

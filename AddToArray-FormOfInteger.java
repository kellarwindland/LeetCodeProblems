// For a non-negative integer X, the array-form of X is an array of its digits in left to right order.
// For example, if X = 1231, then the array form is [1,2,3,1].
// Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        List<Integer> list = new ArrayList<Integer>();
        int carry = 0;
        for(int i = A.length - 1; i >= 0 ; i--){
            int mod = K % 10;
            K /= 10;
            int temp = A[i] + mod + carry;
            if(temp <= 9){
                list.add(temp);
                carry = 0;
            }else{
                int tempMod = temp % 10;
                list.add(tempMod);
                tempMod = temp / 10;
                carry = tempMod;
            }
        }
        K += carry;
        while(K != 0){
            list.add(K % 10);
            K /= 10;
        }
        
        Collections.reverse(list);
        
        return list;
    }
}

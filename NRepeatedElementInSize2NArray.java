// In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
// Return the element repeated N times.

class Solution {
    public int repeatedNTimes(int[] A) {
        int result = 0;
        Arrays.sort(A);
        int count = 0;
        int last = A[0];
        for(int temp : A){
            if(temp == last){
                count++;
            }else if (count == (A.length / 2)){
                return last;
            }else{
                last = temp;   
                count = 1;
            }
            result = last;
        }
        
        return result;
    }
}

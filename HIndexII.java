// Given an array of citations sorted in ascending order (each citation is a non-negative integer) of a researcher,
// write a function to compute the researcher's h-index.
// According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each,
// and the other N − h papers have no more than h citations each."

class Solution {
    public int hIndex(int[] citations) {
        
        int result = 0;
        int position = 1;
        for(int i = citations.length - 1; i >= 0; i--){
            if(citations[i] >= position){
                result = position;
            }else{
                break;
            }
            position++;
        }
        
        return result;
    }
}

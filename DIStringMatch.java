// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
// s[i] == 'I' if perm[i] < perm[i + 1], and
// s[i] == 'D' if perm[i] > perm[i + 1].
// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

class Solution {
    public int[] diStringMatch(String S) {
        
        int I = 0;
        int D = S.length();
        int[] result = new int[D + 1];
        
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'I'){
                result[i] = I;
                I++;
            }else{
                result[i] = D;
                D--;
            }
        }
        
        result[result.length - 1] = D;
        return result;
        
    }
}

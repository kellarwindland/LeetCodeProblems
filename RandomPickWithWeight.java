// DISCLAIMER: I had help from leetcode user logan138, I was not aware of the Arrays.binarySearch method which was a great help
// Given an array w of positive integers, where w[i] describes the weight of index i,
// write a function pickIndex which randomly picks an index in proportion to its weight.

class Solution {

    private double[] prob;
    
    public Solution(int[] w) {
        
        this.prob = new double[w.length];
        
        double sum = 0;
        for(int i = 0; i < w.length; i++){
            sum += w[i];
        }
        
        for(int i = 0; i < w.length; i++){
            if(i != 0){
                w[i] += w[i - 1];
            }
            prob[i] = w[i]/sum; 
        }
    }
    
    public int pickIndex() {
        return  Math.abs(Arrays.binarySearch(this.prob, Math.random())) - 1;
    }
}

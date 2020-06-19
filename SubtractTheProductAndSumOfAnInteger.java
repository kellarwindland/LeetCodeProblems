// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

class Solution {
    public int subtractProductAndSum(int n) {
        
        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
        
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
            prod *= list.get(i);
        }
        
        return prod - sum;
    }
}

// Given the array prices where prices[i] is the price of the ith item in a shop.
// There is a special discount for items in the shop, if you buy the ith item,
// then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise,
// you will not receive any discount at all.
// Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.

class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[] result = new int[prices.length];
        
        
        for(int i = 0; i < prices.length; i++){
            boolean check = true;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    check = false;
                    break;
                }
            }
            
            if(check){
                result[i] = prices[i];
            }
            
        }
        
        return result;
        
    }
}

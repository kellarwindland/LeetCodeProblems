//You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1),
// and an infinite number of boxes numbered from 1 to infinity.
// Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number.
// For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
// Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < (highLimit - lowLimit + 1); i++){

            int index = lowLimit + i;
            int temp = 0;
            
            while(index > 0){
                temp += index % 10;
                index /= 10;
            }
            
            
            if(map.get(temp) == null){
                map.put(temp, 1);
            }else{
                int value = map.get(temp);
                value++;
                map.put(temp, value);
            }
            
            
        }
        
        int result = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
            if(result < entry.getValue()){
                result = entry.getValue();
            }
            
        }
        
        return result;
    }
}

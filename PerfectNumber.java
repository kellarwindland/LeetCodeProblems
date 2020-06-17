// We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
// Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num == 0 || num == 1){
            return false;
        }
        int sum = 0;
        int pre = 0;
        for(int i = 1; i < num / 2; i++){
            int holder = num;
            int temp = num % i;
            holder /= i;
            if(i < holder){
                if(temp == 0 ){
                    sum += i;
                    if(holder != num){
                        sum += holder;
                        //System.out.println("This: " + i + " and " + holder);
                    }
                    pre = holder;
                    //System.out.println(holder);
                }
            }else{
                break;
            }
        }
        
        return sum == num;
    }
}

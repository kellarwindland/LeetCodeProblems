// A self-dividing number is a number that is divisible by every digit it contains.
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// Also, a self-dividing number is not allowed to contain the digit zero.
// Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = left; i <= right; i++){
            int temp = i;
            boolean check = true;
            
            while(temp > 0 && check){
                int rem = temp % 10;
                if(rem == 0 || i % rem != 0){
                    check = false;
                }
                temp /= 10;
            }
            
            if(check){
                result.add(i);
            }
        }
        
        return result;
    }
}

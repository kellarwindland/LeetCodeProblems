// You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
// At the beginning of the game, you start with an empty record. You are given a list of strings ops,
// where ops[i] is the ith operation you must apply to the record and is one of the following:
// An integer x - Record a new score of x.
// "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
// "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
// "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
// Return the sum of all the scores on the record.

class Solution {
    public int calPoints(String[] ops) {
        
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(String temp : ops){
            if(isNumeric(temp)){
                stack.push(Integer.parseInt(temp));
            }else if (temp.equals("C")){
                stack.pop();
            }else if (temp.equals("D")){
                stack.push(stack.peek() * 2);
            }else{
                int first = stack.pop();
                int second = stack.pop();
                int total = first + second;
                stack.push(second);
                stack.push(first);
                stack.push(total);
            }
        }
        
        for(int temp : stack){
            result += temp;
        }
        
        return result;
    }
    
    
    public static boolean isNumeric(String str) { 
      try {  
        Integer.parseInt(str);  
        return true;
      } catch(NumberFormatException e){  
        return false;  
      }  
    }
}

// Given an array of unique integers salary where salary[i] is the salary of the employee i.
// Return the average salary of employees excluding the minimum and maximum salary.

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        
        double result = 0;
        for(int i = 1; i < salary.length - 1; i++){
            result += salary[i];
        }
        
        return result / (salary.length - 2);
    }
}

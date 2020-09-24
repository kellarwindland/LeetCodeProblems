// You are given a data structure of employee information, which includes the employee's unique id, their importance value and their direct subordinates' id.
//For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively.
// Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []].
// Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
// Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all their subordinates.

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        int result = 0;
        
        if(employees.size() == 0){
            return result;
        }
        
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(id);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                int tempID = queue.poll();
                
                Employee tempEmp = employees.get(0);
                
                for(int k = 0; k < employees.size(); k++){
                    tempEmp = employees.get(k);
                    if(tempEmp.id == tempID){
                        break;
                    }    
                }
                
                result += tempEmp.importance;
                List<Integer> tempList = tempEmp.subordinates;
                
                for(int j = 0; j < tempList.size(); j++){
                    queue.add(tempList.get(j));
                }
            }
        }
        
        return result;
        
    }
}

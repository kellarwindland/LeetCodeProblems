// There are 8 prison cells in a row, and each cell is either occupied or vacant.
// Each day, whether the cell is occupied or vacant changes according to the following rules:
// If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
// Otherwise, it becomes vacant.
// (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
// We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.
// Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        
        int[] temp = cells.clone();
        N = (N - 1) % 14 + 1;
        
        for(int i = 1; i <= N; i++){
            for(int j = 1; j < cells.length - 1; j++){
                if(cells[j - 1] == cells[j + 1]){
                    temp[j] = 1;
                }else{
                    temp[j] = 0;
                }
            }
            
            if(i == 1){
                temp[0] = 0;
                temp[temp.length - 1] = 0;
            }
            
            cells = temp.clone();
        }
        
        return cells;
    }
}

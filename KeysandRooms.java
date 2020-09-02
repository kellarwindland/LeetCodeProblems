// There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 
// Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length. 
// A key rooms[i][j] = v opens the room with number v.
// Initially, all the rooms start locked (except for room 0). 
// You can walk back and forth between rooms freely.
// Return true if and only if you can enter every room.

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        for(int i = 0; i < rooms.size(); i++){
            if(i == 0 || set.contains(i)){
                dfs(rooms.get(i), rooms);
            }
        }
        if(set.size() == rooms.size() - 1){
            return true;
        }else{
            return false;
        }
    }
    
    void dfs(List<Integer> list, List<List<Integer>> rooms){
        
        for(int i = 0; i < list.size(); i++){
            if(!set.contains(list.get(i)) && list.get(i) != 0){
                set.add(list.get(i));
                dfs(rooms.get(list.get(i)), rooms);
            }
        }
    }
}

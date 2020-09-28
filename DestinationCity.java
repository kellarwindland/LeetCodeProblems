// You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi.
// Return the destination city, that is, the city without any path outgoing to another city.
// It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> all = new HashSet<>();
        for(int i = 0; i < paths.size(); i++){
            all.add(paths.get(i).get(0));
        }
        String result = "";
        for(int i = 0; i < paths.size(); i++){
            if(!all.contains(paths.get(i).get(1))){
                result = paths.get(i).get(1);
                break;
            }
        }
        return result;
    }
}

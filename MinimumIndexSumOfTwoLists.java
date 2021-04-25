// Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
// You need to help them find out their common interest with the least list index sum.
// If there is a choice tie between answers, output all of them with no order requirement.
// You could assume there always exists an answer.
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int index = 0;
        
        for(String temp : list1){
            map.put(temp, index);
            index++;
        }
        
        index = 0;
        int min = Integer.MAX_VALUE;
        for(String temp : list2){
            if(map.containsKey(temp)){
                int potentialMin = index + map.get(temp);
                map2.put(temp, potentialMin);
                if(potentialMin < min){
                    min = potentialMin;
                }
            }
            
            index++;
        }
                
        List<String> resultList = new ArrayList<>();
        
        for(Map.Entry<String,Integer> entry : map2.entrySet()){
            if(entry.getValue() == min){
                resultList.add(entry.getKey());
            }
        }
        
        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);
        return result;
    }
}

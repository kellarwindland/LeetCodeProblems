// Given words first and second, consider occurrences in some text of the form "first second third", 
// where second comes immediately after first, and third comes immediately after second.

For each such occurrence, add "third" to the answer, and return the answer.

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        
        List<String> resultList = new ArrayList<>();
        
        String[] split = text.split("\\s+");
        
        for(int i = 0; i < split.length - 2; i++){
            if(split[i].equals(first) && split[i + 1].equals(second)){
                resultList.add(split[i + 2]);
            }
        }
     
        return resultList.toArray(new String[resultList.size()]); 
    }
}

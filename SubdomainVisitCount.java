// A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com",
// at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain
// like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
// Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space,
// followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
//We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains,
// (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < cpdomains.length; i++){
            String[] arr = cpdomains[i].split(" ");
            String sub = arr[1];
            while(sub.indexOf(".") >= 0){
                if(map.containsKey(sub)){
                    int count = map.get(sub);
                    count += Integer.parseInt(arr[0]);
                    map.put(sub, count);
                }else{
                    map.put(sub, Integer.parseInt(arr[0]));
                }
                sub = sub.substring(sub.indexOf(".") + 1);
            }
            
            if(map.containsKey(sub)){
                    int count = map.get(sub);
                    count += Integer.parseInt(arr[0]);
                    map.put(sub, count);
                }else{
                    map.put(sub, Integer.parseInt(arr[0]));
            }
        }
        
        List<String> list = new ArrayList<String>();
        
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            String key = set.getKey();
            int value = set.getValue();
            String resultStr = value + " " + key;
            list.add(resultStr);
        }
        
        return list;
    }
}

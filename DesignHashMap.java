// Design a HashMap without using any built-in hash table libraries.
// Implement the MyHashMap class:
// MyHashMap() initializes the object with an empty map.
// void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
// int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
// void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

class MyHashMap {

    List<Integer> values;
    List<Integer> keys;
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        values = new ArrayList<>();
        keys = new ArrayList<>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
            
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i) == key){
                keys.remove(i);
                values.remove(i);
            }
        }
        
        keys.add(key);
        values.add(value);
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i) == key){
                return values.get(i);
            }
        }
        
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
                
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i) == key){
                values.remove(i);
                keys.remove(i);
                break;
            }
        }
        
    }
}

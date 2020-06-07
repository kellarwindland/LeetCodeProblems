// Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
// where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h.
// Write an algorithm to reconstruct the queue.

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        List<int[]> resultList = new ArrayList<>();
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]));
        
        for(int i = 0; i < people.length; i++){
            resultList.add(people[i][1], people[i]);
        }
        
        return resultList.toArray(people); 
    }
}

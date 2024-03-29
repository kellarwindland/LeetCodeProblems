// You are given an array rectangles where rectangles[i] = [li, wi] represents the ith rectangle of length li and width wi.
// You can cut the ith rectangle to form a square with a side length of k if both k <= li and k <= wi. 
// For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.
// Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.
// Return the number of rectangles that can make a square with a side length of maxLen.

class Solution {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
     
        val map = mutableMapOf<Int, Int>()
        
        rectangles.forEach {
            val min = Math.min(it[0], it[1])
            if (map.containsKey(min)) {
                var temp = map[min]!!
                temp++
                map[min] = temp
            } else {
                map[min] = 1
            }
        }
        
        var largest = 0
        map.forEach {
            if (it.key > largest) {
                largest = it.key
            }
        }
        
        return map[largest]!!
        
    }
}

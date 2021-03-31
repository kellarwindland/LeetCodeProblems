// Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Implement KthLargest class:
// KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
// int add(int val) Returns the element representing the kth largest element in the stream.

class KthLargest {

    int kth;
    List<Integer> list;
    
    public KthLargest(int k, int[] nums) {
        kth = k;
        list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - kth);
    }
}

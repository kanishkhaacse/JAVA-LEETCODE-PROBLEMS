import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k)
     {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) 
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(freqMap::get));

        for (int key : freqMap.keySet()) 
        {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}

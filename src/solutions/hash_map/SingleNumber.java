package solutions.hash_map;

import solutions.Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code SingleNumber} class finds the unique number in an array
 * where every other number appears twice.
 * <p>
 * Link: <a href="https://leetcode.com/problems/single-number/description">
 * https://leetcode.com/problems/single-number/description</a>
 */
public class SingleNumber implements Solution {

    public int singleNumber(int[] nums) {
        // Initialize hashmap to store index and its value
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterates entirety of array
        for(int i =0; i < nums.length; i++){
            // Scans the array for any number that was repeated twice
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        // Iterates entirety of the map to find the key where the value 1 is located in
        for(Map.Entry<Integer, Integer> sub : map.entrySet()){
            // Retrieves key from the map
            int key = sub.getKey();
            // Retrieves value from the map
            int value = sub.getValue();
            // Returns key value if the retrieved value was not repeated
            if(value == 1){
                return key;
            }
        }
        // Default return
        return -1;
    }


    @Override
    public void run() {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Input: [4, 1, 2, 1, 2]");
        System.out.println("Single Number: " + singleNumber(nums));
    }
}

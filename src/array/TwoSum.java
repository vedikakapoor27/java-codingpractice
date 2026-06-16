package array;
import java.util.*;

public class TwoSum {//using Hash map

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Find the number needed to reach target
            int diff = target - nums[i];

            // Check if that number already exists in map
            if (map.containsKey(diff)) {
                // If yes, return indices
                return new int[]{map.get(diff), i};
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no answer found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode219 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(Leetcode217.containsDuplicate(nums));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Initialize a HashMap to store the value and its most recent index
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
            // Use getOrDefault to find the last index of the current number.
            // If it's not found, use a default value that is far away from any possible index.
            int lastIndex = indexMap.getOrDefault(nums[currentIndex], -1000000);

            // Check if the current index and the last index of the same value are within k steps
            if (currentIndex - lastIndex <= k) {
                // If so, we found a nearby duplicate and return true.
                return true;
            }

            // Update the map with the current value and its index for the next iteration checks
            indexMap.put(nums[currentIndex], currentIndex);
        }

        // If no nearby duplicates are found, return false.
        return false;
    }
}

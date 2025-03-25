import java.util.Arrays;

public class LinearSearchVSBinarySearch {

    // Method to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with its correct position
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // First missing positive number
            }
        }

        return n + 1; // If all are in place, return the next positive number
    }

    // Method to perform Binary Search for a target number
    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array before Binary Search
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Return index if found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; // Example list of integers
        int target = 4; // Target value to search

        // Finding first missing positive integer
        int missingNumber = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missingNumber);

        // Finding the index of target using Binary Search
        int targetIndex = binarySearch(nums, target);
        System.out.println("Index of target " + target + " after sorting: " + targetIndex);
    }
}

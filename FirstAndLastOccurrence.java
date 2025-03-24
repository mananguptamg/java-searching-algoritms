public class FirstAndLastOccurrence {

    // Method to find the first occurrence of the target element
    public static int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;  // Store the index
                right = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }
        return result;
    }

    // Method to find the last occurrence of the target element
    public static int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;  // Store the index
                left = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }
        return result;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5}; // Sorted array
        int target = 2; // Target element to search

        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);

        // Display result
        System.out.println("First occurrence of " + target + ": " + first);
        System.out.println("Last occurrence of " + target + ": " + last);
    }
}

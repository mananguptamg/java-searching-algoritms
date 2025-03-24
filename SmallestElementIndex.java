public class SmallestElementIndex {

    // Method to find the index of the smallest element in a rotated sorted array
    public static int findMinIndex(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, the min is on the right side
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the min is on the left side (including mid)
                right = mid;
            }
        }
        return left; // 'left' now points to the smallest element index
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array

        int index = findMinIndex(nums);

        // Display result
        System.out.println("Index of the smallest element: " + index);
    }
}

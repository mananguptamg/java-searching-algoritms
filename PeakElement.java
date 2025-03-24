public class PeakElement {

    // Method to find a peak element using Binary Search
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the next, then the peak is on the left side
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Move leftward
            } else {
                left = mid + 1; // Move rightward
            }
        }

        // 'left' (or 'right') will point to a peak element
        return left;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] number = {1, 3, 20, 4, 1, 0}; // Example array

        int peakIndex = findPeakElement(number);

        // Display result
        System.out.println("Index of a peak element: " + peakIndex);
        System.out.println("Peak element: " + number[peakIndex]);
    }
}

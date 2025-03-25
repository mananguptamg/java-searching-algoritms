public class TargetIn2DMatrix {

    // Method to search for a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Handle empty matrix case
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = (rows * cols) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D indices

            if (midValue == target) {
                return true; // Target found
            } else if (midValue < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return false; // Target not found
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 10, 12},
                {14, 16, 20}
        };
        int target = 10; // Target value to search

        boolean result = searchMatrix(matrix, target);

        // Display result
        System.out.println("Target found: " + result);
    }
}

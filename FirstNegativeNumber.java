public class FirstNegativeNumber {

    public static int findFirstNegativeIndex(int[] numbers) {
        // Iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) { // Check if the current element is negative
                return i; // Return the index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 3, -4, 7, -2, 10};

        // Find the first negative number index
        int index = findFirstNegativeIndex(numbers);

        // Display result
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}

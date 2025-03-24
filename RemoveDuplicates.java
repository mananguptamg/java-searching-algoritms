import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>();

        // Iterate through the string
        for (char ch : input.toCharArray()) {
            if (!seenCharacters.contains(ch)) {
                seenCharacters.add(ch);
                result.append(ch);
            }
        }
        return result.toString(); // Convert StringBuilder to String
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        // Removing duplicates
        String outputString = removeDuplicates(inputString);

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + outputString);
    }
}

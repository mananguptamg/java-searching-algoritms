import java.io.*;

public class CountingOccurrences {

    // Method to count occurrences of a specific word in a file
    public static int countWordOccurrences(String filePath, String targetWord) {
        int count = 0;

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words (case insensitive)
                String[] words = line.toLowerCase().split("\\W+"); // Splitting by non-word characters
                for (String word : words) {
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }

            // Close the resources
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return count; // Return the total count
    }

    // Main method to test the function
    public static void main(String[] args) {
        String filePath = "SampleTextFile.txt";
        String targetWord = "Java"; // Word to search for

        // Count occurrences of the word
        int wordCount = countWordOccurrences(filePath, targetWord);

        // Display result
        System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
    }
}

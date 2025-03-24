public class WordSearch {

    // Method to find the first sentence containing the specific word
    public static String findSentenceWithWord(String[] sentences, String word) {
        // Iterate through the array of sentences
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) { // Case-insensitive search
                return sentence; // Return the first sentence that contains the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    // Main method to test the function
    public static void main(String[] args) {
        String[] sentences = {
                "Java is a powerful programming language.",
                "Java is a high level language",
                "Java follows OOPS principal",
                "Java supports multithreading"
        };

        String word = "level"; // Word to search for

        // Find the first sentence containing the word
        String result = findSentenceWithWord(sentences, word);

        // Display result
        System.out.println("Sentence containing '" + word + "': " + result);
    }
}

public class ConcatenateStrings {

    // Method to concatenate strings using StringBuffer
    public static String concatenateStrings(String[] strings) {
        StringBuffer result = new StringBuffer();

        // Append each string to StringBuffer
        for (String str : strings) {
            result.append(str);
        }

        return result.toString(); // Convert StringBuffer to String
    }

    // Main method to test the function
    public static void main(String[] args) {
        String[] words = {"My", " ", "Name", " ", "is", " ", "Manan"};

        // Concatenating strings
        String concatenatedString = concatenateStrings(words);

        // Display the result
        System.out.println("Concatenated String: " + concatenatedString);
    }
}


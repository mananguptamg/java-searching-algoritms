public class ComparisonStringBufferStringBuilder {

    // Method to test performance of StringBuffer
    public static long timeOfStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        long startTime = System.nanoTime(); // Start time

        for (int i = 0; i < 10; i++) {
            buffer.append("hello");
        }

        long endTime = System.nanoTime(); // End time
        return endTime - startTime; // Return time taken
    }

    // Method to test performance of StringBuilder
    public static long timeOfStringBuilder() {
        StringBuilder builder = new StringBuilder();
        long startTime = System.nanoTime(); // Start time

        for (int i = 0; i < 10; i++) {
            builder.append("hello");
        }

        long endTime = System.nanoTime(); // End time
        return endTime - startTime; // Return time taken
    }

    // Main method to compare performance
    public static void main(String[] args) {
        // Measure execution times
        long stringbuilderTime = timeOfStringBuilder();
        long stringbufferTime = timeOfStringBuffer();

        // Display results
        System.out.println("Time taken by StringBuilder: " + stringbuilderTime + " nanoseconds");
        System.out.println("Time taken by StringBuffer: " + stringbufferTime + " nanoseconds");
    }
}

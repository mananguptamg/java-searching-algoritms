import java.io.*;

public class FileReading {

    // Method to read a file line by line
    public static void readFile(String filePath) {
        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // Read and print each line until the end of the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Main method to test file reading
    public static void main(String[] args) {
        String filePath = "SampleTextFile.txt";
        readFile(filePath);
    }
}

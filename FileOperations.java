import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, this is a test file!";

        // Write to file
        writeToFile(filename, content);
        
        // Read from file
        readFromFile(filename);
    }

    // Method to write to a file with exception handling 
    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Successfully written to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read from a file with exception handling 
    public static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

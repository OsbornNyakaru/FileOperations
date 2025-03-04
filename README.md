# File Operations in Java

## Overview
This Java program demonstrates basic file operations, including:
- Creating and writing to a text file.
- Reading content from the file.
- Handling exceptions gracefully.

## Features
- Writes a predefined message to a text file (`example.txt`).
- Reads and prints the content of the file.
- Uses `BufferedWriter` and `BufferedReader` for efficient file handling.
- Implements exception handling to manage file errors.

## How It Works
### **1. Writing to a File**
- The `writeToFile(String filename, String content)` method writes the provided content into a file.
- If the file does not exist, it is created automatically.
- Uses `BufferedWriter` to write text efficiently.

### **2. Reading from a File**
- The `readFromFile(String filename)` method reads and prints the content of the file line by line.
- Uses `BufferedReader` to handle file reading efficiently.

## How to Compile and Run
Ensure you have Java installed, then:

1. **Compile the program:**
   ```sh
   javac FileOperations.java
   ```
2. **Run the program:**
   ```sh
   java FileOperations
   ```

## Example Output
```
Successfully written to file: example.txt
Reading from file:
Hello, this is a test file!
```

## Notes
- The file `example.txt` is created in the same directory as the program.
- Modify the `content` variable to change the text written to the file.

## License
This project is open-source and free to use under the MIT License.


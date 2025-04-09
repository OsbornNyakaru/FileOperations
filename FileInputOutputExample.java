
import java.io.*;
import java.util.Scanner;
public class FileInputOutputExample {
	public static void printToFile() {
		PrintWriter outputStream = null;
		   try
		   	{
		       outputStream =  new PrintWriter(new FileOutputStream("student.txt"));
		   	}
		   catch(FileNotFoundException e)
		   	{
		       System.out.println("Error opening the file student.txt."  + e.getMessage());
		       System.exit(0);
		   	}
		   System.out.println("Enter three lines of text:");
		   String line = null;
		   int count;
		   Scanner input = new Scanner(System.in);
		   try {
				for (count = 1; count <= 3; count++)
				{
				
					line = input.nextLine();
					outputStream.println(count + " " + line);
				}
				outputStream.close();
				System.out.println("... written to student.txt.");
		   	} finally {
			   input.close();
		   	}
		   }
	public static void readFile() {
		String line = null;
		System.out.println("The Student file contains: ");
		FileReader s = null;
		BufferedReader studentInStream = null;
			try {
				s = new FileReader("student.txt");
				studentInStream = new BufferedReader(s);
				while(true) {
					line = studentInStream.readLine();
					if (line == null) {
						break;
					}
					System.out.println(line);
				}
				studentInStream.close();

			}
			catch (IOException e) {
				System.out.println("Error reading the file student.txt."  + e.getMessage());
			    System.exit(0);
			}
			
		}	
	public static void main(String [] args) {
		printToFile();
		readFile();
		
	}
}

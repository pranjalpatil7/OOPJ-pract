import java.io.FileReader;
import java.io.BufferedReader;
class Main 
{
public static void main(String[] args) 
{
	// Creates an array of character
	char[] array = new char[100];
	try 
	{
	// Creates a FileReader
	FileReader file = new FileReader("input.txt");
	//Creates BufferReader
	BufferedReader input = new BufferedReader(file);
	// Reads character
	input.read(array);
	System.out.println("Data in the file: ");
	System.out.println(array);
	// Closes the reader
	input.close();
	}
	catch(Exception e) 
	{
	e.getStackTrace();
	}
}
}


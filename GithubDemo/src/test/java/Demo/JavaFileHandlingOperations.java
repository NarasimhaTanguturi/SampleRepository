package Demo;

import java.io.File;
import java.io.IOException;

public class JavaFileHandlingOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File javaFile = new File("D:\\javaFile.txt");
		
		if(javaFile.exists()) {
			System.out.println("The new file is " + javaFile.getName() + " created Successfully.");
			System.out.println("The length of the file is " + javaFile.length());
			System.out.println("The absolute path is " + javaFile.getAbsolutePath());
			System.out.println("can the file be read? - " + javaFile.canRead());
			System.out.println("can the file be written? - " + javaFile.canWrite());
			System.out.println("can the file be executed? - " + javaFile.canExecute());
			
		}
		else
		{
			System.out.println(javaFile.getName() + " is already exists");
		}
	
	}
}

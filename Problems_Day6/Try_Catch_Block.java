package Problems_Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Try_Catch_Block {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 =new File("C:\\Usereehir\\Downloads\\hellos\\M.txt");
		try {
			BufferedReader br1= new BufferedReader(new FileReader(f1));
			String line=br1.readLine();
		    while(line!=null) {
		    	System.out.println("File Content "+line);
		    	line=br1.readLine();
		    	
		    }
		   br1.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found error");
		}
		catch(IOException e) {
			System.out.println("IO error occured while reading the file");
		}
		finally {
			System.out.println("this is the complete excution");
		}
		
	}
}
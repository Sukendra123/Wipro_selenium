package program_day7;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;//to handle errors


public class File_Handling {
	public static void main(String[] args) {
		//new file obj creation
		//file path
		/*try {
		File myObj = new File("myfile.txt");
		if(myObj.createNewFile()) {
			System.out.println("file created:"+myObj.getName());
		}else {
			System.out.println("file already exits");
		}
		}catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
			
		}
		//to write in file use
		try {
		FileWriter mywriter = new FileWriter("myfile.txt");
		mywriter.write("file in java adding sukendra reddy ");
		mywriter.close();
		System.out.println("sucessfully written the file");
		}catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}*/
		try {
			File myObj = new File("myfile.txt");
			Scanner myreader = new Scanner(myObj);
			while(myreader.hasNextLine()) {
				String data = myreader.nextLine();
				System.out.println("data");
			}
			myreader.close();
			
			
		}catch(FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
			
		}
		///Getting a file information
		File myObj = new File("myfile.txt");
		if(myObj.exists()) {
			System.out.println("File Name:" +myObj.getName());
			System.out.println("absolutepath: "+myObj.getAbsolutePath());
			System.out.println("Writable:"+myObj.canWrite());
			System.out.println("readable:"+myObj.canRead());
			System.out.println("File size in bytes:"+myObj.length());
		}
		else {
			System.out.println("error occured");
		}
		/// Deleting a file and directory same almost just change path
		File myObj = new File("myfile.txt");
		if(myObj.delete()) {
			System.out.println("file deleted sucess"+myObj.getName());
		}else {
			System.out.println("file occured error");
		}
		
		
	}

}

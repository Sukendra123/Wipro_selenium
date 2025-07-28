package Problems_Day6;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\Sukendra Reddy\\Desktop\\xmlfile");
		
		
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			String line = br1.readLine();
			while(line!=null) {
				System.out.println("CSV File Contents: "+line);
                line = br1.readLine();
			}
			br1.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println("An IO Error occured while reading the file");			
		}
		finally {
			System.out.println("Program successfully executed");
		}

	}

}
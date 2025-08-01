package program_day11;

import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\CollecFilepract.txt");
		int ch;
		while((ch=reader.read())!=-1)
		{
			System.out.println((char) ch);
		}
		
		}	
	}


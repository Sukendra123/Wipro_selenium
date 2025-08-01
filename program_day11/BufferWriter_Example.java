package program_day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferWriter_Example {
	public static void main(String[] args) throws IOException {
		BufferedWriter br=new BufferedWriter(new FileWriter("\"C:\\CollecFilepract\\File1.txt\"",true));
		{
			br.write("This is written using FileWriter");
			//br.newLine();
			br.close();
			System.out.println("Written Successfully");
		}
		
	}
}


package program_day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReguEx_NumPattern {
	
	public static void main(String[] args) {
		//Sample array data creation
		String[] strings= {
				"123456",
				"3.45",
				"asdef",
				"123sdf4",
				"-345",
				"400"
		};
		// regural expression for validate
		String numberPattern = "[-+]?\\d*\\.?\\d+";
		Pattern regex = Pattern.compile(numberPattern);
		
		for(String str:strings) {
			Matcher matcher = regex.matcher(str);
			if(matcher.matches()) {
				System.out.println(str + "is a valid no.");
			}else {
				System.out.println(str +"is a invalid no.");
			}
		}
	}

}

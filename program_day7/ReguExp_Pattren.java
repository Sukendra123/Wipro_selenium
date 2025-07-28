package program_day7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReguExp_Pattren {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("javacoading21",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("learn java coading is fun");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		}else {
			System.out.println("match not found");
		}
	}

}

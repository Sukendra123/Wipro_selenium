package program_day7;
import java.util.Map;
import java.util.HashMap;
import  java.util.Scanner;
public class HashMap_Ass {
	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while (true){
			System.out.println("choose an option:");
			System.out.println("1.Add Student");
			System.out.println("2. get Student Score");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("enter stud name : ");
				String name = sc.nextLine();
				System.out.println("enter stud score : ");
				int score = sc.nextInt();
				studentScores.put(name, score);
				break;
				
			case 2:
				System.out.println("enter stud name  to get score: ");
				String studentname = sc.nextLine();
				Integer studentScore = studentScores.get(studentname);
				if(studentScore != null){
				   System.out.println("score for " +studentname+ "is" +studentScore);
				} else {
					
					System.out.println("student not found");
					
				}
				break;
			case 3:
				System.out.println("exiting");
				sc.close();
			
			default:
				System.out.println("invalid choice pls try again");
			
			
		}
	}
	}
}

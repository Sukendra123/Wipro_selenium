package program_day7;

public class Error_Handling {
	//try-catch block
	public static void main(String[] args) {
		try {
		int[] myNums = {1,2,3,4,5};
		
		System.out.println(myNums[7]);//Wrong index no.
		}catch(Exception e) {
			System.out.println("Something went Wrong : Wrong index number");
		}
		finally {
			System.out.println("Try- catch is finished and cleaned");
		}
	}

}

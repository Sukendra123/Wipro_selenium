package Problems_Day6;

public class ExceptionProblemsBasic {
	/*public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }*/
	 public static void main(String[] args) {
	        try {
	            int[] arr = new int[5];
	            arr[10] = 100;  // ArrayIndexOutOfBoundsException
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Error");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index error: " + e);
	        } catch (Exception e) {
	            System.out.println("Some other exception: " + e);
	        }
	    }
}

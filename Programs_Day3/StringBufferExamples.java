package Programs_Day3;

public class StringBufferExamples {
	 public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("Hello");

	        sb.append(" World");
	        sb.insert(6, "Java ");
	        sb.replace(0, 5, "Hi");
	        sb.reverse();

	        System.out.println("Result: " + sb);
	    }


}

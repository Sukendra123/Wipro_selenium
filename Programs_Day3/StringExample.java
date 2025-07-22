package Programs_Day3;

public class StringExample {
	public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring (5 to 15): " + str.substring(5, 16));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
    }


}

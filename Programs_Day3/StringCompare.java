package Programs_Day3;

public class StringCompare {
	public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2));       // true (same object in string pool)
        System.out.println("s1 == s3: " + (s1 == s3));       // false (different object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (compares value)
    }


}

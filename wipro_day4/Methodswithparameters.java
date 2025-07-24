package wipro_day4;
public class Methodswithparameters {
/* static void greetings(String fname) {
	System.out.println("Welcome to methods with parameters");
	System.out.println("Hello  " +fname);
}*/
	//passing multiple parameters
	
	 static void greetings(String fname,int age) {
			System.out.println("Welcome to methods with parameters");
			System.out.println("Hello  " +fname+ " your age is" +age);
		}
 static void wish() {
	 System.out.println("How are u");
 }
 public static void main(String[] args) {
	 greetings("sukendra",23);
	 greetings("suki",24);
	 greetings("Reddy", 25);
	 wish();
 }


}

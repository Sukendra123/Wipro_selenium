package Programs_Day3;

class vehicle1 {
	void start() {
		System.out.println("Vehicle is running");
	}

}
class car extends vehicle1{
	void drive() {
		System.out.println("car id driving");
	}
}
public class Methods{
	public static void main(String[] args) {
		car c = new car();
		c.start();
		c.drive();
	}
}

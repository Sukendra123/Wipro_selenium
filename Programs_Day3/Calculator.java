package Programs_Day3;

public class Calculator {
	class Calculator1{
		public int add(int a, int b) {
			return a+b;
		}
		public double add(double a, double b) {
			return a+b;
		}
	}
	public static void main(String[] args) {
		Calculator c =new Calculator();
		Calculator1 c1 =c.new Calculator1();
		System.out.println("Sum of integer:" +c1.add(10,12));
		System.out.println("Sum of double:" +c1.add(10,2.2));
	}

}

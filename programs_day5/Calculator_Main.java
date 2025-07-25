package programs_day5;



public class Calculator_Main{
	public static void main(String[] args) {
		Calculator_Interface ci = new Calculator_Operation();
		System.out.println(ci.operation(4.0,5.0));
		System.out.println(ci.subtract(5.0, 2.0));
		System.out.println(Calculator_Interface.multiply(5,8));
	}
}

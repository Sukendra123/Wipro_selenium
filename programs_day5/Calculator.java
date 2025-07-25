package programs_day5;



interface Calculator_Interface{
	double operation(double a,double b);
	default double subtract(double a,double b) {
		return a-b;
	}
	static double multiply(double a,double b) {
		return a*b;
	}
	
}

class Calculator_Operation implements Calculator_Interface{
	public double operation(double a,double b) {
		return a+b;
	}
	
}

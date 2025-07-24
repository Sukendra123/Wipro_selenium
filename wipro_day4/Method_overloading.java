package wipro_day4;

public class Method_overloading {
	static int addMethod(int x,int y) {
		return x+y;
	}
	static double addmethod(double x,double y) {
		return x+y;
	}

public static void main(String[] args) {
	int mytotal =addMethod(45,55);
	double mytotal2 =addmethod(45.0,55.0);
	System.out.println(mytotal);
	System.out.println(mytotal2);
}
}

package wipro_day4;

public class Return_Program {
	static int myadd(int a,int b) {
		return a+b;
	}
	static String myname(String fname ,String lname) {
		return fname+lname;
	}
	public static void main(String[] args) {
		
		//System.out.println(myadd(4,7));
		int c = myadd(12,45);
		System.out.println(c);
		System.out.println(myname("sukendra  ","Gunreddy"));
	}
}


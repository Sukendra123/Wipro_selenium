package Javaprograms;

public class Arrays {
	public static void main(String[] args) {
		//arrays
		//string data array
		String[] cars = {"tesla","suzuki","audi","benz","hyundai","rolls"};
		// changing of data through index
		
		cars[0] = "opel";
		System.out.println(cars[0]);
		
		//finding the length
		System.out.println(cars.length);
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		String car = cars[2];
		/*System.out.println(car);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);*/
		
		// number data arrayint[] price = {23,45,34,54};
		
		
		
	}

}


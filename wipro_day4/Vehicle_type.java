package wipro_day4;

abstract class Vehicle_type {
	abstract void speed();
	abstract void brand();
}
	class Car extends Vehicle_type{
		void speed() {
			System.out.println("speed of car is minimum");
		}
		void brand() {
			System.out.println("brand is rolls");
		}
	}
		class Bike extends Vehicle_type{
			void speed() {
				System.out.println("speed of the vehicle is 400");
				
			}
			void brand() {
				System.out.println("Brand is suzuki");
			}	
	}
	



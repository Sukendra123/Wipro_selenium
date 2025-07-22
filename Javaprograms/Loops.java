package Javaprograms;

public class Loops {
	public static void main(String[] args) {
		//for loop
				//for(int i =0;i<10;i++) {//change i+i+4
					//System.out.println(i);
					
				//}
				System.out.println("hello");
				//nested loop is a loop inside loop
				for(int i =0;i<=4;i++) {
					System.out.println("outer loop "+i);
					for(int j=1;j<=5;j++) {
						System.out.println("inner loop: "+j);
						
						
						//for each loop
						
						String[] sports = {"cricket","tennis","basketball","hockey"};
						for(String a : sports) {
							System.out.println(a);
						}
					}
					//breaking loop
					
					
					for(int k =0;k<10;k++) {
						if(k==5) {
							break;
						}
						System.out.println(k);
					}
					
					// continue..........
					
					for(int k =0;k<10;k++) {
						if(k==5) {
							System.out.println("i am reached" +k);
							continue;
						}
						System.out.println(k);
					}
				}
				// terminary operator
				//a > b → 10 > 20 → false

//               So it returns b → 20
				int a = 10, b = 20;
				int max = (a > b) ? a : b;
				System.out.println("Max: " + max);
				
			}
			
			

		}

package looping;

public class Example1 {
	
	public static void main(String[] args) {
		
	
		/*
		 * //for loop syntax //for(initialization; condition; increment/decrement){
		 * //statement or code to be executed //}
		 */	
	for(int a =0; a <=3;a++) {
		System.out.println("a");
		
	}
	
	
	//Nestedloop
	/*
	 * for(initialization; condition; increment/decrement){ for(initialization;
	 * condition; increment/decrement){ //statement or code to be executed } }
	 */
	for(int a =0; a <=2;a++) {
		for(int b=0;b<=2;b++) 
			
		System.out.println("a :"+a+"b :"+b);
	}

}
	}
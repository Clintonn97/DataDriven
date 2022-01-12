package conditionalstatement;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();
		if (a>0) {
			System.out.println("number is positive");
			
					
		
		}
		else if(a<0) {
			System.out.println("number is negative");
		}
		
		else {
			System.out.println("number is zerooo");
		}
	}

}

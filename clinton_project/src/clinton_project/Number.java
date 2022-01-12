package clinton_project;

import java.util.Scanner;

public class Number
{
	
	public  boolean checkEqaul() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		boolean c=a==b;
		return c;
	}
	
	public void forLoop(int init, int cond) {
		for(int i=init;i<=cond;i++) {
			System.out.println(i);
		}
	}
	
     public static void main(String []args) {
    
    	 Number obj= new Number();
    	 System.out.println(obj.checkEqaul());
     
    	 obj.forLoop(1, 20);
    	 obj.forLoop(21, 30);
     
     }
}

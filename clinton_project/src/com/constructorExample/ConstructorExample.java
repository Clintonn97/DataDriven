package com.constructorExample;

public class ConstructorExample {
	
		public void functionShow() {
			System.out.println("In show");
		}
	
	//	public ConstructorExample() {
	//		System.out.println("Default constructor");
	//	}		
		public ConstructorExample(int a) {
			System.out.println(a);
		}
		
		public void display() {
			System.out.println("In dsiplay");
		}

		public static void main(String[] args) {
			
		//	ConstructorExample obj= new ConstructorExample();
			//obj.display();
			ConstructorExample obj1= new ConstructorExample(10);
		}
}

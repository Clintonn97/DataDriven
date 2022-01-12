package Methodoverloading;

public class B extends  A{
	
	public static void main(String[] args) {
		
		B obj= new B();
		obj.setempName("clinton");
		
		System.out.println(obj.getempName());
		
	
		obj.setEmpId(111111);
		
		System.out.println(obj.getEmpId());
		
		
		
	}
	
}

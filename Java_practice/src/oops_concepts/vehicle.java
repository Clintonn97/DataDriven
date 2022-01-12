package oops_concepts;

public class vehicle {

	
	int vehicleid= 329676;
	String model ="maruthi";
	public void vehicleclass() {
		System.out.println("vehicle id :"+vehicleid);
	    System.out.println("model name :"+model);
	}

}

class Car extends vehicle{
	 
	 int carnumber= 55555;
	 String carcolor ="red";
     public void Carclass() {
	     System.out.println("carnumber :"+carnumber);
		 System.out.println("carcolour :"+carcolor);
		 
     }
     
}

class Testmain{
	
	public static void main(String args[]) {
		
		Car obj = new Car();
		obj.vehicleclass();
		obj.Carclass();
	}

}
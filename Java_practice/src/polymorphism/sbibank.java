package polymorphism;

public class sbibank {
        
	public void bankinterest() {
		
		System.out.println("bankinterest in the year 2020 is 8percentage");
	}
}
   class sbi2021 extends sbibank {
	   
	   public void bankinterest() {
		   
		   System.out.println("bankinterest in the year 2021 is 10percentage");
		   
		   
	   }
	   class sbi2022 extends sbi2021 {
		   
		   public void bankinterest() {
			   
			   System.out.println("bankinterest in the year 2022 is 12percentage");
			   
		   }
			   
	   
	  public static void main(String[] args) {
		
		  sbibank obj = new sbibank();
		  obj.bankinterest();
	}
	   
	   }}
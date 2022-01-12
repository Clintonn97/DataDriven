package abstraction;

public class abstractclass extends animal {
	public static void main(String[] args) {
		abstractclass obj = new abstractclass();
		obj.barking();
		obj.eating();
		
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}

}
  abstract class animal{
	  public abstract void eating();
	  public void barking(){
		  System.out.println("barking");
		  
	  }
	 
 }
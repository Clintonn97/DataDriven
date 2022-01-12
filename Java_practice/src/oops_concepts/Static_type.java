package oops_concepts;

public class Static_type {
	
	
	public static void methods() {
		
		System.out.println("hello!");
		methods();
	}
    public void laptop() {
    	
    	System.out.println("macbookpro!");
    }


public static void main(String[] args) {
	
	methods();
	Static_type obj = new Static_type();
	obj.laptop();
}


}
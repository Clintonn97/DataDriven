package polymorphism;



public class overloadingdemo {
	
	public void calse(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println("sum :"+sum);
	}
	public void calse(int a,int b) {
		int sub = a-b;
		System.out.println("sub :"+sub);
	}
	public void calse(double a,double b) {
		double div = a/b;
		System.out.println("div:"+div);
	}
	public void calse(int a) {
		int multiple = a*a;
		System.out.println("multiple :"+multiple);
	}
	
	
	
	public static void main(String[] args) {
		
		overloadingdemo obj =new overloadingdemo();
		obj.calse(7,8, 7);
		obj.calse(1, 4);
		obj.calse(7, 7.9);
		obj.calse(15);
		
		
		
	}
	
/*	public static void main(String[] args) {
		overloadingdemo obj= new overloadingdemo();
		obj.calse(12, 13, 14);
		obj.calse(11, 12);
		obj.calse(15.2, 13.8);
		obj.calse(79);*/
	}
	
   


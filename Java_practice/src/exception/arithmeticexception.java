package exception;

public class arithmeticexception {
	
	
		public void sum(){
		throw new ArithmeticException("Exception");
		}
		public static void main(String[] args) {
		arithmeticexception obj = new arithmeticexception ();
		obj.sum();
		}
		

	}





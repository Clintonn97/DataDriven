package exception;

public class customexception extends Exception {
	
		   String message;
		   customexception(String str) {
		      message = str;
		   }
		   public String toString() {
		      return ("Custom Exception Occurred : " + message);
		   }
		}
		 class MainException {
		   public static void main(String args[]) {
		      try {
		         throw new customexception ("This is a custom message");
		      } catch(customexception e) {
		         System.out.println(e);
		      }
		   }
		}



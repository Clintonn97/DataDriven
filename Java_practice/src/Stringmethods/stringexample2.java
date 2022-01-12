package Stringmethods;

public class stringexample2 {

	
		public static void main(String args[]) {

		//Method name = Substring,Subsequence
		//Syntax = variable.substring(index value)
		//usage = will crop the string based on index value
		//Syntax = variable.subsquence(index value)
		//usage = will crop the string based on index value

		String text = "sampleprogram";
		 
		String str1 = text.substring(3);
		String str2 = text.substring(3, 8);
		CharSequence str3 = text.subSequence(3, 8);



		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		}

		}
		

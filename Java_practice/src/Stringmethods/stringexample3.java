package Stringmethods;

public class stringexample3 {
	
	
	public static void main(String args[]) {

	//method name = touppercase
	//syntax = stringvariable.toUpperCase();
	//usage = to convert smaller case to uppercase

	//method name = tolowercase
	//syntax = stringvariable.toLowerCase();
	//usage = to convert smaller case to Lowercase

	String text = "sampleprogram";
	 
	String str1 = text.toUpperCase();
	String str2 = str1.toLowerCase();
	//to convert string char (tocharArray)
	//syntax char[] variable = String.tocharArray();
	//usage =to convert a string to char 
	char[] charArray = text.toCharArray();
	System.out.println(charArray[3]);

	System.out.println(str1);
	System.out.println(str2);
	for(int i=0; i<charArray.length; i++) {

	System.out.println(charArray[i] + " ");
	}
	}}




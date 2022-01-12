package Stringmethods;

public class stringexamples {

	public static void main(String[] args) {
		String name ="Happychristmas";
		int number =34;
		
		
		//return charact  er value of particular index
		System.out.println(name.charAt(2));
		
		
	    //return string length
		System.out.println(name.length());
		
		//check the equality of given string
		System.out.println(name.equals("Happychristmas"));
		
		//check the equality of given string without case sensitivity
		System.out.println(name.equalsIgnoreCase("Happychristmas"));
		
		//check the string if empty or not
		System.out.println(name.isEmpty());
		
		//return true or false based on the given value present or not
		System.out.println(name.contains("c"));
		
		//take a particular portion of the string
		System.out.println(name.substring(1));
		
		//take a particular portion of the string begin and end index
		System.out.println(name.substring(1,4));
		
		//append the string to the given string
		System.out.println(name.concat("clinton"));
		
		//replace the existing character with given character
		System.out.println(name.replace("H","h"));
		
		//find the position of character string
		System.out.println(name.indexOf("c"));
		
		//find the character specified from index position
		System.out.println(name.indexOf("s",4));
		
		//trim will remove the white space before and after
		System.out.println(name.trim());
		
		//convert the given datatype to string
		System.out.println(String.valueOf(number));
		
		//convert upperclass to lowerclass
		String upperclass ="CLINTONNAYAGAM";
		System.out.println(upperclass.toLowerCase());
				
		//convert lowerclass to upperclass
				
		String lowerclass = "clintonnayagam";
		System.out.println(lowerclass.toUpperCase());
		
		//return a join string with given delimater
		
		System.out.println(String.join("-", "hello","welcome","byw"));
		System.out.println(String.join("/", "hello","welcome","byw"));
		
		
		
		
		
		
	
	}

}

package Stringmethods;

public class stringfirstclass {

	public static void main(String args[]) {
	//syntax=variable.split(basedon
	//usage=split the string based on symbol r space r letters)
	String text = " aaa bbb ccc aaa bbb ccc aaa bbb ccc";
	String text1="sdfsdf,tytyuty,tyutyu,tuiui,q4q34,67567";
	 
	String[] str1 = text.split(" ");
	String[] str2 = text.split("bbb");

	for(int i=0; i<str1.length; i++) {

	System.out.println(str1[i]);
	}

	System.out.println();

	for(int i=0; i<str2.length; i++) {

	System.out.println(str2[i]);
	}
	String[] str3=text1.split(",");
	for(int i =0;i<str3.length;i++){
	System.out.println(str3[i]);

	}

	}

	}


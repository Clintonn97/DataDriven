package stringbuffer;

public class stringbuffer {

	public static void main(String[] args) {
		//using string method
		//string is immutable
		String name = "arya";
		System.out.println(name.concat("kumar"));
		System.out.println(name);
		
		//using stringbuffer method
		//string is mutable
		
		StringBuffer obj = new StringBuffer("Clinton");
		System.out.println(obj.append("nayagam"));
		System.out.println(obj);

	}

}

package practiceoverloading;

public class practicesession {
	
	private String studentname;
	private int rollnumber;
	private int age;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		practicesession obj = new practicesession();
		obj.setAge(78);
		obj.setRollnumber(122);
		obj.setStudentname("clinton");
		System.out.println("age:"+obj.getAge());
		System.out.println("RollNumber:"+obj.getRollnumber());
		System.out.println("StudentName:"+obj.getStudentname());
	}
	

}

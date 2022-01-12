package Methodoverloading;

public class A {
	
		private int empId;
		private String empName;
		
		
		public int getEmpId() {
			return empId;
		}
		
		public void setEmpId(int id) {
			empId=id;
			
			//empId=101
		}
		public String getempName() {
			return empName;
			
		}
		public void setempName(String Name) {
			empName = Name;
		}
		
}

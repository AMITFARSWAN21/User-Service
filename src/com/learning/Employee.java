package com.learning;

public class Employee {
	  private String name;
	    private int empId;
	    private String position;
	    
	    public Employee(String name, int empId, String position) {
	        this. name= name;
	        this.empId = empId ;
	        this.position = position;
	       
	    }
	    
	     
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
	  

}

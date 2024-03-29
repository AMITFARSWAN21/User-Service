package com.learning;

public class Customer {
	
	    private String username;
	    private String password;
	    private String name;
	    private String address;
	    private String phoneNumber;
	    
	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Customer(String username, String password, String name, String address, String phoneNumber) {
	        this.username = username;
	        this.password = password;
	        this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	    }

}

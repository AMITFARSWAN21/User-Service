package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankmanagementSystem {
	private List<Customer>Customers;
    private List<Employee>Employees;
    

    public BankmanagementSystem() {
    	Customers= new ArrayList<>();
    	Employees = new ArrayList<>();
        
    }
	public List<Customer> getCustomers() {
		return Customers;
	}
public void setCustomers(List<Customer> customers) {
		Customers = customers;
	}


	public List<Employee> getEmployee() {
		return Employees;
	}


	public void setEmployee(List<Employee> employee) {
		Employees = employee;
	}
	 public void deposit(double amount) {
	        if (amount > 0) {
	            double balance = 0;
				double totalInflow = balance + amount;
	            if (totalInflow <= 100000) {
	                balance = totalInflow;
	                System.out.println("Deposit successful. New balance: $" + balance);
	            } else {
	                System.out.println("Cash inflow limit exceeded. Deposit cannot be processed.");
	            }
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive amount.");
	        }
	    }
	 
	 public void withdraw(double amount) {
	        double balance = 0;
			if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: $" + balance);
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
	        } else {
	            System.out.println("Insufficient funds. Withdrawal amount exceeds the current balance.");
	        }
	    }
	 
	 public static class BankSystemSystem {
		    private static Map<String, Customer> customers = new HashMap<>();
		    private static Map<String, Employee> employees = new HashMap<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Select Portal:");
		            System.out.println("1. Customer Registration");
		            System.out.println("2. Customer Login");
		            System.out.println("3. Employee Login");
		            System.out.println("4. Admin Login");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (choice) {
		                case 1:
		                    customerRegistration();
		                    break;
		                case 2:
		                    customerLogin();
		                    break;
		                case 3:
		                    employeeLogin();
		                    break;
		                case 4:
		                    adminLogin();
		                    break;
		                case 5:
		                    System.out.println("Exiting...");
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }

		    private static void customerRegistration() {
		        
		    }

		    private static void customerLogin() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter username: ");
		        String username = scanner.nextLine();

		        System.out.print("Enter password: ");
		        String password = scanner.nextLine();

		        if (customers.containsKey(username) && customers.get(username).getPassword().equals(password)) {
		            System.out.println("Customer login successful.");
		            customerMenu(customers.get(username));
		        } else {
		            System.out.println("Invalid credentials. Please try again.");
		        }
		    }

		    private static void employeeLogin() {
		       
		    }

		    private static void adminLogin() {
		       
		    

		    private static void customerMenu(Customer customer) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nCustomer Menu:");
		            System.out.println("1. View Profile");
		            System.out.println("2. Deposit Money");
		            System.out.println("3. Withdraw Money");
		            System.out.println("4. Calculate and Add Interest");
		            System.out.println("5. Logout");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); 
		         /*   switch (choice) {
		                case 1:
		                    System.out.println(customer.getProfile());
		                    break;
		                case 2:
		                    System.out.print("Enter the deposit amount: $");
		                    double depositAmount = scanner.nextDouble();
		                    customer.deposit(depositAmount);
		                    break;
		                case 3:
		                    System.out.print("Enter the withdrawal amount: $");
		                    double withdrawalAmount = scanner.nextDouble();
		                    customer.withdraw(withdrawalAmount);
		                    break;
		                case 4:
		                    customer.calculateAndAddInterest();
		                    break;
		                case 5:
		                    System.out.println */




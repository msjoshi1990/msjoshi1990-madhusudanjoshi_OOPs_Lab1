package main;
import java.util.Scanner;

import employee.Employee;
import service.CredentialService;

public class Application {
	
	

	
	public static void main(String[] args) {
		
	    int option;
	    String deparment = "";
	    Scanner input = new Scanner(System.in);
	    
	    Employee emp = new Employee("Madhusudan", "Joshi");
	    
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		option = input.nextInt();
		
		switch (option) {
		case 1:
			deparment= "tech";
			break;
		case 2:
			deparment= "admin";
			break;
		case 3:
			deparment= "hr";
			break;
		case 4:
			deparment= "legal";
			break;
		default:
			System.out.println("Please enter a valid option");
			break;
		}
		
		if(deparment != "") 
		{
			CredentialService service = new CredentialService();
			emp.setEmail(service.generateEmail(deparment, emp));
			emp.setPassword(service.generatePassword());
			service.showCredentials(emp);
		}
		
		input.close();
	}

}

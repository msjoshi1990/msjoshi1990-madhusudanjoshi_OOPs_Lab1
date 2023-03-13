package service;
import java.util.Random;
import employee.Employee;

public class CredentialService {
	
	String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small =   "abcdefghijklmnopqrstuvwxyz";
	String number = "012345678";
	String special = "\"[$&+,:;=?@#|'<>.-^*()%!]\"";

    String companyName = "greatlearning";
	
	Random random = new Random();
	
	public String generatePassword() 
	{
		String password = "";
		
		password += capital.charAt(random.nextInt(capital.length()));
		password += capital.charAt(random.nextInt(capital.length()));
		password += small.charAt(random.nextInt(capital.length()));
		password += small.charAt(random.nextInt(capital.length()));
		password += number.charAt(random.nextInt(number.length()));
		password += number.charAt(random.nextInt(number.length()));
		password += special.charAt(random.nextInt(special.length()));
		password += special.charAt(random.nextInt(special.length()));

		
		return password;
	}
	
	public String generateEmail(String department, Employee employee) 
	{
        String email = employee.getFirstName() + employee.getLastName() + "@" + department + "." + companyName + ".com" ;
		
		return email;
	}

	public void showCredentials(Employee employee) 
	{
		String welcomeMsg = "Dear " + employee.getFirstName() + " Your generated credential are as follows";
		
		System.out.println(welcomeMsg);
		
		String email = "Email --->  " + employee.getEmail();
		
		System.out.println(email);
		
        String password = "Password --->  " + employee.getPassword();
		
		System.out.println(password);
		
	}
}

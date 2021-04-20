import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUser {
	public static void main(String[] args) {
		System.out.println("Welcome User Registration Validation Program");
		
		Scanner sc = new Scanner(System.in);
		String regex = "^[A-Z][a-z][a-z]+$";
	
		System.out.println("Enter Your First_name: ");
		String fname = sc.nextLine();
		Pattern pat = Pattern.compile(regex);
		
		if(pat.matcher(fname).matches())
			System.out.println("Valid FirstName");
		else
			System.out.println("Invalid FirstName");
		
		System.out.println("Enter Your Last_name: ");
		String lname = sc.nextLine();
		pat = Pattern.compile(regex);
		
		if(pat.matcher(lname).matches())
			System.out.println("Valid LastName");
		else
			System.out.println("Invalid LastName");
		
		System.out.println("Enter Your Email: ");
		String email = sc.nextLine();
		validateEmail(email);
		
	}
	
	public static void validateEmail(String email) {
		 String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9.]+$";
		Pattern pat = Pattern.compile(regex);
		if(pat.matcher(email).matches())
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}
}

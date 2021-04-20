import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUser {
	public static void main(String[] args) {
		System.out.println("Welcome User Registration Validation Program");
		
		Scanner sc = new Scanner(System.in);
		String regex = "^[A-Z][a-z][a-z]+$";
		
		System.out.println("Enter Your name: ");
		String fname = sc.nextLine();
		Pattern pat = Pattern.compile(regex);
		
		if(pat.matcher(fname).matches())
			System.out.println("Name is Valid");
		else
			System.out.println("Name is Invalid");
	}
}

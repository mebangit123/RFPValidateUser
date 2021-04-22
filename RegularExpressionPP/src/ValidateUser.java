import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {
	public static void main(String[] args) {
		System.out.println("Welcome User Registration Validation Program");
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Your First_name: ");
		String fname = sc.nextLine();
		System.out.println("Enter Your Last_name: ");
		String lname = sc.nextLine();
		System.out.println("Enter Your Email: ");
		String email = sc.nextLine();
		System.out.println("Enter Your PhoneNo: ");
		String phoneNo = sc.nextLine();
		System.out.println("Enter Your Password: ");
		String password = sc.nextLine();
		
		//sc.close();
		
		User user = new User(fname, lname,email,phoneNo,password);
		
		System.out.println(validateUser(user));
	}
	
	public static boolean validateUser(User user) {
		
		boolean valid = false;
		String fnameRegex = "^[A-Z][a-z][a-z]+$";
		String lnameRegex = "^[A-Z][a-z][a-z]+$";
		String emailRegex = "^[0-9a-zA-Z]+([._-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
		String phoneRegex = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
		String passRegex = "^[0-9a-zA-Z]{8,}$";
		
		Pattern pat = Pattern.compile(fnameRegex);
		Matcher m = pat.matcher(user.getFname());
		
		pat = Pattern.compile(lnameRegex);
		Matcher m1 = pat.matcher(user.getLname());
		
		pat = Pattern.compile(phoneRegex);
		Matcher m3 = pat.matcher(user.getPhoneNo());
		
		pat = Pattern.compile(emailRegex);
		Matcher m2 = pat.matcher(user.getEmail());
		
		pat = Pattern.compile(passRegex);
		Matcher m4 = pat.matcher(user.getPassword());
		
		if(m.matches() & m1.matches() & m2.matches() & m3.matches() & m4.matches() ) {
		valid = true;	
		}
	return valid;
			
	}
}

class User {
	private String fname;
	private String lname;
	private String email;
	private String phoneNo;
	private String password;
	
	public User(String fname, String lname, String email, String phoneNo, String password) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

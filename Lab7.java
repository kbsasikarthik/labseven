
// this program checks for validity of user input data using Regular Expression patterns.
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		
		while(!isValid) {
			// get user name. First letter should be uppercase followed by 29 alphabets(lowercase).
			// Cannot accept anything other than alphabets
			String userName = Validator.getRegExString (sc,"Enter your name  (Must start with uppercase letter) : ","[A-Z][a-z ]{1,29}");
			
			// get user email. Format - youremail(5-30 alphanueric)@5-7aplhanumeric.2aplhanumeric
			// Example - myemailaddress@service.com
			String userEmail =Validator.getRegExString(sc, "Enter your email address : ", "[a-zA-Z0-9]{5,30}[@][a-zA-Z0-9]{5,10}[\\.][a-zA-Z0-9]{2,3}"); 
			
			// get user phone number in xxx-xxx-xxxx format
			String userPhoneNumber =Validator.getRegExString(sc, "Enter your phone number in XXX-XXX-XXXX format  : ", "[0-9]{3}[-][0-9]{3}[-][0-9]{4}"); 
			
			//get date from user in dd/mm/yyyy format
			String date =Validator.getRegExString(sc, "Enter the date in dd/mm/yyyy format : ", "(0[1-9]|1[0-9]|2[0-9]|3[0-1])[/](0[1-9]|1[0-2])[/]([1-2][0-9][0-9][0-9])"); 
			
			// get HTML tag from the user in <> or </> format
			String htmlTag = Validator.htmlTagValidation(sc, "Enter HTML tags : ", "<(\"[^\"]*\"|'[^']*'|[^'\">])*>");
			// print all the user input data
			System.out.println("\nYou entered:\n~~~ ~~~~~~~~");
			System.out.println("Name - "+userName);
			System.out.println("Email - "+userEmail);
			System.out.println("Phone Number - "+userPhoneNumber);
			System.out.println("Date - "+date);
			System.out.println("HTML tag - "+htmlTag);

			// check if the user wants to continue or not. The user can enter Y or Y to continue
			isValid = Validator.continueOrNot(sc,"Do you want to continue(y/n) ? ","[yY]");
			
			sc.nextLine();
		}
		// print concluding message
		System.out.println("Goodbye!");
		sc.close();
	}
}

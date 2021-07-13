package UserRegistrationUsingJunit;

import java.util.regex.Pattern;

public class UserValidationImpl implements UserValidationService {

	public boolean checkEmailAddress(String emailAddress) {
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
		checkValid(isMatched);
		return isMatched;
	}
	public boolean checkLastName(String lastName) {
		boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
		checkValid(isMatched);
		return isMatched;
	}
	public boolean checkFirstName(String firstName) 
	{
		boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
		checkValid(isMatched);
		return isMatched;
	}
	public boolean checkPhoneNumber(String phoneNumber) {
		boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(phoneNumber).matches();
		checkValid(isMatched);
		return isMatched;
	}
	@Override
	public boolean checkPassword(String password) {
		boolean isMatched = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#$%^&-+@]).{8,}").matcher(password).matches(); 
		checkValid(isMatched);
		return isMatched;
	}
	private void checkValid(boolean isMatched) 
	{
		if(isMatched)
		{
			System.out.println("valid");
		}
		else 
		{
			System.out.println("invalid");
		}
	}
}

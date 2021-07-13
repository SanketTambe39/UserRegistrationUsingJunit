package UserRegistrationUsingJunit;

public interface UserValidationService {

	public boolean checkFirstName(String firstName);
	public boolean checkLastName(String lastName);
	public boolean checkEmailAddress(String emailAddress);
	public boolean checkPhoneNumber(String phoneNumber);
	public boolean checkPassword(String password);
	

}

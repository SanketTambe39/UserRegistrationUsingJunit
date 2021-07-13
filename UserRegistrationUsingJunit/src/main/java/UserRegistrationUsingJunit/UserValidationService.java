package UserRegistrationUsingJunit;

public interface UserValidationService {

	public void checkFirstName(String firstName);
	public void checkLastName(String lastName);
	public void checkEmailAddress(String emailAddress);
	public void checkPhoneNumber(String phoneNumber);
	public void checkPassword(String password);
	

}

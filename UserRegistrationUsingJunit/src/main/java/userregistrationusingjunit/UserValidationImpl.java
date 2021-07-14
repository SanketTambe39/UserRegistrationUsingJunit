package userregistrationusingjunit;

import java.util.regex.Pattern;

import userregistrationusingjunit.UserRegitrationException.ExceptionType;

public class UserValidationImpl implements UserValidationService {

	public boolean checkEmailAddress(String emailAddress) {
		try {
			if (emailAddress.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "Email cannot be empty");
			}
			boolean isMatched = Pattern.compile(
					"^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?")
					.matcher(emailAddress).matches();
			checkValid(isMatched);
			return isMatched;
		} catch (NullPointerException e) {
			throw new UserRegitrationException(ExceptionType.ENTERED_NULL, "email cannot be empty");
		}
	}

	public boolean checkLastName(String lastName) {
		try {
			if (lastName.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "First name cannot be empty");
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
			checkValid(isMatched);
			return isMatched;
		} catch (NullPointerException e) {
			throw new UserRegitrationException(ExceptionType.ENTERED_NULL, "First name cannot be empty");
		}
	}

	public boolean checkFirstName(String firstName) {
		try {
			if (firstName.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "First name cannot be empty");
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
			checkValid(isMatched);
			return isMatched;
		} catch (NullPointerException e) {
			throw new UserRegitrationException(ExceptionType.ENTERED_NULL, "First name cannot be empty");
		}
	}

	public boolean checkPhoneNumber(String phoneNumber) {
		try {
			if (phoneNumber.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "Phone Number cannot be empty");
			}
			boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(phoneNumber).matches();
			checkValid(isMatched);
			return isMatched;
		} catch (NullPointerException e) {
			throw new UserRegitrationException(ExceptionType.ENTERED_NULL, "Phone number cannot be empty");
		}
	}

	@Override
	public boolean checkPassword(String password) {
		try {
			if (password.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "Password cannot be empty");
			}
			boolean isMatched = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#$%^&-+@]).{8,}")
					.matcher(password).matches();
			checkValid(isMatched);
			return isMatched;
		} catch (NullPointerException e) {
			throw new UserRegitrationException(ExceptionType.ENTERED_NULL, "Password cannot be empty");
		}
	}

	private void checkValid(boolean isMatched) {
		if (isMatched) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}

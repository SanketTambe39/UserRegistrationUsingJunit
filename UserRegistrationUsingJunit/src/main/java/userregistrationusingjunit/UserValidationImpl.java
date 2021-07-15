package userregistrationusingjunit;

import java.util.regex.Pattern;

import userregistrationusingjunit.UserRegitrationException.ExceptionType;

public class UserValidationImpl implements UserValidationService {
	// lambda function to check user entered values
	ValidationFunction checkValues = (patterns, value) -> Pattern.compile(patterns).matcher(value).matches();

	public boolean checkEmailAddress(String emailAddress) {
		try {
			if (emailAddress.length() == 0) {
				throw new UserRegitrationException(ExceptionType.ENTERED_EMPTY, "Email cannot be empty");
			}
			String pattern = "^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?";
			boolean isMatched = checkValues.validate(pattern, emailAddress);
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
			String pattern = "^[A-Z]{1}[a-z]{3,}$";
			boolean isMatched = checkValues.validate(pattern, lastName);
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
			String pattern = "^[A-Z]{1}[a-z]{3,}$";
			boolean isMatched = checkValues.validate(pattern, firstName);
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
			String pattern = "^[0-9]{2}[ ][0-9]{10}$";
			boolean isMatched = checkValues.validate(pattern, phoneNumber);
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
			String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#$%^&-+@]).{8,}";
			boolean isMatched = checkValues.validate(pattern, password);
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

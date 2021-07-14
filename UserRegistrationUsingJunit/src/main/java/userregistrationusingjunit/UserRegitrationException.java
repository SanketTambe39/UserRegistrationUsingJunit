package userregistrationusingjunit;

public class UserRegitrationException extends RuntimeException {

	public enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	public ExceptionType type;

	public UserRegitrationException(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}	
}

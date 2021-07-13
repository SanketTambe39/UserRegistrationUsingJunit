package UserRegistrationUsingJunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserValidationImpl namevalidator = new UserValidationImpl();
	
	//checking condition for first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		Assert.assertTrue(namevalidator.checkFirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{
		Assert.assertFalse(namevalidator.checkFirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		Assert.assertFalse(namevalidator.checkFirstName("abcd"));			
	}
	//checking condition for first name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		Assert.assertTrue(namevalidator.checkFirstName("Abcd"));			
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		Assert.assertFalse(namevalidator.checkFirstName("Ab"));			
	}
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		Assert.assertFalse(namevalidator.checkFirstName("abcd"));			
	}	
	
}

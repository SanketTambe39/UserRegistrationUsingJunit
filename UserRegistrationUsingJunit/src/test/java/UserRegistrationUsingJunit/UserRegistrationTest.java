package UserRegistrationUsingJunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserValidationImpl validator = new UserValidationImpl();
	
	//checking condition for first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		Assert.assertTrue(validator.checkFirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkFirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkFirstName("abcd"));			
	}
	//checking condition for first name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		Assert.assertTrue(validator.checkLastName("Abcd"));			
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkLastName("Ab"));			
	}
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkLastName("abcd"));			
	}	
	//checking conditions for email
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue()
	{
		Assert.assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.co.in"));
	}
	@Test
	public void givenEmail_WithoutUserName_ShouldReturnFalse()
	{
		Assert.assertFalse(validator.checkEmailAddress("@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutDomainName_ShouldReturnFalse()
	{
		Assert.assertFalse(validator.checkEmailAddress("abc.xyzco.in"));
	}

	@Test
	public void givenEmail_WithoutDomain_ShouldReturnFalse()
	{
		Assert.assertFalse(validator.checkEmailAddress("abc.xyz@bridgelabz"));
	}

	@Test
	public void givenEmail_WithoutOptinalUserName_ShouldReturnTrue()
	{
		Assert.assertTrue(validator.checkEmailAddress("abc@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutOptinalDomain_ShouldReturnTrue()
	{
		Assert.assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.com"));
	}
}

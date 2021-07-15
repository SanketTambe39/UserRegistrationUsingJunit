package userregistrationusingjunit;

import org.junit.Assert;
import org.junit.Test;

import userregistrationusingjunit.UserRegitrationException.ExceptionType;
import userregistrationusingjunit.UserValidationImpl;

public class UserRegistrationTest {

	UserValidationImpl validator = new UserValidationImpl(); 

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkFirstName("Abcd"));
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkFirstName("Ab"));
	}
	
	@Test
	public void givenFirstName_WhenNumber_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkFirstName("a123"));			
	}

	@Test
	public void givenFirstName_WhenSpecialCharcters_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkFirstName("ab@c"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkFirstName("abcd"));
	}

	// checking condition for first name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkLastName("Abcd"));
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkLastName("Ab"));
	}

	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkLastName("abcd"));
	}
	
	@Test
	public void givenLastName_WhenNumber_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkLastName("ab12"));			
	}

	@Test
	public void givenLastName_WhenSpecialCharacter_ShouldReturnFalse() 
	{
		Assert.assertFalse(validator.checkLastName("abcd@"));			
	}

	// checking conditions for email
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutUserName_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkEmailAddress("@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutDomainName_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkEmailAddress("abc.xyzco.in"));
	}

	@Test
	public void givenEmail_WithoutDomain_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkEmailAddress("abc.xyz@bridgelabz"));
	}

	@Test
	public void givenEmail_WithoutOptinalUserName_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkEmailAddress("abc@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutOptinalDomain_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.com"));
	}

	// test cases to Check Password
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		Assert.assertTrue(validator.checkPassword("Abacd@12"));
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkPassword("Ab@12"));
	}

	@Test
	public void givenPassword_WithoutUpperCase_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkPassword("abacd@12"));
	}

	@Test
	public void givenPassword_WithoutLowerCase_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkPassword("ABACD@12"));
	}

	@Test
	public void givenPassword_WithoutNumeric_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkPassword("Abacd@aa"));
	}

	@Test
	public void givenPassword_WithoutSpecailCharacter_ShouldReturnFalse() {
		Assert.assertFalse(validator.checkPassword("Abacds12"));
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkFirstName(null);
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkFirstName("");
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenLastName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkLastName(null);
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkLastName("");
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenEmail_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkEmailAddress(null);
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkEmailAddress("");
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkPhoneNumber(null);
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkPhoneNumber("");
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPassword_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkPassword(null);
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkPassword("");
		}
		catch (UserRegitrationException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}

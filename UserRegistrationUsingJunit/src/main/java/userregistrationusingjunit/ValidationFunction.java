package userregistrationusingjunit;
/**
 * 
 * @author Sanket
 * Functional Interface for using the lamba
 */
@FunctionalInterface
public interface ValidationFunction {
	boolean validate(String pattern,String value);
} 

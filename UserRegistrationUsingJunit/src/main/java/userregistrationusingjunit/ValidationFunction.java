package userregistrationusingjunit;
@FunctionalInterface
public interface ValidationFunction {
	boolean validate(String pattern,String value);
}

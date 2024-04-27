package PasswordGenerator;

public class Alphabet {
	public static final String uppercase_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String lowercase_letters = "abcdefghijklmnopqrstuvwxyz";
	public static final String numbers = "1234567890";
	public static final String symbols = "!@#$%^&*()-_=+\\/~?";
	
	private final StringBuilder pool;


	public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
		
		pool = new StringBuilder();
		
		if (uppercaseIncluded) pool.append(uppercase_letters);
		
		if (lowercaseIncluded) pool.append(lowercase_letters);
		
		if (numbersIncluded) pool.append(numbers);
		
		if (specialCharactersIncluded) pool.append(symbols);
		
	}
	
	public String getAlphabet() {
		return pool.toString();
	}
}

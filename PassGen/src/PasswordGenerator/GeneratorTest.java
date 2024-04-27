package PasswordGenerator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class GeneratorTest {
	private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	private final Generator generator = new Generator(true,false,false,false);
//	private final Password generatedPassword = generator.GeneratePassword(4);
	
	@Test
	void test1() {
		assertEquals("Secret", password.toString());
	}

	@Test
	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), Alphabet.uppercase_letters);
	}

	@Test
	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.lowercase_letters + Alphabet.numbers + Alphabet.symbols);
	}
	
	@Test
	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.uppercase_letters);
	}
	
	@Test
	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
	}

}

package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_gamma.Application;
import test_gamma.FizzBuzz;

class FizzBuzzTest 
{

	@Test
	void test() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals(fizzBuzz.fizzOrBuzzNumber(3),"Fizz");	
		assertEquals(fizzBuzz.fizzOrBuzzNumber(23),"23");
		assertEquals(fizzBuzz.fizzOrBuzzNumber(60),"FizzBuzz");
		assertEquals(fizzBuzz.fizzOrBuzzNumber(5),"Buzz");
		assertEquals(Application.isInteger("34"),true);
		assertEquals(Application.isInteger("Gamma"),false);

	}

}

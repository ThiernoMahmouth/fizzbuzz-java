package test_gamma;

public class FizzBuzz implements IFizzBuzz
{

	@Override
	public String fizzOrBuzzNumber(int number)
	{
		if (isFizzNumber(number) && isBuzzNumber(number))
			return "FizzBuzz";
		else if (isBuzzNumber(number))
			return "Buzz";
		else if (isFizzNumber(number) )
			return "Fizz";
		else
			return Integer.toString(number);
	}
	
	@Override
	public boolean isFizzNumber(int number) 
	{
		return (number % 3 == 0) || (Integer.toString(number).contains("3"));
	}

	@Override
	public boolean isBuzzNumber(int number) 
	{
		return (number % 5 == 0) || (Integer.toString(number).contains("5"));
	}
	
}
	


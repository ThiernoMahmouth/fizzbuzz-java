package test_gamma;

import java.io.File;
import java.util.Scanner;

public class Application 
{
	public static void main(String[] args) 
	{
	    Scanner read;
		FizzBuzz fizzBuzz = new FizzBuzz();

	    int debut, fin;
		try 
		{
			read = new Scanner(new File("params.txt"));
			String first =read.next();
			String last = read.next();
			if (isInteger(first))
				debut = Integer.parseInt(first);
			else
				debut = 0;
			if (isInteger(last))
				fin = Integer.parseInt(last);
			else
				fin = 20;		
				
			for(int i= debut; i<= fin; i++)
			{
				System.out.println(fizzBuzz.fizzOrBuzzNumber(i));
			}					
		}
		catch (Exception e) 
		{
			System.out.println("Erreur avec le fichier!");
		}
	}
	
	public static boolean isInteger(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
}

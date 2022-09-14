//Jaxon Bauer

package assg1_bauerj21;

import java.util.Random;

import java.util.Scanner;

public class NumberGame 
{
	public static void main(String arg[])
	{
		int secret;
		Random generator = new Random();
		secret = generator.nextInt(101);
		
		System.out.print("I'm thinking of a number between 0 and 100. Take a guess: ");
		try (Scanner keyboard = new Scanner(System.in)) {
			int guess = keyboard.nextInt();
			
			while(guess != secret)
			{
				if(guess > secret)
				{
					System.out.println("The secret number is lower than the guessed value.");
					System.out.print("Guess again: ");
					guess = keyboard.nextInt();
				}
				else if(guess < secret)
				{
					System.out.println("The secret number is higher than the guessed value.");
					System.out.print("Guess again: ");
					guess = keyboard.nextInt();
				}
			}
		}
		
		System.out.println("You have guessed the number!");
		return;
	}
}

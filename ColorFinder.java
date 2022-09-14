//Jaxon Bauer

package assg1_bauerj21;

import java.util.Scanner;

public class ColorFinder 
{
	public static void main(String arg[])
	{
		String[] additivePrimary = {"red", "green", "blue"};
		String[] subtractivePrimary = {"magenta", "yellow", "cyan"};
		
		System.out.println("Please enter a sentence.");
		try (Scanner keyboard = new Scanner(System.in)) {
			String userInput = keyboard.nextLine();
			
			userInput = userInput.toLowerCase();
			
			if(userInput.contains(additivePrimary[0]) || userInput.contains(additivePrimary[1])
					|| userInput.contains(additivePrimary[2]))
			{
				System.out.println("Additive primary color found.");
			}
			else
			{
				System.out.println("No additive primary colors detected.");
			}
			if(userInput.contains(subtractivePrimary[0]) || userInput.contains(subtractivePrimary[1])
					|| userInput.contains(subtractivePrimary[2]))
			{
				System.out.println("Subtractive primary color found.");
			}
			else
			{
				System.out.println("No subtractive primary colors detected.");
			}
		}
	}
}

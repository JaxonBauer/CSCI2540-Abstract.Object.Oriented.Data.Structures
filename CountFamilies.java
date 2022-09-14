//Jaxon Bauer

package assg1_bauerj21;

import java.util.Scanner;

public class CountFamilies 
{
	public static void main(String arg[])
	{
		System.out.println("Please enter number of families: ");
		
		int numOfFamilies;
		
		int numOfFamiliesUnder = 0;
		
		int maximum = 0;
		
		try (Scanner keyboard = new Scanner(System.in)) {
			numOfFamilies = keyboard.nextInt();
			
			int[] table = new int[numOfFamilies];
			
			for(int i = 0; i < numOfFamilies; i++)
			{
				int highest = table[0];
				System.out.print("Please enter the income for family number " + (i + 1) + ": ");
				table[i] = keyboard.nextInt(); 
				System.out.print("\n");
				while(table[i] > highest)
				{
					highest = table[i];
					maximum = highest;
				}
			}
			System.out.println("The maximum income is: $" + maximum + "\n");
			System.out.println("The incomes of the families making under 10% of the maximum are: \n");
			
			for(int j = 0; j < numOfFamilies; j++)
			{
				if(table[j] < (0.1 * maximum))
				{
					System.out.println("Family #" + (j+1) + ": " + "$" + table[j]);
					numOfFamiliesUnder++;
				}
			}
		}
		System.out.println("For a total of: " + numOfFamiliesUnder + " families");
	}
}

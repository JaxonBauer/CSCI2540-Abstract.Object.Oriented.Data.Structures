/**
 * Jaxon Bauer
 * 
 * ExtendedCircleTest - 
 * 
 * Tests all of the methods used within the Point and ExtendedCircle classes.
 * 
 * Uses multiple test cases for each method, to show validity in multiple areas.
 */

package assg2_bauerj21;

public class ExtendedCircleTest 
{
	public static void main (String arg[])
	{
		/**
		 * List of points used for the Point class and methods included within.
		 */
		
		Point p1 = new Point(2,5);
		Point p2 = new Point(4,6);
		Point p3 = new Point(1,9);
		Point p4 = new Point(5,9);
		Point p5 = new Point(4,10);
		Point p6 = new Point(2,5);
		
		/**
		 * List of radii used for the ExtendedCircle class and methods included within.
		 * Includes points used above as the center points for the circles we are creating.
		 */
		
		ExtendedCircle r1 = new ExtendedCircle(4.2, p1);
		ExtendedCircle r2 = new ExtendedCircle(8.0, p2);
		ExtendedCircle r3 = new ExtendedCircle(2.3, p3);
		ExtendedCircle r4 = new ExtendedCircle(1.1, p4);
		ExtendedCircle r5 = new ExtendedCircle(7.6, p5);
		ExtendedCircle r6 = new ExtendedCircle(9.4, p6);
		ExtendedCircle r7 = new ExtendedCircle(9.4, p6);
		
		/**
		 * Shows how many points are created, and lists them  
		 */
		
		System.out.println("Number of points created: " + Point.getNumberOfPoints() + "\n");
		System.out.println("Here is a list of the points: \n");
		System.out.println(String.format("%s",p1));
		System.out.println(String.format("%s",p2));
		System.out.println(String.format("%s",p3));
		System.out.println(String.format("%s",p4));
		System.out.println(String.format("%s",p5));
		System.out.println(String.format("%s",p6) + "\n");
		
		/**
		 * Using the distance formula, we get the distance between two points and prints to the screen, 
		 * rounded up to two decimal places.
		 */
		
		System.out.println("Here are the distances from point to point (rounded to two decimal places):\n");
		System.out.println(String.format("The distance between %s and %s is: %.2f", p1, p2, p1.getDistance(p2)));
		System.out.println(String.format("The distance between %s and %s is: %.2f", p2, p3, p2.getDistance(p3)));
		System.out.println(String.format("The distance between %s and %s is: %.2f", p3, p4, p3.getDistance(p4)));
		System.out.println(String.format("The distance between %s and %s is: %.2f", p4, p5, p4.getDistance(p5)));
		System.out.println(String.format("The distance between %s and %s is: %.2f", p5, p6, p5.getDistance(p6)));
		
		/**
		 * Takes two points and compares them, seeing whether they are equal or not,
		 * returning true or false to the screen for the user.
		 * We are comparing every combination of points below.
		 */
		
		System.out.println("\nLet's see if these points are equal: \n");
		System.out.println(String.format("%s and %s are equal: %b", p1, p2, p1.equals(p2)));
		System.out.println(String.format("%s and %s are equal: %b", p1, p3, p1.equals(p3)));
		System.out.println(String.format("%s and %s are equal: %b", p1, p4, p1.equals(p4)));
		System.out.println(String.format("%s and %s are equal: %b", p1, p5, p1.equals(p5)));
		System.out.println(String.format("%s and %s are equal: %b", p1, p6, p1.equals(p6)));
		System.out.println(String.format("%s and %s are equal: %b", p2, p3, p2.equals(p3)));
		System.out.println(String.format("%s and %s are equal: %b", p2, p4, p2.equals(p4)));
		System.out.println(String.format("%s and %s are equal: %b", p2, p5, p2.equals(p5)));
		System.out.println(String.format("%s and %s are equal: %b", p2, p6, p2.equals(p6)));
		System.out.println(String.format("%s and %s are equal: %b", p3, p4, p3.equals(p4)));
		System.out.println(String.format("%s and %s are equal: %b", p3, p5, p3.equals(p5)));
		System.out.println(String.format("%s and %s are equal: %b", p3, p6, p3.equals(p6)));
		System.out.println(String.format("%s and %s are equal: %b", p4, p5, p4.equals(p5)));
		System.out.println(String.format("%s and %s are equal: %b", p4, p6, p4.equals(p6)));
		System.out.println(String.format("%s and %s are equal: %b", p5, p6, p5.equals(p6)));
		
		/**
		 * Used to take the radius and the center point of the circle and print it in the format method
		 * using toString()
		 */
		
		System.out.println("\nLet's add a radius now. The original points will now be the center of each circle.\n");
		System.out.println(String.format("Circle #1:\n" + r1 + "\n"));
		System.out.println(String.format("Circle #2:\n" + r2 + "\n"));
		System.out.println(String.format("Circle #3:\n" + r3 + "\n"));
		System.out.println(String.format("Circle #4:\n" + r4 + "\n"));
		System.out.println(String.format("Circle #5:\n" + r5 + "\n"));
		System.out.println(String.format("Circle #6:\n" + r6 + "\n"));
		
		/**
		 * Used to get the area of the circle given the radius.
		 */
		
		System.out.println("The area of each of the circles:\n");
		System.out.println(String.format("Circle #1: %.2f" , r1.compArea()));
		System.out.println(String.format("Circle #2: %.2f" , r2.compArea()));
		System.out.println(String.format("Circle #3: %.2f" , r3.compArea()));
		System.out.println(String.format("Circle #4: %.2f" , r4.compArea()));
		System.out.println(String.format("Circle #5: %.2f" , r5.compArea()));
		System.out.println(String.format("Circle #6: %.2f" , r6.compArea()) + "\n");
		
		/**
		 * Used to get the circumference of the circle, given the radius.
		 */
		
		System.out.println("The circumference of each of the circles:\n");
		System.out.println(String.format("Circle #1: %.2f" , r1.compCircumference()));
		System.out.println(String.format("Circle #2: %.2f" , r2.compCircumference()));
		System.out.println(String.format("Circle #3: %.2f" , r3.compCircumference()));
		System.out.println(String.format("Circle #4: %.2f" , r4.compCircumference()));
		System.out.println(String.format("Circle #5: %.2f" , r5.compCircumference()));
		System.out.println(String.format("Circle #6: %.2f" , r6.compCircumference()) + "\n");
		
		/**
		 * List of points specifically used for testing the positionToCircle case
		 */
		
		Point f1 = new Point(2,5);
		Point f2 = new Point(4,14);
		Point f3 = new Point(1,-9);
		
		/**
		 * Used to determine whether or not a given point is inside of, 
		 * outside of, or on the circle in question.
		 */
		
		System.out.println("Is the point inside of, on, or out of the given circle?");
		System.out.println("RESULTS: -1 means inside circle. 0 means on the circle. 1 means outside circle:\n");
		System.out.println("The point " + f1 + " with respect to circle r1: " + r1.positionToCircle(f1));
		System.out.println("The point " + f2 + " with respect to circle r2: " + r2.positionToCircle(f2));
		System.out.println("The point " + f3 + " with respect to circle r3: " + r3.positionToCircle(f3) + "\n");
		
		/**
		 * A list of x and y values that we are using to shift the circle.
		 */
		
		Point b1 = new Point(4,6);
		Point b2 = new Point(-3,-8);
		Point b3 = new Point(0,5);
		Point b4 = new Point(-5,0);
		
		/**
		 * Used to move the circle by x and y values that correspond
		 * to the x and y axes, while not changing the original circle.
		 */
		
		System.out.println("Given a circle, lets move the center without changing the size:\n");
		System.out.println(String.format("Circle #1's center shifted %s spots on the x-axis, and %s spots on the y-axis" , b1.x, b1.y) + ": " + r1.shift(b1.x, b1.y));
		System.out.println(String.format("Circle #2's center shifted %s spots on the x-axis, and %s spots on the y-axis" , b2.x, b2.y) + ": " + r2.shift(b2.x, b2.y));
		System.out.println(String.format("Circle #3's center shifted %s spots on the x-axis, and %s spots on the y-axis" , b3.x, b3.y) + ": " + r3.shift(b3.x, b3.y));
		System.out.println(String.format("Circle #4's center shifted %s spots on the x-axis, and %s spots on the y-axis" , b4.x, b4.y) + ": " + r4.shift(b4.x, b4.y) + "\n");
		
		/**
		 * Used to change the size of the radius, which in turn changes the size 
		 * of the circle completely, while not changing the original circle.
		 */
		
		System.out.println("After changing the size of the circles by random scalars, we get (rounded to the tenths place):\n");
		System.out.println(String.format("Scaling Circle #1 by 0.5, we get: %.2f" , r1.scale(0.5)));
		System.out.println(String.format("Scaling Circle #2 by 4.0, we get: %.2f" , r2.scale(4)));
		System.out.println(String.format("Scaling Circle #3 by 0.1, we get: %.2f" , r3.scale(0.1)));
		System.out.println(String.format("Scaling Circle #4 by 10.0, we get: %.2f" , r4.scale(10)));
		System.out.println(String.format("Scaling Circle #5 by 7.5, we get: %.2f" , r5.scale(7.5)));
		System.out.println(String.format("Scaling Circle #6 by 2.5, we get: %.2f" , r6.scale(2.3)) + "\n");
		
		/**
		 * Used to Check if two circles intersect each other
		 * at any given point.
		 */
		
		System.out.println("These circles will overlap (true/false):\n");
		System.out.println(String.format("Circle #1 will overlap Circle #2: " + r1.overlap(r2)));
		System.out.println(String.format("Circle #1 will overlap Circle #3: " + r1.overlap(r3)));
		System.out.println(String.format("Circle #1 will overlap Circle #4: " + r1.overlap(r4)));
		System.out.println(String.format("Circle #1 will overlap Circle #5: " + r1.overlap(r5)));
		System.out.println(String.format("Circle #1 will overlap Circle #6: " + r1.overlap(r6)));
		System.out.println(String.format("Circle #2 will overlap Circle #3: " + r2.overlap(r3)));
		System.out.println(String.format("Circle #2 will overlap Circle #4: " + r2.overlap(r4)));
		System.out.println(String.format("Circle #2 will overlap Circle #5: " + r2.overlap(r5)));
		System.out.println(String.format("Circle #2 will overlap Circle #6: " + r2.overlap(r6)));
		System.out.println(String.format("Circle #3 will overlap Circle #4: " + r3.overlap(r4)));
		System.out.println(String.format("Circle #3 will overlap Circle #5: " + r3.overlap(r5)));
		System.out.println(String.format("Circle #3 will overlap Circle #6: " + r3.overlap(r6)));
		System.out.println(String.format("Circle #4 will overlap Circle #5: " + r4.overlap(r5)));
		System.out.println(String.format("Circle #4 will overlap Circle #6: " + r4.overlap(r6)));
		System.out.println(String.format("Circle #5 will overlap Circle #6: " + r5.overlap(r6)) + "\n");
		
		/**
		 * Used to detect whether two circles are equal, based on size of radius, and center point.
		 */
		
		System.out.println("These circles are equal (true/false):\n");
		System.out.println(String.format("Circle #1 and Circle #2 are equal: " + r1.equals(r2)));
		System.out.println(String.format("Circle #1 and Circle #3 are equal: " + r1.equals(r3)));
		System.out.println(String.format("Circle #1 and Circle #4 are equal: " + r1.equals(r4)));
		System.out.println(String.format("Circle #1 and Circle #5 are equal: " + r1.equals(r5)));
		System.out.println(String.format("Circle #1 and Circle #6 are equal: " + r1.equals(r6)));
		System.out.println(String.format("Circle #2 and Circle #3 are equal: " + r2.equals(r3)));
		System.out.println(String.format("Circle #2 and Circle #4 are equal: " + r2.equals(r4)));
		System.out.println(String.format("Circle #2 and Circle #5 are equal: " + r2.equals(r5)));
		System.out.println(String.format("Circle #2 and Circle #6 are equal: " + r2.equals(r6)));
		System.out.println(String.format("Circle #3 and Circle #4 are equal: " + r3.equals(r4)));
		System.out.println(String.format("Circle #3 and Circle #5 are equal: " + r3.equals(r5)));
		System.out.println(String.format("Circle #3 and Circle #6 are equal: " + r3.equals(r6)));
		System.out.println(String.format("Circle #4 and Circle #5 are equal: " + r4.equals(r5)));
		System.out.println(String.format("Circle #4 and Circle #6 are equal: " + r4.equals(r6)));
		System.out.println(String.format("Circle #5 and Circle #6 are equal: " + r5.equals(r6)));
		System.out.println(String.format("Circle #6 and Circle #7 are equal: " + r6.equals(r7)));
	}
}

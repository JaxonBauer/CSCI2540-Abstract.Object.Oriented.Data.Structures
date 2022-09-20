/**
 * Jaxon Bauer
 * 
 * Point class -  Creates new points to use in the ExtendedCircleTest.
 * 
 * Lists number of points used for first half of ExtendedCircleTest.
 * 
 * Used to represent a point in the format (x,y) using toString, as well as getting the distance between
 * two points using the distance formula. Also checks two points to see if they are equal.
 */


package assg2_bauerj21;

public class Point
{
	
	/**
	 * Instance Variables
	 * @int x - x coordinate
	 * @int y - y coordinate
	 * @int numberOfPoints - the number of points that are created
	 */
	
	int x;
	int y;
	private static int numberOfPoints = 0;
	public static int getNumberOfPoints;
	
	/**
	 * Default Constructor
	 */
	
	public Point()
	{
		x = 0;
		y = 0;
		numberOfPoints++;
	}
	
	/**
	 * Two variable constructor assigning values x and y to the Point object to be stored.
	 * @param x - x coordinate
	 * @param y - y coordinate
	 */
	
	public Point(int x, int y)
	{
		this.setX(x);
		this.setY(y);
		numberOfPoints++;
	}
	
	/**
	 * Get/Set methods used to retrieve and apply x and y values as needed.
	 * @return x
	 * @return y
	 */
	
	public int getX()
	{
		return this.x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	/**
	 * Used to format given x and y variables into correct (x,y) form.
	 * @return string in desired format
	 */
	
	public String toString()
	{
		return "(" + this.getX() + "," + this.getY() + ")";
	}
	
	/**
	 * Used to calculate the space between two points using the distance formula.
	 * @return distance between two points
	 */
	
	public double getDistance(Point givenPoint)
	{
		return Math.abs(Math.sqrt((Math.pow(this.getX() - givenPoint.getX(),2))
				+ Math.pow((this.getY() - givenPoint.getY()),2)));
	}
	
	/**
	 * Used to detect whether a random point is equal to a given point, using the getX() and getY()
	 * functions to retrieve needed data to complete the task.
	 * @return boolean value telling if a point is equal to another point
	 */
	
	public boolean equals(Object other)
	{
		if(other instanceof Point)
        {
            if(this.getX() == ((Point) other).getX()  && this.getY() == ((Point) other).getY())
            {
                return true;
            }
            else
            {
            	return false;
            }
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Used to deliver the value stored at numberOfPoints to the main in order to print it to the screen.
	 * @return the number of points created
	 */
	
	public static int getNumberOfPoints()
	{
		return numberOfPoints;
	}
	
}

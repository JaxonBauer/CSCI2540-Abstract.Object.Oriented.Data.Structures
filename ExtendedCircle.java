/**
 * Jaxon Bauer
 * 
 * ExtendedCircle - 
 * 
 * Uses various methods to complete tasks such as area, circumference, shift, scale, overlap, and equals.
 * 
 * Returns data in the correct type (as seen below), and prints the results to the screen within the
 * ExtendedCircleTest class.
 */

package assg2_bauerj21;

public class ExtendedCircle 
{
	/**
	 * Instance Variables
	 */
	
	double radius;
	Point center;
	
	/**
	 * Default Constructor
	 */
	
	public ExtendedCircle()
	{
		radius = 1;
		center.x = 0;
		center.y = 0;
		
	}
	
	/**
	 * Single variable constructor assigning a radius to an ExtendedCircle with center (0,0).
	 */
	
	public ExtendedCircle(double radius)
	{
		center.x = 0;
		center.y = 0;
		this.radius = radius;
	}
	
	/**
	 * Two variable constructor to assign a radius and a center point to an ExtendedCircle.
	 */
	public ExtendedCircle(double radius, Point other)
	{
		this.radius = radius;
		this.center = other;
	}
	
	/**
	 * Get/Set methods used to retrieve and apply radius and center values as needed.
	 */
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius()
	{
		this.radius = radius;
	}
	public Point getCenter()
	{
		return this.center;
	}
	public void setCenter()
	{
		this.center = center;
	}
	
	/**
	 * Used to calculate the area of a circle.
	 */
	
	public double compArea()
	{
		double area;
		area = Math.PI * (radius * radius);
		return area;
	}
	
	/**
	 * Used to calculate the circumference of a circle.
	 */
	
	public double compCircumference()
	{
		double circumference;
		circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	/**
	 * Used to format the radius, as well as the x and y values for the circle.
	 */
	
	public String toString()
	{
		return "Radius: " + radius + "\n" + "Center: (" + center.getX() + "," + center.getY() + ")";
	}
	
	/**
	 * Used to tell whether the given point is outside of, on, or inside of a circle.
	 */
	
	public int positionToCircle(Point object)
	{
		this.getCenter();
		
		double result = object.getDistance(center);
		
		if(result > radius)
		{
			return 1;
		}
		else if (result < radius)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Used to take a center point of a circle and shift it x units left/right
	 * and y units up/down on the graph. *DOES NOT CHANGE ORIGINAL VALUE*
	 */
	
	public Object shift(int x, int y)
	{
		Point center = this.getCenter();
		
		center.x = center.x + x;
		center.y = center.y + y;
		return center;
	}
	
	/**
	 * Used to scale a circle up and down by a given multiplier.
	 */
	
	public Object scale(double size)
	{
		return this.radius * size;
	}
	
	/**
	 * Used to tell if two circles overlap one another.
	 */
	
	public boolean overlap(ExtendedCircle object)
	{
		Point initialCenter = this.getCenter();
		double initialRadius = this.getRadius();
		double sumOfRadius = initialRadius + object.radius;
		double distanceBetweenPoints = initialCenter.getDistance(object.center);
		if(sumOfRadius < distanceBetweenPoints)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Used to compare two circles as a whole and determine whether they are equal or not.
	 * (This includes radius and center point)
	 */
	
	public boolean equals(Object other)
	{
		this.getCenter();
		this.getRadius();
		if(this.center == ((ExtendedCircle) other).getCenter() && 
				this.radius == ((ExtendedCircle) other).getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

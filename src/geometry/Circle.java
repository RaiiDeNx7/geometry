package geometry;

public class Circle extends Geometry2D {
	
	double r;

	/**
	 * Default cube constructor.
	 * 
	 * @param r The radius of the circle.
	 */
	public Circle(double r) {
		this.r = r;
	}

	/**
	 * Calculates the area of circle.
	 * 
	 * @return The area of the circle.
	 */
	@Override
	double area() {
		return Math.PI * Math.pow(r, 2);
	}

	/**
	 * Calculates the perimeter of the circle.
	 * 
	 * @return The perimeter of the circle.
	 */
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

}
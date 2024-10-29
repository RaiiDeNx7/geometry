package geometry;

public class Triangle extends Geometry2D {
	
	double b;
	double h;
	double x;
	double y;

	/**
	 * Default cube constructor.
	 * 
	 * @param b The base of the triangle
	 * @param h The height of the triangle
	 * @param x The first side of the triangle
	 * @param y The second side of the triangle
	 */
	public Triangle(double b, double h, double x, double y) {
		this.b = b;
		this.h = h;
		this.x = x;
		this.y = y;
	}

	/**
	 * Calculates the area of triangle.
	 * 
	 * @return The area of the triangle.
	 */
	@Override
	double area() {
		return (h * b) / 2;
	}

	/**
	 * Calculates the perimeter of the triangle.
	 * 
	 * @return The perimeter of the triangle.
	 */
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return b + x + y;
	}

}
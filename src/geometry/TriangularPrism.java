package geometry;

public class TriangularPrism extends Geometry3D {
	double l;
	double b;
	double h;
	double s1, s2, s3;
	
	/**
	 * Default cube constructor.
	 * 
	 * @param l The length of the Triangular Prism.
	 * @param b The base of the Triangular Prism.
	 * @param h The height of the Triangular Prism.
	 * @param s1 the first base edge of the Triangular Prism.
	 * @param s2 the second base edge of the Triangular Prism.
	 * @param s3 the third base edge of the Triangular Prism.
	 */
	public TriangularPrism(double l, double b, double h, double s1, double s2, double s3) {
		this.l = l;
		this.b = b;
		this.h = h;
		this.s1 = s1;
		this.s2 = s2;	
		this.s3 = s3;
	}

	/**
	 * Calculates the volume of the Triangular Prism.
	 * 
	 * @return The volume of the Triangular Prism.
	 */
	@Override
	double volume() {
		return (l * (s1 + s2 + s3)) + (2 * b);
	}

	/**
	 * Calculates the surface area of the Triangular Prism.
	 * 
	 * @return The surface area of the Triangular Prism.
	 */
	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return b * h + (l * (s1 + s2 + s3));
	}

}

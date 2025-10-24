package lab5;

public class Trapezoid {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Trapezoid(Point A, Point B, Point C, Point D) {
		// Points are defined in clockwise order
		// Exactly one pair of parallel sides
	
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	public double Perimeter() {
		return (A.distance(B) + B.distance(C)+ C.distance(D) + D.distance(A));
	
	}
	
	public boolean isIsosceles() {
		double dAD = A.distance(D);
		double dBC = B.distance(C);
		
		if(dAD==dBC) {
			return true;
		} else {
			return false;
	}
}
	public double Longest_Diagonals(){
		double dAC= A.distance(C);
		double dBD = B.distance(D);
		
		if(dAC>=dBD) {
			return dAC;}
		else {
			return dBD;
	}
	}



}

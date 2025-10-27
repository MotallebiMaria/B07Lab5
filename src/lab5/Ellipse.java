package lab5;

public class Ellipse {
	Point center;
	Point major; // major axis
	Point minor; // minor axis
	
	public Ellipse(Point center, Point major, Point minor) {
		this.center = center;
		this.major = major;
		this.minor = minor;
	}
	
	public Ellipse(Point center, double major, double minor, boolean vertical) {
		this.center = center;
		if (vertical) {
			this.major = new Point(center.x, center.y + major);
			this.minor = new Point(center.x + minor, center.y);
		} else {
			this.major = new Point(center.x + major, center.y);
			this.minor = new Point(center.x, center.y + minor);
		}
	}
	
	public double getMajorLen() {
		return major.distance(center);
	}
	
	public double getMinorLen() {
		return minor.distance(center);
	}
	
	public double perimeter() {
		double major = getMajorLen(), minor = getMinorLen();
		return 2 * Math.PI * Math.sqrt((Math.pow(major, 2) + Math.pow(minor, 2))/2);
	}
	
	public double area() {
		double major = getMajorLen(), minor = getMinorLen();
		return Math.PI * major * minor;
	}
	
	public boolean isCircle() {
		return getMinorLen() == getMajorLen();
	}
	
	public Point[] focusPoints() {
		double major = getMajorLen(), minor = getMinorLen();
		double c = Math.sqrt(Math.pow(major, 2) - Math.pow(minor, 2));
		
		Point p1, p2;
		if (this.major.x > this.minor.x) { // vertical
			p1 = new Point(center.x, center.y + c);
			p2 = new Point(center.x, center.y - c);
		} else { // horizontal
			p1 = new Point(center.x + c, center.y);
			p2 = new Point(center.x - c, center.y);
		}
		
		return new Point[] {p1, p2};
	}
}

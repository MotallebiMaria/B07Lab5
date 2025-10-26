package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapezoidTest {

	@Test
	void testPerimeter() {
	Point p1 = new Point(1,3);
	Point p2 = new Point(2, 3);
	Point p3 = new Point (3,1);
	Point p4 = new Point(0,1);
	Trapezoid t = new Trapezoid(p1,p2,p3,p4);
	assertEquals(1+2*(Math.sqrt(5))+3, t.Perimeter());
		
	}
	@Test
	void testIsoscelesCase1() {
	Point p1 = new Point(1,3);
	Point p2 = new Point(2, 3);
	Point p3 = new Point (3,1);
	Point p4 = new Point(0,1);
	Trapezoid t = new Trapezoid(p1,p2,p3,p4);
	assertTrue(t.isIsosceles());
		
	}
	@Test
	
	void testIsoscelesCase2() {
	Point p1 = new Point(1,3);
	Point p2 = new Point(2, 3);
	Point p3 = new Point (2,1);
	Point p4 = new Point(0,1);
	Trapezoid t = new Trapezoid(p1,p2,p3,p4);
	assertFalse(t.isIsosceles());

}
@Test
	
	void testDiagonalCase1() {
	Point p1 = new Point(1,3);
	Point p2 = new Point(2, 3);
	Point p3 = new Point (2,1);
	Point p4 = new Point(0,1);
	Trapezoid t = new Trapezoid(p1,p2,p3,p4);
	assertEquals(t.Longest_Diagonals(), Math.sqrt(8));
}


@Test

void testDiagonalCase2() {
Point p1 = new Point(1,3);
Point p2 = new Point(2, 3);
Point p3 = new Point (6,1);
Point p4 = new Point(0,1);
Trapezoid t = new Trapezoid(p1,p2,p3,p4);
assertEquals(t.Longest_Diagonals(), Math.sqrt(29));
}
}

package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EllipseTest {
	
	@Test
	public void testPointConstructor() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertTrue(e1.center.equals(new Point(0, 0)));
	}
	//Tests whether the center was set correctly 
	
	
	@Test
	public void testPointConstructor1() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertTrue(e1.major.equals(new Point(0, 5)));
	}
	//Tests whether the major was set correctly 
	
	@Test
	public void testPointConstructor2() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertTrue(e1.minor.equals(new Point(2, 0)));
	}
	//Tests whether the minor was set correctly 
	
	@Test
	public void testDoubleConstructor() {
		Ellipse e1 = new Ellipse(new Point(0, 0), 5.0, 2.0, false);
		assertTrue(e1.center.equals(new Point(0, 0)));
	}
	//Tests whether the center was set correctly
	
	@Test
	public void testDoubleConstructor1() {
		Ellipse e1 = new Ellipse(new Point(0, 0), 5.0, 2.0, false);
		assertTrue(e1.major.equals(new Point(5, 0)));
	}
	//Tests whether the Major was set correctly
	
	@Test
	public void testDoubleConstructor2() {
		Ellipse e1 = new Ellipse(new Point(0, 0), 5.0, 2.0, false);
		assertTrue(e1.minor.equals(new Point(0, 2)));
	}
	//Tests whether the minor was set correctly
	
	@Test
	public void testDoubleConstructorVertical() {
		Ellipse e1 = new Ellipse(new Point(0, 0), 5.0, 2.0, true);
		assertTrue(e1.minor.equals(new Point(2,0)));
	}
	
	@Test
	public void testGetMajorLen() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertEquals(e1.getMajorLen(), 5);
	}
	//Tests whether GetMajorLen returns the correct length
	
	@Test
	public void testGetMinorLen() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertEquals(e1.getMinorLen(), 2);
	}
	//Tests whether GetMinorLen returns the correct length
	
	@Test
	public void testPerimeter() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		double major = e1.getMajorLen(), minor = e1.getMinorLen();
		double result = 2 * Math.PI * Math.sqrt((Math.pow(major, 2) + Math.pow(minor, 2))/2);
		assertEquals(e1.perimeter(), result);
	}
	//Tests whether perimeter calculates the right length, uses Ramanujans approximation, idk what maria used again even though I was there when she wrote the code:( ;
	
	@Test
	public void testArea() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertEquals(e1.area(), e1.getMajorLen() * e1.getMinorLen()* Math.PI);
	}
	//Test for correct calculation of the area
	
	@Test
	public void testIsCircle() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(0, 5), new Point(2, 0));
		assertFalse(e1.isCircle());
	}
	//Test for the correct determination of circle
	
	@Test
	public void testFocusPointsHorizontal() {
		Ellipse e1 = new Ellipse(new Point(0, 0), new Point(5, 0), new Point(0, 4));
		Point[] array = e1.focusPoints();
		assertEquals(array[0].distance(new Point(0,0)), array[1].distance(new Point(0,0)));
		
	}
	
	@Test
	public void testFocusPointsVertical() {
		Ellipse e1 = new Ellipse(new Point(0,0), 4, 5, false);
		Point[] array = e1.focusPoints();
		assertEquals(array[0].distance(new Point(0,0)), array[1].distance(new Point(0,0)));
	}
}

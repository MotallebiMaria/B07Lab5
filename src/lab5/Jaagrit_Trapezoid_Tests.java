package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrapezoidTest {

    @Test
    void testPerimeterBasic() {
        Point j = new Point(0, 0);
        Point a = new Point(4, 0);
        Point g = new Point(3, 3);
        Point r = new Point(1, 3);
        Trapezoid t = new Trapezoid(j, a, g, r);
        double expected = j.distance(a) + a.distance(g) + g.distance(r) + r.distance(j);
        assertEquals(expected, t.Perimeter());
    }

    @Test
    void testIsoscelesTrue() {
        Point j = new Point(0, 0);
        Point a = new Point(4, 0);
        Point g = new Point(3, 3);
        Point r = new Point(1, 3);
        Trapezoid t = new Trapezoid(j, a, g, r);
        assertTrue(t.isIsosceles());
    }

    @Test
    void testIsoscelesFalse() {
        Point j = new Point(0, 0);
        Point a = new Point(5, 0);
        Point g = new Point(4, 2);
        Point r = new Point(1, 3);
        Trapezoid t = new Trapezoid(j, a, g, r);
        assertFalse(t.isIsosceles());
    }

    @Test
    void testLongestDiagonalAC() {
        Point j = new Point(0, 0);
        Point a = new Point(4, 0);
        Point g = new Point(4, 3);
        Point r = new Point(1, 3);
        Trapezoid t = new Trapezoid(j, a, g, r);
        double expected = j.distance(g);
        assertEquals(expected, t.Longest_Diagonals());
    }

    @Test
    void testLongestDiagonalBD() {
        Point j = new Point(0, 0);
        Point a = new Point(3, 1);
        Point g = new Point(2, 4);
        Point r = new Point(-1, 3);
        Trapezoid t = new Trapezoid(j, a, g, r);
        double expected = a.distance(r);
        assertEquals(expected, t.Longest_Diagonals());
    }
}

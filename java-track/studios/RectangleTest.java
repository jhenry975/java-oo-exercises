import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testIsSmaller()
	{
		Rectangle sm1 = new Rectangle(2, 3);
		Rectangle sm2 = new Rectangle(3, 5);
		assertTrue(sm1.isSmaller(sm2) == true);
	}
	
	@Test
	public void testArea()
	{
		Rectangle a = new Rectangle(2, 3);
		assertTrue(a.area() == 6);
	}
	
	@Test
	public void testPerimeter()
	{
		Rectangle p = new Rectangle(2, 3);
		assertTrue(p.perimeter() == 10);
	}
	
	@Test
	public void testIsSquare()
	{
		Rectangle sq = new Rectangle(3, 4);
		assertTrue(sq.isSquare() == false);
	}

}

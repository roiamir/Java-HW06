package relayware.java.training.java_HW06;

import org.junit.Test;

import junit.framework.TestCase;

public class RectangleAreaTest extends TestCase {
	@Test
	public void testCalcArea_Zero() throws NegativeValueException{
		RectangleArea ra = new RectangleArea();
		assertEquals(0, ra.calcArea(0, 9));
	}

	@Test
	public void testCalcArea_Positive() throws NegativeValueException{
		RectangleArea ra = new RectangleArea();
		assertEquals(9, ra.calcArea(1, 9));
	}

	@Test
	public void testCalcArea_ExceptionCatch() {
		RectangleArea ra = new RectangleArea();
		try {
			ra.calcArea(-1, 1);
			fail("shoudl throw NegativeValueException");
		}
		catch (NegativeValueException e){
			assertEquals("Negative Value -1 is not valid for rectangle", e.getMessage());
		}
	}

//	@Test (expected=NegativeValueException.class)
//	public void testCalcArea_ExceptionExpected() {
//		RectangleArea ra = new RectangleArea();
//			ra.calcArea(-1, 1);
//	}
	

}

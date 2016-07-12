package relayware.java.training.java_HW06;

public class RectangleArea {
	public int calcArea(int a, int  b) throws NegativeValueException {
		if (a<0) {
			throw new NegativeValueException("Negative Value " + a + " is not valid for rectangle");
		}
		if (b<0) {
			throw new NegativeValueException("Negative Value " + b + " is not valid for rectangle");
		}
		return a*b;
	}
}

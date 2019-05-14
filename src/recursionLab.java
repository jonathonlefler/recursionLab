
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class recursionLab {
	MyMath mather;

	public static void main(String[] args) {
		MyMath mather = new MyMath();
		
		System.out.println(mather.fibonacciNumber(6));
		System.out.println(mather.areaFibonacciIterative(6));
		System.out.println(mather.perimeterFibonacci(6));
		
	}
	
	@Before
	public void testInit() {
		mather = new MyMath();
	}
	
	@Test
	public void testFibs() {
		assertEquals(mather.fibonacciNumber(1), 1);
		assertEquals(mather.fibonacciNumber(2), 1);
		assertEquals(mather.fibonacciNumber(3), 2);
		assertEquals(mather.fibonacciNumber(4), 3);
		assertEquals(mather.fibonacciNumber(5), 5);
		assertEquals(mather.fibonacciNumber(6), 8);
		assertEquals(mather.fibonacciNumber(7), 13);
	}
	
	@Test
	public void testAreaFibs() {
		assertEquals(mather.areaFibonacciIterative(1), 1);
		assertEquals(mather.areaFibonacciIterative(2), 2);
		assertEquals(mather.areaFibonacciIterative(3), 6);
		assertEquals(mather.areaFibonacciIterative(4), 15);
		assertEquals(mather.areaFibonacciIterative(5), 40);
		assertEquals(mather.areaFibonacciIterative(6), 104);
	}
	
	@Test
	public void testPeriFibs() {
		assertEquals(mather.perimeterFibonacci(1), 4);
		assertEquals(mather.perimeterFibonacci(2), 6);
		assertEquals(mather.perimeterFibonacci(3), 10);
		assertEquals(mather.perimeterFibonacci(4), 16);
		assertEquals(mather.perimeterFibonacci(5), 26);
		assertEquals(mather.perimeterFibonacci(6), 42);
	}
}

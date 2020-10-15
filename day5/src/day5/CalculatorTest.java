/**
 * 
 */
package day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author rohan
 *
 */
class CalculatorTest {

	/**
	 * Test method for {@link day5.Calcu#add(int, int)}.
	 */
	Calcu c= new Calcu();
	@Test
	final void testAdd() {
		//fail("Not yet implemented"); // TODO
		//System.out.print();
		int result=c.add(10,0);
		assertTrue(result ==10);
		assertEquals(10,result);
	}

	/**
	 * Test method for {@link day5.Calcu#sub(int, int)}.
	 */
	@Test
	final void testSub() {
		//fail("Not yet implemented"); // TODO
		int result=c.sub(10,10);
		assertTrue(result ==0);
		assertEquals(0,result);
	}

	/**
	 * Test method for {@link day5.Calcu#div(int, int)}.
	 */
	@Test
	final void testDiv() {
		//fail("Not yet implemented"); // TODO
		int result=c.div(10,10);
		assertTrue(result ==1);
		assertEquals(1,result);
	}

	/**
	 * Test method for {@link day5.Calcu#mul(int, int)}.
	 */
	@Test
	final void testMul() {
		//fail("Not yet implemented"); // TODO
		int result=c.mul(10,10);
		assertTrue(result ==100);
		assertEquals(100,result);
	}

}

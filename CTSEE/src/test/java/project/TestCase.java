package project;

import static org.junit.jupiter.api.Assertions.*;
/*
 * <h1> Test Case For ReversalArray</h1>
 * 
 * @author Nilesh
 * 
 * @version 1.0
 * */

import org.junit.jupiter.api.Test;

class TestCase {
	/*
	 * @param expectedrArray
	 * @param actualArray
	 * 
	 * @return assertEquals
	 * */

	@Test
	void test() {
		
		ReversalArray tc =new ReversalArray();
		int[] expectedArray = {50, 40, 30 ,20, 10};
				int[] actualArray = tc.reverse(expectedArray , n );
				assertEquals(expectedArray, actualArray);
		
		      
		   }
	}



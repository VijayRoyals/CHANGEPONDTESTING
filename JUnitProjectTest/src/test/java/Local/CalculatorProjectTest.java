package Local;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorProjectTest {
	

	@Test 
	void addtest() { 
		
		CalculatorProject c = new CalculatorProject(); 
		
		int expected = 2; 
		int actual = c.add(1,1); 
		
		assertEquals(expected, actual, "Add function can calculate two integer");
	}
	
	
	//@Test 
		void subtest() { 
			
			CalculatorProject c = new CalculatorProject(); 
			
			int expected = 2; 
			int actual = c.sub(3,1); 
			
			assertEquals(expected, actual, "sub function can calculate two integer");
		}
		
		//@Test 
		void divtest() { 
			
			CalculatorProject c = new CalculatorProject(); 
			
			int expected = 1; 
			int actual = c.div(2,2); 
			
			assertEquals(expected, actual, "division function can calculate two integer");
		}
		
		//@Test 
		void multest() { 
			
			CalculatorProject c = new CalculatorProject(); 
			
			int expected = 25; 
			int actual = c.mul(5,5); 
			
			assertEquals(expected, actual, "Mul function can calculate two integer");
		}
		
		
		//@Test 
		void positiveNumber() { 
			CalculatorProject c = new CalculatorProject(); 
			
			boolean expected = true; 
			boolean actual = c.positiveNumber();
			assertEquals(expected, actual, "Boolean function can be true or false");
		}
		
}




package Local;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalAsssumptionsTest {
	
	
	class ConditionalAssumptionsTest { 
		
		
		
		@Test 
		@EnabledOnOs(OS.LINUX) 
		void testOperatingSys() { 
			System.out.println("I am on windows 11"); 
		}
		
		void testValue() { 
			
			ConditionalAssumption c1 = new ConditionalAssumption(); 
			
			boolean val = false; 
			assumeTrue(val); 
			int expected = 10; 
			int actual = c1.value(); 
			assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Multiply method")
		void testMultiply() { 
			
			ConditionalAssumption c1 = new ConditionalAssumption(); 
		}
	}
	

}




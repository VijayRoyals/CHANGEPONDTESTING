package Local;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class AmazonProjectTest {

	
	
	@Test
	void testAmazonTagLine() { 
		String expected = "Spend less. Smile  more"; 
		String actual = "Spend less. Smile  more"; 
		
		assertEquals(expected, actual); 
		assertSame(expected, actual, "Expected result should match with actual result");
	}
}

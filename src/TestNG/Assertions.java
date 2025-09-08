package TestNG;

import org.testng.annotations.*;
import org.testng.Assert;

public class Assertions {
	int num = 20;
	int number = 20;
	@Test
	public void assertEquals() {
		Assert.assertEquals(num, number, "Not Equal");
	}
	
	@Test
	public void assertTrue() {
		Assert.assertTrue(num>number, "Condtion is not true");
	}
	
	

}

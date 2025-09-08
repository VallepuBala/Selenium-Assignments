package TestNG;

import org.testng.annotations.*;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(">> Setup Reporting");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(">> Launch Browser");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(">> Open AUT (Application Under Test)");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(">> Login before each test");
	}
	
	@Test
	public void loginTest() {
		System.out.println("Executing test 1");
	}
	
	@Test
	public void logoutTest() {
		System.out.println("Executing test 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(">> Logout after each test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(">> Close AUT");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(">> Quit Broswer");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println(">> Generate Report");
	}
	
	
	

}

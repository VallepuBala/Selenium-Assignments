package TestNG;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginTest {
	WebDriver driver;
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println(">> start reporting");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println(">> Launch Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
	}
	
	

}

package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void mouseHoverTest()
	{
		Actions obj = new Actions(driver);	
		obj.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Fashion']"))).pause(3000)
		.perform();
		
		obj.moveToElement(driver.findElement(By.xpath("//div[starts-with(@class, '_1UgUYI')]/descendant::object/a[3]"))).pause(3000)
		.perform();
		
		obj.moveToElement(driver.findElement(By.xpath("//div[starts-with(@class, '_31z7R_')]/descendant::object/a[2]"))).pause(3000)
		.click().perform();
		
		//driver.findElement(By.xpath("//div[text()='Excess Baggage' and contains(@class,'css-76zvg2 r-c20mna')]")).click();
	}
	
	@AfterMethod
	public void teardown()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
package SeleniumAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment5 {
	WebDriver driver;
	
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void loginApp() throws InterruptedException {
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='login_div']/button")).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(dependsOnMethods= {"loginApp"}, priority=1)
	public void hoverAndClick() {
		for(int i = 0; i<=1;i++) {
			new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='navbar']/div[2]/button"))).pause(3000).perform();
			driver.findElement(By.xpath("//*[@id=\"user_div\"]/div/div[2]/div/a[3]")).click();
		}
		
	}
	
	@Test(dependsOnMethods= {"hoverAndClick"}, priority=2)
	public void doubleClick() {
		for(int i = 0; i<=4; i++) {
			new Actions(driver).doubleClick(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[2]/button"))).perform();
		}
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	
	
}

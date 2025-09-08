package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Assignment4 {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		Thread.sleep(5000);
	}
	
	@Test
	public void loanAmountSelection() throws InterruptedException {
		WebElement amountSlider = driver.findElement(By.xpath("//div[@id='loanamountslider']/span"));
		new Actions(driver).dragAndDropBy(amountSlider, 79, 0).perform();
		System.out.println("Loan Amount Selected: " + driver.findElement(By.xpath("//input[@id='loanamount']")).getText());
		
	}
	
	@Test
	public void loanInterestSelection() throws InterruptedException {
		WebElement interestSlider = driver.findElement(By.xpath("//div[@id='loaninterestslider']/span"));
		new Actions(driver).dragAndDropBy(interestSlider, 150, 0).perform();
		System.out.println("Loan Interest Selected: " + driver.findElement(By.xpath("//input[@id='loaninterest']")).getText());
	}
	@Test
	public void loanTenureSelection() throws InterruptedException {
		WebElement interestSlider = driver.findElement(By.xpath("//div[@id='loantermslider']/span"));
		new Actions(driver).dragAndDropBy(interestSlider, -108, 0).perform();
		System.out.println("Loan Tenure Selected: " + driver.findElement(By.xpath("//input[@id='loanterm']")).getText());
	}
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}

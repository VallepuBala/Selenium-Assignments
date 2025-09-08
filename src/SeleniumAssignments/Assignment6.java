package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment6 {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(5000);
	}
	
	@Test
	public void clickOnImage() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"a077aa5e\"]")));
		driver.findElement(By.xpath("/html/body/a/img")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void printTitles() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList<>(allWindows);
		driver.switchTo().window(list.get(1));
		List<WebElement> titles = driver.findElements(By.xpath("//*[starts-with(@id, 'kt-info-box')]/a/div[2]/span"));
		for (WebElement title : titles) {
			System.out.println(title.getText());
		}
		
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(WebElement l :list) {
			System.out.println("Text of link: " + l.getText());
			System.out.println("href of link: " + l.getDomAttribute("href"));
			l.click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
		
		driver.quit();

	}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting {
	
	public static void borniGarciaTesting(WebDriver driver) throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(WebElement l :list) {
			System.out.println("Text of link: " + l.getText());
			System.out.println("href of link: " + l.getDomAttribute("href"));
			System.out.println();
			l.click();
			Thread.sleep(3000);
			driver.navigate().back();
		}
		
		driver.quit();
	}
	
	public static void amazonLinksTesting(WebDriver driver) throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement divOfLinks = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
		List<WebElement> list = divOfLinks.findElements(By.tagName("a"));
		
		for(int i = 0; i <= list.size()-1; i++) {
			WebElement link = list.get(i);
			link.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			divOfLinks = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
			list = divOfLinks.findElements(By.tagName("a"));
			
		}
		driver.quit();
		
	}

	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		borniGarciaTesting(driver);
		amazonLinksTesting(driver);
		
		

	}

}

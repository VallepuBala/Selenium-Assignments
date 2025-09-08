package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		Thread.sleep(20000);
		
		System.out.println(driver.findElement(By.id("flash")).getText());
		System.out.println(driver.findElement(By.id("flash")).getCssValue("border-color"));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("flash")).getText());
		driver.quit();
		
		
		

	}

}

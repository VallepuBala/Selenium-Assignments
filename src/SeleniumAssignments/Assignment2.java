package SeleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//select[@id='day']//option[@value='1']")).click();
		System.out.println("Selected Day");
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//select[@id='month']//option[@value='11']")).click();
		System.out.println("Selected Month");
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//select[@id='year']//option[@value='2000']")).click();
		System.out.println("Selected Year");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}

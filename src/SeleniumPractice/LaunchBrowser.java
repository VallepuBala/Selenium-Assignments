package SeleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		System.out.println("Opened Naukri Site");
		
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		Thread.sleep(2000);
		System.out.println("Clicked on login Button");
		
		String mail = "baladurgeshv1@gmail.com";
		String mail_xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input";
		driver.findElement(By.xpath(mail_xpath)).sendKeys(mail);
		Thread.sleep(3000);
		System.out.println("Enter email in mail input");
		
		driver.close();
		System.out.println("Closed the broswer tab");
		
		driver.quit();
		System.out.println("Killed the executable also (chromedriver.exe)");
	}

}

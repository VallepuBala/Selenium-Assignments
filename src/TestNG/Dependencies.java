package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Dependencies {
	@Test
	public void openApp() {
		System.out.println("Opening the Application");
//		Assert.assertTrue(false);
	}
	
	@Test(priority=1, dependsOnMethods= {"openApp"})
	public void login() {
		System.out.println("Loginging the Application");
//		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods= {"login"})
	public void addToCart() {
		System.out.println("Added Item to Cart");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods= {"login", "addToCart"})
	public void checkout() {
		System.out.println("Odered the cart Items");
	}
	
	@Test(priority=4, dependsOnMethods = {"login"})
	public void logout() {
		System.out.println("Loggedout from the Application");
	}

}

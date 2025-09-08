package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"sanity"})
	public void openApp() {
		System.out.println("Opening the Application");
//		Assert.assertTrue(false);
	}
	
	@Test(priority=1, dependsOnMethods= {"openApp"}, groups= {"sainty"})
	public void login() {
		System.out.println("Loginging the Application");
//		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods= {"login"}, groups= {"sanity", "regression"})
	public void addToCart() {
		System.out.println("Added Item to Cart");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods= {"login", "addToCart"}, groups= {"sanity", "regression"})
	public void checkout() {
		System.out.println("Odered the cart Items");
	}
	
	@Test(priority=4, dependsOnMethods = {"login"}, groups= {"sanity"})
	public void logout() {
		System.out.println("Loggedout from the Application");
	}


}

package TestNG;

import org.testng.annotations.*;

public class Priorities {
	@Test
	public void openApp() {
		System.out.println("Opening the Application");
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println("Loginging the Application");
	}
	
	@Test(priority=2)
	public void addToCart() {
		System.out.println("Added Item to Cart");
	}
	
	@Test(priority=3)
	public void checkout() {
		System.out.println("Odered the cart Items");
	}
	
	@Test(priority=4)
	public void logout() {
		System.out.println("Loggedout from the Application");
	}

}

// Default value of priority is 0 (zero)
// We can provide the negitive values also (negitive valued test will run first)

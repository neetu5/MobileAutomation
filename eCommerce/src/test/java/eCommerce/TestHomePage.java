package eCommerce;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import androidScreen.HomePage;

public class TestHomePage extends  HomePage{
	
	
	@Test
	public void testHomePage() {
		letsShop();
	}
	
	//@Test
	public void testMessage() {
		toastMessage();
	}
	
}

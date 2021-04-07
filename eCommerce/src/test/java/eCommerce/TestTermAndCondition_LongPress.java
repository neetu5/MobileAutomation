package eCommerce;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import androidBase.Common;
import androidBase.driverSetUp;
import androidScreen.TotalPurchaseAmount;

public class TestTermAndCondition_LongPress extends  TotalPurchaseAmount{

	@Test
	public void testLongPress() throws InterruptedException {
		TotalPurchaseAmount.totalAmount();
	
		WebElement tc =driver.findElementByXPath("//*[@text='Please read our terms of conditions']");
		Common.longPress(tc);
	}
}

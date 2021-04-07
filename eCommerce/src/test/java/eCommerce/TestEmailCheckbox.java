package eCommerce;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import androidBase.Common;
import androidScreen.TotalPurchaseAmount;

public class TestEmailCheckbox extends TotalPurchaseAmount{

	@Test
	public void testCheckbox() throws InterruptedException {
		TotalPurchaseAmount.totalAmount();
		WebElement element = driver.findElementByClassName("android.widget.CheckBox");
		Common.selectCheckbox(element);
	}
}

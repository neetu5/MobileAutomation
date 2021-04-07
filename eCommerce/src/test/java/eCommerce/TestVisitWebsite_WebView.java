package eCommerce;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import androidBase.Common;
import androidScreen.TotalPurchaseAmount;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestVisitWebsite_WebView extends TotalPurchaseAmount{

	@Test
	public void testWebsite() throws InterruptedException {
		TotalPurchaseAmount.totalAmount();
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		Thread.sleep(2000);
		
		Common.switchsContext();
		//driver.findElementByName("q").sendKeys("hello");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.context("NATIVE_APP");
	}
}

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class TestBaseClass extends BaseClass{

	
	@Test
	public void test() throws MalformedURLException  {
		 AppiumDriver driver = setCaps();
		 driver.findElementById("Alert Views").click();
		 driver.findElementByAccessibilityId("Text Entry").click();
		 driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hi");
		driver.findElementByAccessibilityId("OK").click();
		driver.findElementByAccessibilityId("Confirm / Cancel").click();
		String text = driver.findElementByXPath("//*[contains(@name,'message')]").getText();
		Assert.assertEquals(text, "A message should be a short, complete sentence.");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Confirm\"]").click();
		
		
		
	}
}

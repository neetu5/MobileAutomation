import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class TestPicker extends BaseClass {
	
	
	@Test
	public void testPicker() throws MalformedURLException {
		AppiumDriver driver = setCaps();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Picker View\"]").click();
		driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("255");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("150");
	}

}

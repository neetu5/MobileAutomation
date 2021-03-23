import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class TestScroll extends BaseClass{

	@Test
	public void testScroll() throws MalformedURLException {
		AppiumDriver driver = setCaps();
		WebElement elementID = driver.findElementByAccessibilityId("Web View");
		HashMap<String, Object> scrollObject = new HashMap<String, Object>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", elementID);
		
		driver.executeScript("mobile:scroll", scrollObject);
	}
}

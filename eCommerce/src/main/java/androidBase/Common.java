package androidBase;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.util.Set;

public class Common extends  driverSetUp{
	static String value;

	public static void signIn() {
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("User");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.hideKeyboard();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	}
	
	public static double getAmount(String amount) {
		{

			value= amount.substring(1);

			double amount2value=Double.parseDouble(value);

			return amount2value;

			}
	}
	
	public static void selectCheckbox(WebElement ele) {
		TouchAction t=new TouchAction(driver);
		t.tap(tapOptions().withElement(element(ele))).perform();
	}
	
	public static void longPress(WebElement ele) {
		TouchAction t=new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(2))).release().perform();
	}
	
	public static void switchsContext() {
		Set<String> contexts = driver.getContextHandles();
		for(String contextName :contexts)
		{
		System.out.println(contextName);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
	}
}

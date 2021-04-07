package androidScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import androidBase.driverSetUp;
import io.appium.java_client.MobileBy;

public class HomePage extends driverSetUp {


	public void toastMessage() {
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	String message =driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
	System.out.println(message);
	Assert.assertEquals(message, "Please enter your name");
	}
	public static void letsShop() {
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("User");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.hideKeyboard();
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().text(\"Bahamas\"))"));
		driver.findElementByXPath("//*[@text='Bahamas']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	}
	
	
}

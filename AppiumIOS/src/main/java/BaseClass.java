import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {

	@BeforeClass
	public static AppiumDriver setCaps() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone12");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		caps.setCapability(MobileCapabilityType.UDID, "C72AE23E-FB1E-4E24-9364-C5A961AA5072");
		caps.setCapability("simulatorStartupTimeout", "180000");

		String appURL = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
		caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		caps.setCapability(MobileCapabilityType.APP, appURL);
		URL appiumUrl = new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver driver = new IOSDriver(appiumUrl, caps);
		return driver;

	}
}

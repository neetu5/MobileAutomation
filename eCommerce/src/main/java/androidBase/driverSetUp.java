package androidBase;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class driverSetUp {
	public static AndroidDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6New");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		caps.setCapability("appPackage", "com.androidsample.generalstore");
//		caps.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		caps.setCapability("avd", "Nexus6New");
		caps.setCapability("avdLaunchTimeout", 180000);
		caps.setCapability("newCommandTimeout", 300);

		String appURL = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator +  "resources" + File.separator + "General-Store.apk";

		caps.setCapability(MobileCapabilityType.APP, appURL);
		URL appiumUrl = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(appiumUrl, caps);
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}

}

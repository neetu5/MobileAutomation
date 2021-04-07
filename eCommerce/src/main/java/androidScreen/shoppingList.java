package androidScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import androidBase.driverSetUp;
import io.appium.java_client.MobileBy;

public class shoppingList extends driverSetUp {

	public void addTocart() throws InterruptedException {
		HomePage.letsShop();
		System.out.println(driver.findElementsById("com.androidsample.generalstore:id/productImage").size());
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Jordan 6 Rings\"))"));
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new
		// UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < count; i++)

		{

			String text = ((WebElement) driver.findElementsById("com.androidsample.generalstore:id/productName").get(i))
					.getText();
			if (text.equalsIgnoreCase("Jordan 6 Rings"))

			{

				((WebElement) driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i))
						.click();

				break;

			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);
		String productDescription = driver.findElement(By.id("com.androidsample.generalstore:id/productName"))
				.getText();
		Assert.assertEquals(productDescription, "Jordan 6 Rings");
	}

}

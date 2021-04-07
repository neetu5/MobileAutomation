package androidScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import androidBase.Common;
import androidBase.driverSetUp;

public class TotalPurchaseAmount extends driverSetUp {
	static double sum = 0;
	static double totalValue;
	public static void totalAmount() throws InterruptedException {
		Common.signIn();
		((WebElement) driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0)).click();

		((WebElement) driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0)).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		Thread.sleep(4000);
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

		

		for (int i = 0; i < count; i++)

		{

			String amount1 = ((WebElement) driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"))
					.get(i)).getText();

			double amount = Common.getAmount(amount1);

			sum = sum + amount;
			String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

			total = total.substring(1);

			 totalValue = Double.parseDouble(total);

			System.out.println(totalValue + "Total value of products");

			
		}
		Assert.assertEquals(sum, totalValue);
	}
	
	

}

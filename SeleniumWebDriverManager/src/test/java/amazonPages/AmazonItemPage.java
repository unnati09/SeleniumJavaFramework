package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonItemPage {
	
	private static WebElement element = null;
	
	public static WebElement item_title(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()='KinHwa Headbands for Washing Face Non-slip Make-up Headwraps Adjustable Hair Bands Fits All Head Sizes Perfect for Sports, Yoga, Workout or Bath 3 Pack - Gray']"));
	     return element;
	}

}

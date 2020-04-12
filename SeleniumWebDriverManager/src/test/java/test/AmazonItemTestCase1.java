package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazonPages.AmazonItemPage;
import amazonPages.AmazonHomePage;

public class AmazonItemTestCase1 {

	public static void main(String[] args) {
		amazonItem();

	}
	
	public static void amazonItem() {
		WebDriver driver = new ChromeDriver();
		 //go to amazon.ca
			driver.get("https://www.amazon.ca/");
			AmazonHomePage.textbox_search(driver).sendKeys("Hair band");
			AmazonHomePage.button_search(driver).click();
			AmazonItemPage.item_title(driver).click();
			driver.quit();
			System.out.println("Test passed");
	
	
	}
	

}

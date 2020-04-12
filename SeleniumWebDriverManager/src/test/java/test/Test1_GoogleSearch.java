package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch() {
		WebDriver driver = new ChromeDriver();
	    //go to google.com
		driver.get("https://www.amazon.ca/");
		//enter text in search textbox 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hair band");
		//click on search button
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		//click on first product
		driver.findElement(By.xpath("//span[text()='KinHwa Headbands for Washing Face Non-slip Make-up Headwraps Adjustable Hair Bands Fits All Head Sizes Perfect for Sports, Yoga, Workout or Bath 3 Pack - Gray']")).click();
		driver.findElement(By.id("add-to-cart-button")).click(); 
		driver.findElement(By.xpath("//span[@class='a-size-medium sc-product-title']")).getText();
		
		//close browser
		//driver.close();
		driver.quit();
		System.out.println("Test passed");
	}
}

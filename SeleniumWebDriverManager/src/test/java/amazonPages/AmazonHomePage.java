package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	
	private static WebElement element = null;
    //enter the text in the text box 
	public static WebElement textbox_search(WebDriver driver) {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}
   //Click on the search icon 
    public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.className("nav-input"));
    	return element;
    	}

}

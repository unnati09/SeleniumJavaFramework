import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.ca");
		driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("abcd");
		//taking all inputs from google.ca and storing it in a variable
		List<WebElement> listOfInputElements=driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("count of input elements:"+count);
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();

	}
}

package SeleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IncognitoChrome {

	public static void main(String[] args) throws InterruptedException {
		
		// Set ChromeDriver path
	   // System.setProperty("webdriver.chrome.driver",
	     //       "/Users/shruti/Downloads/chromedriver-mac-arm64/chromedriver");
     
      //enable incognito mode
	    Thread.sleep(5000);
      ChromeOptions options = new ChromeOptions();
     options.addArguments("--incognito");
     Thread.sleep(5000);
      WebDriver driver = new ChromeDriver(options);
      Thread.sleep(5000);
      driver.get("https://selenium-prd.firebaseapp.com/");
      Thread.sleep(5000);
      driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
      driver.findElement(By.id("password_field")).sendKeys("admin123");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[text()='Home']")).click();
      driver.findElement(By.id("name")).sendKeys("Shruti");
      driver.findElement(By.name("lastname")).sendKeys("Sharan");
      driver.findElement(By.id("postaladdress")).sendKeys("Sample Postal Address1");
      driver.findElement(By.id("personaladdress")).sendKeys("Sample Personal Address");
      driver.findElement(By.xpath("//input[@value = 'female']")).click();
      driver.findElement(By.id("city"));
      //Select city = new Select(city);
     // city.selectByContainsVisibleText("newdelhi");
      
      
      
      
      
	}
}

package SeleniumAuto;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePgae {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
	    driver.get("https://selenium-prd.firebaseapp.com/");
	      
	     WebElement email = driver.findElement(By.id("email_field"));
	      email.sendKeys("admin123@gmail.com");
	     WebElement password = driver.findElement(By.id("password_field"));
	     password.sendKeys("admin123");
	     driver.manage().window().maximize();
	      WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
	      login.click();
	      Thread.sleep(5000);
	     WebElement home =   driver.findElement(By.xpath("//a[text()='Home']"));
	     home.click();
	     Thread.sleep(5000);
	     WebElement name = driver.findElement(By.id("name"));
	     name.sendKeys("Shruti");
	      WebElement fathername = driver.findElement(By.name("lastname"));
	      fathername.sendKeys("Srivas");
	     WebElement postalAddress =  driver.findElement(By.id("postaladdress"));
	     postalAddress.sendKeys("Sample Postal Address1");
	      WebElement personalAddress = driver.findElement(By.id("personaladdress"));
	      personalAddress.sendKeys("Sample Personal Address");
	     WebElement gender = driver.findElement(By.xpath("//input[@value = 'female']"));
	     gender.click();
	     Thread.sleep(5000);
	      WebElement citydropdown = driver.findElement(By.id("city"));
	      Select city = new Select(citydropdown);
	      city.selectByContainsVisibleText("MUMBAI");
	      
	      WebElement coursedropdown = driver.findElement(By.id("course"));
	      Select course = new Select(coursedropdown);
	      course.selectByIndex(1);
	      
	      WebElement districtdropdown = driver.findElement(By.id("district"));
	      Select district = new Select (districtdropdown);
	      district.selectByValue("newdelhi");
	      
	     WebElement statedropdown = driver.findElement(By.id("state"));
	     Select state = new Select(statedropdown);
	     state.selectByVisibleText("GOA");
	     
	     
	     WebElement pincode = driver.findElement(By.id("pincode"));
	     pincode.sendKeys("220001");
	     
	     WebElement emailID = driver.findElement(By.id("emailid"));
	     emailID.sendKeys("abc@gummy.com");
	     WebElement submit = driver.findElement(By.className("bootbutton"));
	     submit.click();
	     
	     
	     
	     
		}
	

		

	}



package SeleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.get("https://selenium-prd.firebaseapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
        driver.findElement(By.id("password_field")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text() ='Login to Account']")).click();
        driver.close();
	}

}

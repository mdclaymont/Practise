package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPopUp extends MercaryFunction {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		//open URL
		
			GetData();
		BrowserConfig();
		OpenUrl("");
		ValidateUrl();	
		Thread.sleep(3000);
		//Move to login page
		driver.findElement(By.xpath("//a[@href='dashboard']")).click();
	
		Thread.sleep(3000);
		//Click on Google+ button
		driver.findElement(By.xpath("//*[@md-svg-src='images/icons/google.svg']")).click();
		Thread.sleep(3000);
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();


		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		    System.out.println("Window switch");
		    System.out.println(driver.getTitle());
		    if (driver.getTitle().contains("Sign in"))
		    {
		        Thread.sleep(3000);
		        driver.findElement(By.id("Email")).sendKeys("xxxxxx@gmail.com");
		        System.out.println("Email found");
		        driver.findElement(By.id("next")).click();
		        System.out.println("Next found");
		        Thread.sleep(2000);
		        driver.findElement(By.id("Passwd")).sendKeys("xxxxxxx");
		        System.out.println("Password found");
		        Thread.sleep(3000);
		        driver.findElement(By.id("signIn")).click();
		        Thread.sleep(1000);
		    }
		}

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		

	}

}

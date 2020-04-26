package CrigList;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.quit();
		driver.get("https://mercari.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'mypage')]/div")).click();
		driver.findElement(By.xpath("//p[contains( text(),'Sign in')]")).click();

		Thread.sleep(15000);


		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// WebElement UserElement = wait.until(ExpectedConditions.);
		//  passwordElement.click();
		//driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("text");
		//driver.findElement(By.xpath("//div[contains(@class,'withSplitModal__HalfContainer')]/form/div[1]")).sendKeys("test");
		//Class<? extends WebElement> UserId=driver.findElement(By.xpath("//input[@type='email' and @name='email']")).getClass();
		//driver.findElement(By.xpath("//button[@type='submit']/preceding-sibling::div[4]")).getClass()
		/*

		//System.out.println(UserId);
		//.sendKeys("est");
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("mdrezaul0@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester@7453");
		driver.findElement(By.xpath("//button[@type='submit' or text()='Sign in']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[contains(text(),'Sell on Mercari')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Sell on Mercari')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Drag and drop files')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Create a title for your item']")).sendKeys("LCD And Touch Screen For Iphone");
		driver.findElement(By.xpath("//*[@placeholder='Describe your item']")).sendKeys("NEW iPhone 7 White Screen Replacement Ships out the SAME DAY! Premium quality touch screen with LCD display & frame Brand new, not pulled from a phone Every LCD is tested in house and are 100% working Camera Bezel + Ear mesh + Sensor Ring pre-installed for easier assembly Packed safely in bubble wrap envelope Used to replace a faulty screen: display problems, dead pixels, cracked glass, LCD problems, or wrong color issues Compatible With ALL Models for the iPhone 7 Package Contents: 1 x (outer glass with touch digitizer + retina LCD screen + ear mesh + supporting frame) Feel free to message me if you have any questions! We can offer discounted prices on more quantities if you want diffrent color please text me Thank You");
		driver.findElement(By.xpath("//*[contains(text(),'CATEGORY')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Replacement parts & tools')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter a brand name']")).sendKeys("Generic Brand");
		driver.findElement(By.xpath("//*[contains(text(),'New with tags')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter 5-digit Zip Code']")).sendKeys("19703");
		driver.findElement(By.xpath("//input[@name='sellShippingPayerId']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Prepaid label')]")).click();
		driver.findElement(By.xpath("//div[starts-with(@class,'ShippingClassModal')]/div[1]")).click();
		driver.findElement(By.xpath("//span[@id='shippo_usps']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("20");

		/*
		driver.findElement(By.linkText("Sell on Mercari")).click();
		driver.findElement(By.linkText("Sell now")).click();
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[3]/input")).sendKeys("LCD And Touch Screen For Iphone");
		driver.findElement(By.xpath("//*[@placeholder='Describe your item']")).sendKeys("NEW iPhone 7 White Screen Replacement Ships out the SAME DAY! Premium quality touch screen with LCD display & frame Brand new, not pulled from a phone Every LCD is tested in house and are 100% working Camera Bezel + Ear mesh + Sensor Ring pre-installed for easier assembly Packed safely in bubble wrap envelope Used to replace a faulty screen: display problems, dead pixels, cracked glass, LCD problems, or wrong color issues Compatible With ALL Models for the iPhone 7 Package Contents: 1 x (outer glass with touch digitizer + retina LCD screen + ear mesh + supporting frame) Feel free to message me if you have any questions! We can offer discounted prices on more quantities if you want diffrent color please text me Thank You");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[5]/div/div/p[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[4]/div/div/div/div/div[4]/div/p[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"downshift-0-input\"]")).sendKeys("Generic Brand");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[9]/div[2]/div[1]/div[1]/label/div/p[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[11]/input")).sendKeys("19703");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='sellShippingPayerId']")).click();
		driver.findElement(By.xpath("//*[@id=\"prepaid\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[2]/div/div/div/div[5]/div[2]/div/div/div/div/div[1]/svg/rect")).click();
		driver.findElement(By.xpath("//*[@id=\"shippo_usps\"]/svg")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[2]/div/div/div/div[6]/button")).click();



		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[13]/input")).sendKeys("20");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div/div[15]/button")).click();

		 */
	}

}

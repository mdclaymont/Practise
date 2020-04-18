package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowAuHandle {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver,chrome,driver","/AllCommonItem2/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions ac=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.mercari.com/");
		//driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(3000);
		//ac.moveToElement();
		WebElement p=driver.findElement(By.xpath("//@type='search']"));
		ac.moveToElement(p).build().perform();
		Thread.sleep(5000);
		WebElement q=driver.findElement(By.xpath("//*[text()='Tell me more']"));
		
		//ac.keyDown(Keys.ARROW_DOWN);
		ac.moveToElement(q).click();
		
		

	}

}

package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		//driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).click();
		WebElement ObjSer=driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']"));
		ObjSer.sendKeys("MUM");
		Thread.sleep(2000);
		ObjSer.sendKeys(Keys.ARROW_DOWN);
		ObjSer.sendKeys(Keys.DOWN);
		String Ser=ObjSer.getText();
		System.out.println(Ser);
		//driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
		
		
		

	}

}

package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebElement CheckSelect=driver.findElement(By.xpath("//input[contains(@id,'_friendsandfamily')]"));
		CheckSelect.isSelected();
		Assert.assertFalse(CheckSelect.isSelected());
		CheckSelect.click();
		Assert.assertTrue(CheckSelect.isSelected());
	//	Assert.assertEquals(13,CheckSelect.getSize());
	
	
	
	}

}

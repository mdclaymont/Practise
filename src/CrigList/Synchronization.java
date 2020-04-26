package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(8,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		Thread.sleep(3000);
		//explicity wait
		WebDriverWait objWait=new WebDriverWait(driver,5);
		objWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));

	}

}

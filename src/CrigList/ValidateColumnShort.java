package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateColumnShort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cricbuzz.com/live-cricket-scorecard");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='India v Bangladesh,2nd Test - IND Won']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Scorecard')]")).click();
		WebElement objFirst=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		

	}

}

package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//General Chrome Profile
		DesiredCapabilities objCap=DesiredCapabilities.chrome();
		objCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		objCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		ChromeOptions objOption=new ChromeOptions();
		objCap.merge(objOption);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(objOption);
		driver.get("https://ksrtc.in/oprs-web");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// driver.findElement(By.id("fromCity")).click();
		// driver.findElement(By.xpath("//input[@type='text' and
		// @placeholder='From']")).click();
		WebElement objFrom = driver.findElement(By.id("fromPlaceName"));
		String selectValue="BENGALURU DARSHINI";

	}

}

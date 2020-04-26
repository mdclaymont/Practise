package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogIn {
	static String browser;
	static WebDriver driver;
	static String Url;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBrowser();
		setUrl();
		setBrowserConfig();
		setUrlConfig();
		setRun();
		setSelect();

	}
	
		public static void setBrowser() {
			browser="chrome";
		}
		
		public static void setUrl() {
			Url="https://delaware.craigslist.org";
		}
		public static void setBrowserConfig() {
			if(browser.contains("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
					driver=new ChromeDriver();
				}
		}

		public static void setUrlConfig() {
			driver.get(Url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		}
		public static void setValidateUrl() {
			driver.getCurrentUrl();
			
		}
		public static void setSelect() {
			Select Objselect=new Select(driver.findElement(By.name("areaabb")));
			Objselect.selectByVisibleText("delaware, DE, US");
			
			
		}
		public static void setRun() {
			
			driver.findElement(By.linkText("my account")).click();
			driver.findElement(By.id("inputEmailHandle")).sendKeys("iphonepnt@gmail.com");
			driver.findElement(By.name("inputPassword")).sendKeys("Tester@7453");
			driver.findElement(By.id("login")).click();
			Select Objselect=new Select(driver.findElement(By.name("areaabb")));
			Objselect.selectByVisibleText("delaware, DE, US");
			driver.findElement(By.xpath("//button[@value='go']")).click();
			driver.findElement(By.xpath("/html/body/article/section/form/ul/li[6]/label/span[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"new-edit\"]/div/label/label[18]/input")).click();
			driver.findElement(By.xpath("//input[@name='PostingTitle']")).sendKeys("Iphone 7 Plus Unlocked");
			driver.findElement(By.xpath("//input[@name='postal']")).sendKeys("19703");
			driver.findElement(By.xpath("//*[@name='PostingBody']")).sendKeys("Clean I phone Nothing Wrong Clean Imei Factory reset No Scratch Or Cracked on Screen");
			driver.findElement(By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();
			//Select ObjOs=new Select(driver.findElement(By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]")));
		//	ObjOs.selectByIndex(2);
			driver.findElement(By.xpath("//*[@id=\"new-edit\"]/div/fieldset[2]/div/fieldset/div/label")).click();
			driver.findElement(By.xpath("//*[@name='contact_phone']")).sendKeys("9294215155");
			driver.findElement(By.xpath("//*[@value='continue']")).click();
			driver.findElement(By.xpath("//*[@id=\"leafletForm\"]/button")).click();
			driver.findElement(By.xpath("//button[@value='Done with Images']")).click();
			driver.findElement(By.xpath("//button[@value='Continue']")).click();
		
		
		}
}

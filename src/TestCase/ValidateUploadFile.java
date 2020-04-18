package TestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import allcommonitem.Function;

public class ValidateUploadFile {
	public static String DownLoadPathwFile;
	public static String DownLoadFilePath;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String p=System.getProperty("user.dir");
		DownLoadPathwFile=p+"/"+DownLoadFilePath;
		System.out.println(p);
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\AllCommonItem2\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//*[text()='Choose File']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\Software Testing\\Selenium\\AutoIt\\test.exe"+" "+"F:\\maysale\\priormonth.pdf" );
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[text()='Convert Now!']")).click();
		WebDriverWait ExWait=new WebDriverWait(driver,15);
		ExWait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Download Now']")));
		driver.findElement(By.xpath("//*[text()='Download Now']")).click();
		
*/
		
		File ofd=new File(p);
	}

}

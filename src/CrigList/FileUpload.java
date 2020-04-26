package CrigList;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://post.craigslist.org/k/XAb7228V6hG6zxZ1SUf2bQ/g9NVq?s=editimage");
		driver.findElement(By.id("plupload")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\Software Testing\\Selenium\\AutoIt\\MultiFile.exe"+" "+"F:\\SellPicture\\Iphone8Plus\\G1.JPG");
		Thread.sleep(6000);
		driver.findElement(By.id("plupload")).click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("F:\\Software Testing\\Selenium\\AutoIt\\MultiFile.exe"+" "+"F:\\SellPicture\\Iphone8Plus\\G2.JPG");
		Thread.sleep(6000);
		driver.findElement(By.id("plupload")).click();
		Thread.sleep(7000);
		Runtime.getRuntime().exec("F:\\Software Testing\\Selenium\\AutoIt\\MultiFile.exe"+" "+"F:\\SellPicture\\Iphone8Plus\\G3.JPG");
		
		
	}

	//https://post.craigslist.org/k/XAb7228V6hG6zxZ1SUf2bQ/g9NVq?s=editimage
	
	
}

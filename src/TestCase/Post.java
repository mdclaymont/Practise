package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import allcommonitem.Function;

public class Post extends MMFunction {

	public static void main() {
		// TODO Auto-generated method stub
		
		

	}
	@BeforeMethod
	public void Log() throws IOException, InterruptedException
	{
		Function.GetData();
		Function.BrowserConfig();
		Function.OpenUrl("");
		myPage();
	  //  HomePageInit();
		SignInH();
		UserId();
		Thread.sleep(2000);
		UserPassword();
		SignInS();
		Thread.sleep(5000);
		SellOnMerCari();
		Thread.sleep(5000);
		SellNow();
	}
	@Test
	public static void Lcd7Post() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		PhotoUploadClick();
		Thread.sleep(5000);
		FileUploadAutoIt("F:\\Software Testing\\Selenium\\AutoIt\\MultiFile.exe"+" "+"F:\\SellPicture\\LCdScreen\\S6.PNG");
		Thread.sleep(6000);
		Title("Iphone 7 Lcd Screen");
		Description();
		Tag("LCDScreen Iphone");
		Catagory();
		AutoSCatagory("Replacement parts & tools");
		Thread.sleep(3000);
		Brand("No Brand");
		Condition("New");
		ZipCode("19703");
		Shiping();
		EditShhiping();
		OfferShiping("no");
		SWeight("2");
		Calculate();
		SUsps();
		Save();
		SetPrice("20");
		Thread.sleep(4000);
		List();
	}
	@Test
	public static void Lcd7PlusPost() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		PhotoUploadClick();
		Thread.sleep(5000);
		FileUploadAutoIt("F:\\Software Testing\\Selenium\\AutoIt\\MultiFile.exe"+" "+"F:\\SellPicture\\LCdScreen\\S7.PNG");
		Thread.sleep(6000);
		Title("Iphone 7 Plus Lcd Screen");
		Description();
		Tag("LCDScreen Iphone");
		Catagory();
		AutoSCatagory("Replacement parts & tools");
		Thread.sleep(3000);
		Brand("No Brand");
		Condition("New");
		ZipCode("19703");
		Shiping();
		EditShhiping();
		OfferShiping("no");
		SWeight("2");
		Calculate();
		SUsps();
		Save();
		SetPrice("20");
		Thread.sleep(4000);
		List();
	}
		@AfterMethod
		public static void urlClose()
		{
			CloseUrl("");
		}
	
}

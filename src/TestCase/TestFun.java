package TestCase;

import java.io.IOException;

import allcommonitem.Function;



public class TestFun extends MMFunction {
	public static void main(String[] args) {
		
		try {
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		try {
			Function.GetData();
			 Function.BrowserConfig();
			 Function.OpenUrl("");
		     HomePageInit();
			 Search();
			 sellMercari();
		 } catch(Exception e)
	 	{
			System.out.println(e); 
	 	}
		finally
		{
			Function.CloseUrl("");
		}
		
		*/
	}


}

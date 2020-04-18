package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectRepository.DetailsPageFind;
import allcommonitem.Function;

public class TestFForTestNG extends Function {
	public static DetailsPageFind dpf;
	
	public TestFForTestNG()
	{
		super();
	}
	public static void main() {
		// TODO Auto-generated method stub
		//call page factory for initilize
		
		try {
			demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Home();
		
		
	}
	@BeforeMethod()
	public static  void demo() throws IOException
	{

		OpenUrl("");
		// TODO Auto-generated method stub 
		dpf=new DetailsPageFind();
	}	
	@Test()
	public static void Home()
	{
		 dpf.OnMercari();
		 dpf.Search1();
	}
	//	 MMFunction.FindPage();
		// MMFunction.sellMercari();
	//	myPage();
	/*	SignInH();
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
		Cancel();
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
		
		*/
		
	//	CloseUrl("");

	
}

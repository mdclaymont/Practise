package TestCase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ObjectRepository.DetailsPageFind;
import ObjectRepository.HomePage;
import ObjectRepository.SignInPage;
import allcommonitem.Function;

public class MFunction extends Function {
//	public static WebDriver driver;
	public static Function oF=new Function();
	public static SignInPage sp=new SignInPage(driver);
	public static HomePage hp=new HomePage(driver);
	public static DetailsPageFind dp=new DetailsPageFind(Function.driver);
	//public static  DetailsPage dp=PageFactory.initElements(MFunction.driver,DetailsPage.class);
	public static void GetData() throws IOException {
		oF.GetData();
	}
	public static void BrowserConfig() {
		oF.BrowserConfig();
	}
	public static void OpenUrl(String ExpectedUrl){
		oF.OpenUrl(ExpectedUrl);
	}	
	public static void ValidateUrl(){
		oF.ValidateUrl();
	}
	public static  void myPage() throws InterruptedException
	{
		int totallink=hp.myPage().size();
		for(int i=0;i<totallink;i++)
		{
			String Actual=hp.myPage().get(i).getAttribute("href");
			if(Actual.contains("/mypage/"))
			{
				hp.myPage().get(i).click();
				break;
			}
		}
	}
	public static void signIn(){
		hp.signIn().click();
	}
	public static void LogIn() throws InterruptedException
	{
		sp.userId().sendKeys(UserId);		
		ValidateInputValue(sp.userId(),UserId);
	    sp.passWord().sendKeys(UserPassword);
	    ValidateInputValue(sp.passWord(),UserPassword);
	}
	public static void SSignIn() {
		sp.signIn().click();
	}
	public static void SellOn() throws InterruptedException
	{
		if(hp.sellOnMercari().isDisplayed()){
			Assert.assertTrue(true,"The Expected Sell on Mercari Is Displayed");	
			System.out.println("The Expected Sell on Mercari Is Displayed");
			Thread.sleep(2000);
			hp.sellOnMercari().click();
		}
		else{
			Assert.assertFalse(false,"The Expected Sell on Mercari Is Not Displayed");	
			System.out.println("The Expected Sell on Mercari does not Displayed");
		}
		
	}
	public static void SellNow()
	{
		hp.sellNow().click();
	}
	
	
	
	
	public static void search() {
		hp.Search().sendKeys("iphone");
		
	}

	public static void search1() {
		dp.Search().sendKeys("iphone");
		
	}
		/*
	
	public static void UploadPhoto() {
		((DetailsPage) dp).SelectPhoto().click();
	}
	public static void Title(String ExpTitle)
	{
		if(ExpTitle.isEmpty())
		{
			Title=Title;
		}
		else
		{
			Title=ExpTitle;
		}
		((DetailsPage) dp).Title().sendKeys(Title);
	}
	
	
	*/
	
	
	
	
	
}










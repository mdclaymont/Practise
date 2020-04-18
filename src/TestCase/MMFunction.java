package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import ObjectRepository.DetailsPage;
import ObjectRepository.DetailsPageFind;
import ObjectRepository.HomePage;
import ObjectRepository.SignInPage;
import allcommonitem.Function;

public class MMFunction extends Function {
	
	public static String Title;
	public static String CheckText;
	
	public static HomePage hp=new HomePage();
	public static SignInPage sp=new SignInPage();
	public static DetailsPage dp=new DetailsPage();
	public static DetailsPageFind dpf;
	//Find Page Factor function but not working for public need some work
	public static void main(String[] args) {
			
	}
	
	public static void HomePageInit() {
		dpf=PageFactory.initElements(driver,DetailsPageFind.class);
	}
	public static void Search() {
		dpf.Search().sendKeys("Testiphone");
	}
	public static void sellMercari() {
		dpf.sellOnMercari().click();
	}
	///*******************************Sign In page Action**************************************************************
	public static void UserId()
	{
		sp.userId().sendKeys(UserId);		
		Function.ValidateInputValue(sp.userId(),UserId);
	}
	public static void UserPassword()
	{
		sp.passWord().sendKeys(UserPassword);	
		Function.ValidateInputValue(sp.passWord(),UserPassword);
	}
	public static void SignInS()
	{
		sp.signIn().click();
	}
	//******************************Home Page Action*************************************************************

	public static void myPage() throws InterruptedException, IOException
	{
		hp.myPage();
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
		takeScreenShot("myPage");	
	}
	public static void SignInH()
	{
		hp.signIn().click();
	}
	
	public static void SellOnMerCari()
	{
		Reporter.log("******************************************Sell On MerCari Click Staretd******************************************");
		System.out.println("******************************************Sell On MerCari Click Staretd**************************************");
		if(hp.sellOnMercari().isDisplayed())
		{
			Assert.assertTrue(true,"The Expected Sell on Mercari Is Displayed");	
			System.out.println("The Expected Sell on Mercari Is Displayed");
			hp.sellOnMercari().click();
		}
		else
		{
			Assert.assertFalse(false,"The Expected Sell on Mercari Is Not Displayed");	
			System.out.println("The Expected Sell on Mercari does not Displayed");
		}
		
		Reporter.log("******************************************Sell On MerCari Cliked Ended******************************************");
		System.out.println("******************************************Sell On MerCari Clicked Ended**************************************");
		
	}
	public static void SellNow()
	{
		hp.sellNow().click();
	}
	
	/// ******************************Description Page **************************************
	
	public static void PhotoUploadClick()
	{
		dp.selectPhoto().click();
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
		dp.Title().sendKeys(Title);
	}
	
	public static void Description()
	{
		dp.Description().sendKeys(Description);
	}
	public static void Tag(String ExpectedTagName)
	{
		dp.Tag().sendKeys(ExpectedTagName);
	}
	public static void Catagory()
	{
		dp.Catagory().click();
	}
	public static void AutoSCatagory(String CatagoryName)
	{
		driver.findElement(By.xpath("//*[contains(text(),'"+CatagoryName+"')]")).click();
	}
	public static void Catagory1(String ExCatagory)
	{
		Boolean flag=dp.Cancel().isDisplayed();
		if(flag==true)
		{
			dp.Cancel().click();
		}
		dp.openMenu().click();
		int TotalList=dp.downShift().size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=dp.downShift().get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				dp.downShift().get(i).click();
				break;
			}
		}
	}
	public static void Catagory2(String ExCatagory)
	{
		int TotalList=dp.downshift2().size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=dp.downshift2().get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				dp.downshift2().get(i).click();
				break;
			}
		}
	}
	public static void Catagory3(String ExCatagory)
	{
		int TotalList=dp.downshift3().size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=dp.downshift3().get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				dp.downshift3().get(i).click();
				break;
			}
		}
	}
	public static void Brand(String ExpectedBrandName)
	{
		dp.Brand().click();
		dp.Cancel().click();
		dp.Brand().sendKeys(ExpectedBrandName);
	}
	public static void Cancel()
	{
		dp.Cancel().click();
	}
	
	
	public static void Condition(String ExCondition)
	{
		if((ExCondition.toLowerCase()).contains("good"))
		{
			dp.ConditionG().click();
		}
		else
		{
			dp.ConditionN().click();
		}
		
	}
	
	public static void ZipCode(String ExZipCode)
	{
		dp.ZipCode().sendKeys(ExZipCode);
	}
	public static void Shiping()
	{
		dp.Shiping().click();
	}
	public static void EditShhiping()
	{
		dp.EditShhiping().click();
	}
	public static void OfferShiping(String ExpectedOffer)
	{
		if((ExpectedOffer.toLowerCase()).contains("yes"))
		{
			dp.shipingYes().click();
		}
		else
		{
			dp.shipingNo().click();
		}
	}
	public static void SWeight(String ExpWight)
	{
		dp.Weight().sendKeys(ExpWight);
	}
	public static void Calculate()
	{
		dp.calShiping().click();
	}
	public static void SUsps()
	{
		dp.shipByUsps().click();
	}
	public static void Save()
	{
		dp.Save().click();
	}
	public static void SetPrice(String ExPrice)
	{
		dp.SellPrice().sendKeys(ExPrice);
	}
	public static void List()
	{
		dp.List().click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

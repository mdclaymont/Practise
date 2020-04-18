package TestCase;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ObjectRepository.HomePage;
import ObjectRepository.SignInPage;

import org.openqa.selenium.remote.RemoteWebDriver;
import allcommonitem.Function;
public class MercaryFunction {
	public static WebDriver driver;
	public static String DomainName;
	public static String BrowserName;
	public static String UserUrl;
	public static String UserId;
	public static String UserPassword;
	public static String MercaryDercription;
	public static String Description;
	public static String Title;
	public static String CheckText;
	public static Logger Log=LogManager.getLogger(MercaryFunction.class.getName());
	static Function oF=new Function();
	
	
	public static void main() throws IOException {
		// TODO Auto-generated method stub
		

	}
	public static void GetData() throws IOException {
		oF.GetData();
	}
	public static void BrowserConfig() {
		oF.BrowserConfig();
	}
	public static void OpenUrl(String ExpectedUrl){
		oF.OpenUrl(ExpectedUrl);
	}	
	static SignInPage sp=new SignInPage(driver);
	static HomePage hp=new HomePage(driver);
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ExpWait
	*  Function Arg: Locator identifyer 
	*  FunctionOutPut: It will wait until element visible 
	* 
	* **************************************************************************************************************
	*/
	
	public static void ExpWait(String Locator ){
	oF.ExpWait(Locator );
	}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateUrl
	*  Function Arg: ExpectedUrl(Which Url You want work for)
	*  FunctionOutPut: It will open Url That you want Automated
	* 
	* **************************************************************************************************************
	*/
		
	public static void ValidateUrl(){
		oF.ValidateUrl();
	}
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
    *  Function Name: ValidateText
	*  Function Arg: ExpectedText And Actual Text
	*  FunctionOutPut: It will Validate Expected Text And Actual Text
	* 
	* **************************************************************************************************************
	*/
		
	public static void ValidateText(String expectedText,String actualText) {
	oF. ValidateText(expectedText,actualText);
	}
		
	/***************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateHeader
	*  Function Arg: actualHeader(Get From Application header),expectedHeader
	*  FunctionOutPut: It will Validate Expected Header and Actual Header
	* 
	* **************************************************************************************************************
	*/
		
	public static void ValidateHeader(String expectedHeader, String actualHeader) {
			
		oF.ValidateHeader(expectedHeader,actualHeader);
	}
	
	/****************************************************************************************************************
    *  Author: Md Rezaul Karim 
	*  Function Name: ValidateClick
	*  Function Arg: expectedClick Its Element sent from method,TextElement=>Text Element Name That Clicked
	*  FunctionOutPut: It will Validate Expected Element Clicked Or Not
	* 
	* **************************************************************************************************************
	*/
		
	public static void ValidateClick(WebElement expectedClick,String TextElement){
		oF.ValidateClick(expectedClick,TextElement);
	}
		
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateInputValue
	*  Function Arg: expectedEditElement Its Element sent from method,ActualEditValue=>The Value That Will Set on Input Field
	*  FunctionOutPut: It will Validate Expected Input Value Set On Input Filed or Not
	* 
	* **************************************************************************************************************
	*/
	
	public static void ValidateInputValue(WebElement expectedEditElement,String ActualEditValue) {
		oF.ValidateInputValue(expectedEditElement,ActualEditValue);
	}
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateInputValue
	*  Function Arg: expectedDropElement Its Element sent from method,ActualSelectedValue=>The Value That Will Set on Input Field
	*  FunctionOutPut: It will Validate Expected Input Value Set On Input Filed or Not
	* 
	* *
	 * @throws InterruptedException *************************************************************************************************************
	*/
	
	public static void ValidateDropValue(WebElement expectedDropElement,String ActualSelectedValue) throws InterruptedException {
			
		oF.ValidateDropValue(expectedDropElement,ActualSelectedValue);
	}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateStringShort
	*  Function Arg: expectedEditElement Its Element sent from method,ActualEditValue=>The Value That Will Set on Input Field
	*  FunctionOutPut: It will Validate Expected Input Value Set On Input Filed or Not
	* 
	* **************************************************************************************************************
	*/
	//public static void ValidateStringShort(String ExpectedValue[], String Locator) {
	//	
	///	oF.ValidateStringShort(ExpectedValue[],Locator);

	//}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: ValidateBrookenLink
	*  Function Arg: expectedEditElement Its Element sent from method,ActualEditValue=>The Value That Will Set on Input Field
	*  FunctionOutPut: It will Validate Expected Input Value Set On Input Filed or Not
	* 
	* **************************************************************************************************************
	*/

	public static void ValidateBrookenLink(String Locator, int TotalLink) throws InterruptedException {

		oF.ValidateBrookenLink(Locator, TotalLink);
	}
		
	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name: GetInput
	 *  Function Arg: No Arguments
	 *  FunctionOutPut: It will get input from keyboard
	 * 
	 * **************************************************************************************************************
	 */
	public static void  GetInput() {
		oF. GetInput();
	}
	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name:RandomNumeric
	 *  Function Arg: StringSize how many digit do you want Number
	 *  FunctionOutPut: It will get input from function and return Random numeric Number String
	 * 
	 * **************************************************************************************************************
	 */
	public static String  RandomNumeric(int StringSize) {
		
		return oF.RandomNumeric(StringSize);
		
	}
	
	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name:RandomDecemial
	 *  Function Arg: StringSize how many digit do you want Number
	 *  FunctionOutPut: It will get input from function and return Random numeric Number String
	 * 
	 * **************************************************************************************************************
	 */
	public static String RandomDecemial (int StringSize) {
		
		return oF.RandomDecimal (StringSize);
		
	}
	
	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name:RandomAlphaNumeric
	 *  Function Arg: StringSize how many digit do you want string
	 *  FunctionOutPut: It will get input from function and return Random Alpha numeric String
	 * 
	 * **************************************************************************************************************
	 */
	public static String RandomAlphaNumeric(int StringSize) {
		return oF.RandomAlphaNumeric( StringSize);
	}

	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name:RandomUpperLower
	 *  Function Arg: StringSize how many digit do you want string
	 *  FunctionOutPut: It will get input from function and return Random Alpha  character upper and lower case String
	 * 
	 * **************************************************************************************************************
	 */
	public static String RandomUpperLower(int StringSize) {
		
		return oF.RandomUpperLower(StringSize);
	}

	/****************************************************************************************************************
	 *  Author: Md Rezaul Karim 
	 *  Function Name:RandomAlphaNumericSpeceal
	 *  Function Arg: StringSize how many digit do you want string
	 *  FunctionOutPut: It will get input from function and return Random Alpha numeric and special character String
	 * 
	 * **************************************************************************************************************
	 */
	public static String RandomAlphaNumericSpeceal(int StringSize) {
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"+"!@#$%^&*()_+<>?"+ "abcdefghijklmnopqrstuvxyz"; 
		StringBuilder objString = new StringBuilder(StringSize);
		for(int i=0;i<StringSize;i++)
		{
			// generate a random number between 
            // 0 to AlphaNumericString variable length 
			int index=(int) (AlphaNumericString.length()*Math.random());
			objString.append(AlphaNumericString.charAt(index));
		}
		String RandomAlphaNumericSpeceal=objString.toString();
		System.out.println(objString.toString());
		return RandomAlphaNumericSpeceal;
		
	}
	
	
	
		
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: CloseExpectedWindow
	*  Function Arg: ExpectedTabClose(it will take number of child window tab that user want close
	*  FunctionOutPut: close child window
	* 
	* **************************************************************************************************************
	*/
	
	public static void CloseExpectedWindow(String ExpectedTabClose){
		
		String[] ExTab=ExpectedTabClose.split(",");
		int totalTab=ExTab.length;
		String PareantWindow=driver.getWindowHandle();
		System.out.println("No. of tabs: " + PareantWindow);
		Set<String> objWhandles = driver.getWindowHandles();
		ArrayList<String> objTab=new ArrayList<>(objWhandles);
		int TotalWindow=objWhandles.size();
		for(int i=0;i<totalTab;i++)
			{
				driver.switchTo().window(objTab.get(Integer.parseInt(ExTab[i]))).close();
				System.out.println("No. of tabs: " +TotalWindow);	
			}
			driver.switchTo().window(PareantWindow);
	}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: CloseAllChildWindow
	*  Function Arg: it will close all  child window tab that user open
	*  FunctionOutPut: close all child window
	* 
	* **************************************************************************************************************
	*/
		
	public static void CloseAllChildWindow(){
		
		String PareantWindow=driver.getWindowHandle();
		System.out.println("No. of tabs: " + PareantWindow);
		Set<String> objWhandles = driver.getWindowHandles();
		int TotalWindow=objWhandles.size();
		for(String child:objWhandles)
			{
				if(!PareantWindow.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child).close();
					System.out.println("No. of tabs: " +TotalWindow);
				}
			}
			driver.switchTo().window(PareantWindow);
	}
		
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: FileUploadAutoIt
	*  Function Arg: FilePath where auto it script is available
	*  FunctionOutPut: It will handle windows base pop up and 
	* 
	* **************************************************************************************************************
	*/
		
	public static void FileUploadAutoIt(String FilePath) throws IOException{
		
		Runtime.getRuntime().exec(FilePath);
	}

	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: GetDataExcel
	*  Function Arg: SheetName, ExcellFilePath
	*  FunctionOutPut: It will bring data from excell sheet
	* 
	* **************************************************************************************************************
	*/
		
	public static void GetDataExcel(String SheetName, String ExcellFilePath) throws IOException{
		
		 oF.GetDataExcel(SheetName,ExcellFilePath);
	}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: SelectStaticDropDown
	*  Function Arg: String Locator, String SelectBy, String value
	*  FunctionOutPut: It will bring data from excell sheet
	* 
	* **************************************************************************************************************
	*/
	public static void SelectStaticDropDown(String Locator, String SelectBy, String value) throws InterruptedException {
		
		WebElement objElement = driver.findElement(By.xpath(Locator));
		List<WebElement> ObjAd=driver.findElements(By.xpath(Locator+"/option"));
		Select objList = new Select(objElement);
		if ((SelectBy.toLowerCase()).contains("index"))
			{
				int IndexValue = Integer.parseInt(value);
				String AcValue=ObjAd.get(IndexValue).getAttribute("value");
				objList.selectByIndex(IndexValue);
				value=AcValue;
			}
		else if ((SelectBy.toLowerCase()).contains("text"))
			{
				objList.selectByVisibleText(value);
			}
		else 
			{
				objList.selectByValue(value);
			}
		ValidateDropValue(objElement,value);	
	}
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: selectDropDownvalue
	*  Function Arg: String Locator, String value
	*  FunctionOutPut: It will Select value from drop down when drop down is not able to select by select tag
	* 
	* **************************************************************************************************************
	*/
	
	public static void selectDropDownvalue(String Locator, String ExpectedValue) {
		
		String currentList;
		String SLocator;
		ExpectedValue=(ExpectedValue.trim()).toLowerCase();
		if(Locator.contains("option"))
		{
			SLocator=Locator.replace("/option","");
			
		}
		else
		{
			SLocator=Locator;
		}
		WebElement objElement = driver.findElement(By.xpath(SLocator));
		List<WebElement> DropList = driver.findElements(By.xpath(Locator));
		int listsize = DropList.size();
		for (int i = 0; i < listsize; i++)
		{
			currentList = DropList.get(i).getText();
			if ((currentList.toLowerCase()).contains(ExpectedValue))
			{
				DropList.get(i).click();
				break;
			}
		}
		try {
			ValidateDropValue(objElement,ExpectedValue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: AutoDropDown
	*  Function Arg: String Locator, String value
	*  FunctionOutPut: It will Select value from drop down when drop down is not able to select by select tag
	* 
	* **************************************************************************************************************
	*/
	
	public static void AutoDropDown(String Locator, String ExpectedValue) {
		
		WebElement objFrom = driver.findElement(By.xpath(Locator));
		objFrom.clear();
		objFrom.sendKeys(ExpectedValue);
		objFrom.sendKeys(Keys.ARROW_DOWN);
		objFrom.sendKeys(Keys.ENTER);
	}
	

	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: AutoSuggestDropDown
	*  Function Arg: String Locator, String value
	*  FunctionOutPut: It will Select value from drop down when drop down is not able to select by select tag
	* 
	* **************************************************************************************************************
	*/
		
	public static void AutoSuggestDropDown(String Locator, String ScriptLocator, String selectValue) {
		
		WebElement objFrom = driver.findElement(By.xpath(Locator));
		objFrom.sendKeys(selectValue);
		JavascriptExecutor objJs = (JavascriptExecutor) driver;
		String getText = (String) objJs.executeScript(ScriptLocator);
		int i = 0;
		while (!selectValue.equalsIgnoreCase(getText))
		{
			objFrom.sendKeys(Keys.DOWN);
			System.out.println(getText);
			i++;
			if (i > 10)
			{
				System.out.println("There Is No Such Searchable Text Exist:");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/****************************************************************************************************************
	*  Author: Md Rezaul Karim 
	*  Function Name: SetClander
	*  Function Arg: String Locator, String value
	*  FunctionOutPut: It will Select value from drop down when drop down is not able to select by select tag
	* 
	* **************************************************************************************************************
	*/
	
	public static void SetClander(String dateLocator, String monthLocator, String yearLocator, String nextLocator,String expectedDate) throws InterruptedException {
		
		String expDate[] = expectedDate.split("/");
		List<WebElement> objDate = driver.findElements(By.xpath(dateLocator));
		if (expDate[2].length() < 3)
			{
				expDate[2] = ("20" + expDate[2]);
			}
		else 
			{
				expDate[2] = expDate[2];
			}
		for (int i = 0; i < 11; i++)
		{
			WebElement objMonth = driver.findElement(By.xpath(monthLocator));
			WebElement objYear = driver.findElement(By.xpath(yearLocator));
			String month = objMonth.getText();
			String year = objYear.getText();
			if (month.contains(expDate[0]))
				{
					if (year.contains(expDate[2]))
						{
							break;
						}
				} 
			else
				{
					driver.findElement(By.xpath(nextLocator)).click();
				}
		}
		List<WebElement> listDate = driver.findElements(By.xpath(dateLocator));
		int totalDate = listDate.size();
		for (int i = 0; i < totalDate; i++)
		{
			String actualDate = listDate.get(i).getText();
			String reActualDate = actualDate.trim();
			if (reActualDate.contains(expDate[1]))
				{
					listDate.get(i).click();
					break;
				}
		}
	}	
	
	
	
	
	
	
	
	
	
	
	
	///Above Function for common
	
		public static void lnksign() {
			WebElement SignIn=driver.findElement(By.xpath("//p[text()='Sign in']"));
		//	driver.findElement(By.xpath("//a[@href='/mypage/']/div")).click();
			if(SignIn.isDisplayed()){
				Assert.assertTrue(true,"The Expected Sign In Button Is Displayed");	
				System.out.println("The Expected Sign In Button Is Displayed");
				SignIn.click();
				ValidateClick(SignIn,"Sign In");
			}
			else{
				Assert.assertFalse(false,"The Expected Sign In Button Is Not Displayed");	
				System.out.println("The Expected Sign In Button does not Displayed");
			}
			//driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("Test");
			
		}
		
		
		
	public static void myPage() throws InterruptedException
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
	}
	public static void AfterMypage()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[7]/div/a/div/svg")).click();
	}
	public static void SignIn() throws InterruptedException
	{
		sp.signIn().click();
		//driver.findElement(By.xpath("//p[text()='Sign in']")).click();
		
		sp.userId().sendKeys(UserId);		
		//WebElement UId=driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/div[1]/input"));
		//UId.sendKeys();
		ValidateInputValue(sp.userId(),UserId);
	    
	//	driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/div[3]/input")).sendKeys(UserPassword);
	//	driver.findElement(By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/button/p")).click();
	}
	public static void SellOn()
	{
		if(hp.sellOnMercari().isDisplayed()){
			Assert.assertTrue(true,"The Expected Sell on Mercari Is Displayed");	
			System.out.println("The Expected Sell on Mercari Is Displayed");
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
		driver.findElement(By.xpath("//input[@placeholder='Create a title for your item']")).sendKeys(Title);
	}
	public static void Descrip()
	{
		driver.findElement(By.xpath("//*[@placeholder='Describe your item']")).sendKeys(Description);
	}
	public static void Tag(String ExpectedTagName)
	{
		driver.findElement(By.xpath("//*[@placeholder='Add up to 3 tags (optional)']")).sendKeys(ExpectedTagName);
	}
	
	public static void Brand(String ExpectedBrandName)
	{
		driver.findElement(By.xpath("//*[@placeholder='Enter a brand name']")).sendKeys(ExpectedBrandName);
	}
	public static void ZipCode(String ExZipCode)
	{
		driver.findElement(By.xpath("//*[@placeholder='Enter 5-digit Zip Code']")).sendKeys(ExZipCode);
	}
	
	public static void SellValue(String ExPrice)
	{
		driver.findElement(By.xpath("//input[contains(@class,'SellPartial__NumberInput')]")).sendKeys(ExPrice);
	}
	public static void Condition(String ExCondition)
	{
		driver.findElement(By.xpath("//*[text()='"+ExCondition+"']")).click();
	}
	public static void Catagory1(String ExCatagory)
	{
		driver.findElement(By.xpath("//*[text()='CATEGORY']")).click();
		WebElement objC=driver.findElement(By.xpath("//*[contains(text(),'Cancel')]"));
		Boolean flag=objC.isDisplayed();
		if(flag==true)
		{
			objC.click();
		}
		
		driver.findElement(By.xpath("//button[@aria-label='open menu']")).click();
		
		List<WebElement> CList=driver.findElements(By.xpath("//div[contains(@class,'DownshiftSelect__Items')]"));
		int TotalList=CList.size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=CList.get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				CList.get(i).click();
				break;
			}
		}
	}
	public static void Catagory2(String ExCatagory)
	{
		List<WebElement> CList=driver.findElements(By.xpath("(//div[contains(@class,'DownshiftSelect__')])[2]"));
		int TotalList=CList.size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=CList.get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				CList.get(i).click();
				break;
			}
		}
	}
	public static void Catagory3(String ExCatagory)
	{
		List<WebElement> CList=driver.findElements(By.xpath("(//div[contains(@class,'DownshiftSelect__')])[3]"));
		int TotalList=CList.size();
		for(int i=0;i<TotalList;i++)
		{
			String GetListName=CList.get(i).getText();
			if(GetListName.contains(ExCatagory))
			{
				CList.get(i).click();
				break;
			}
		}
	}
	
	public static void AutoSCatagory(String CatagoryName)
	{
		driver.findElement(By.xpath("//*[text()='CATEGORY']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+CatagoryName+"')]")).click();
	}
	
	public static void Shiping()
	{
		driver.findElement(By.xpath("//*[text()='SHIPPING']")).click();
		
	}
	public static void ShipingOffer(String ExShiping)
	{
		driver.findElement(By.xpath("//button[text()='Edit shipping']")).click();
		driver.findElement(By.xpath("//span[@id='"+ExShiping+"']")).click();
	}
	public static void Weight(String ExWeight)
	{
		driver.findElement(By.xpath("//input[@name='weight_in_ounces']")).sendKeys(ExWeight);
		driver.findElement(By.xpath("//button[text()='Calculate shipping']")).click();
		driver.findElement(By.xpath("//span[@id='shippo_usps']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}
	
	public static void PhotoUpload(String ExPath)
	{
		driver.findElement(By.xpath("//*[contains(text(),'Drag and drop files')]")).click();
	}
	
	
	public static void List()
	{
		driver.findElement(By.xpath("//button[text()='List']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

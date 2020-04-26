package CrigList;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FunctionLibary {
	
	private static final String OutputType = null;
	static String browser;
	static WebDriver driver;
	static String expetedUrl;
	static String currentList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBrowser();
		setUrl();
		BrowserConfig();
		UrlConfig();
		setRun();
		// setSelect();

	}

	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "UserIdFirst";
		data[1][0] = "UserPasswordFirst";
		data[2][0] = "UserIdSecond";
		data[0][1] = "Userpassword Second";
		data[1][1] = "UserIdThard";
		data[2][1] = "UserPasswordThard";
		return data;
	}

	/*
	 * Function Name:SetBrowser Authur: Md Rezaul Karim
	 */
	public static void setBrowser() {
		browser = "chrome";
	}
	/*
	 * Function Name:SetUrl Authur: Md Rezaul Karim
	 */

	public static void setUrl() {
		// expetedUrl="https://delaware.craigslist.org";
		// expetedUrl="https://mercari.com";
		expetedUrl = "https://spicejet.com";
	}

	public static void BrowserConfig() {
		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.contains("firfox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// return driver;
	}

	public static void CapabilityBrowserConfig() {
		if (browser.contains("chrome")) {

			DesiredCapabilities objCap = DesiredCapabilities.chrome();
			objCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			objCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions objOption = new ChromeOptions();
			objCap.merge(objOption);
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(objOption);

		}
		if (browser.contains("firfox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// return driver;
	}

	public static void RemoteGrid() throws MalformedURLException {
		DesiredCapabilities objRc = new DesiredCapabilities();
		objRc.setBrowserName("chrome");
		objRc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"), objRc);
	}

	public static void UrlConfig() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(expetedUrl);

	}

	public static void ValidateUrl(String expetedUrl, String actualUrl) {
		actualUrl = driver.getCurrentUrl();
		if (actualUrl.contains(expetedUrl)) {
			System.out.println(actualUrl);
		}

	}

	public static void takeScreen() {

		//File ts=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(ts,new File("F:\\Software Testing\\Selenium\test.png"));
	

	}

	public static void ValidateHeader(String expectedHeader, String actualHeader) {

		actualHeader = driver.getTitle();
		if (actualHeader.contains(expectedHeader)) {
			System.out.println(actualHeader);
		}
	}
	public static void ValidateShortTable(String ExpectedValue[],String Locator)
	{
		List<WebElement> objCol=driver.findElements(By.xpath(Locator));
		ArrayList<String> originalList=new ArrayList<String>();
		for(int i=0;i<objCol.size();i++)
		{
			originalList.add(objCol.get(i).getText());
		}
		ArrayList<String> copyList=new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
			copyList.add(originalList.get(i));
		}
		Collections.sort(copyList);
		Assert.assertTrue(originalList.equals(copyList),"Expected Value Are Shorted:");
		
	}

	public static void Windowhandle(WebDriver driver, String Handle) {
		Set<String> objHandle = driver.getWindowHandles();
		Iterator<String> objIt = objHandle.iterator();
		String ParentWindowId = objIt.next();
		String ChildWindowId = objIt.next();
		driver.switchTo().window(ChildWindowId);
		driver.close();
		driver.switchTo().window(ParentWindowId);

	}

	public static void CountElement(String Tagvalue) {
		int TotalElement = driver.findElements(By.tagName(Tagvalue)).size();
		List<WebElement> objlist = driver.findElements(By.tagName(Tagvalue));
		System.out.println("Total Number Of: " + TotalElement);
		for (int i = 0; i < TotalElement; i++) {
			String objElement = objlist.get(i).getText();
			if (objElement.isEmpty()) {
			} else {
				System.out.println(objElement);
			}
		}
	}

	public static void SelectStaticDropDown(String Locator, String SelectBy, String value) throws InterruptedException {
		WebElement objElement = driver.findElement(By.xpath(Locator));
		Select objList = new Select(objElement);
		if (SelectBy.contains("index")) {
			int Index = Integer.parseInt(value);
			objList.selectByIndex(Index);
		}
		if (SelectBy.contains("Text")) {
			objList.selectByVisibleText(value);
		} else {
			objList.selectByValue(value);
		}
	}

	public static void selectDropDownvalue(String Locator, String value) {

		List<WebElement> DropList = driver.findElements(By.xpath(Locator));
		int listsize = DropList.size();
		for (int i = 0; i < listsize; i++) {
			currentList = DropList.get(i).getText();
			if (currentList.contains(value)) {
				DropList.get(i).click();
				break;
			}
		}
	}

	public static void AutoDropDown(String Locator, String selectValue) {
		WebElement objFrom = driver.findElement(By.xpath(Locator));
		objFrom.clear();
		objFrom.sendKeys(selectValue);
		objFrom.sendKeys(Keys.ARROW_DOWN);
		objFrom.sendKeys(Keys.ENTER);

	}

	public static void AutoSuggestDropDown(String Locator, String ScriptLocator, String selectValue) {
		WebElement objFrom = driver.findElement(By.xpath(Locator));
		objFrom.sendKeys(selectValue);
		JavascriptExecutor objJs = (JavascriptExecutor) driver;
		String getText = (String) objJs.executeScript(ScriptLocator);
		int i = 0;
		while (!selectValue.equalsIgnoreCase(getText)) {

			objFrom.sendKeys(Keys.DOWN);
			System.out.println(getText);
			i++;
			if (i > 10) {
				System.out.println("There Is No Such Searchable Text Exist:");
				break;
			}

		}

	}

	public static void SetClander(String dateLocator, String monthLocator, String yearLocator, String nextLocator,
			String expectedDate) throws InterruptedException {
		String expDate[] = expectedDate.split("/");
		List<WebElement> objDate = driver.findElements(By.xpath(dateLocator));
		if (expDate[2].length() < 3) {
			expDate[2] = ("20" + expDate[2]);
		} else {
			expDate[2] = expDate[2];
		}
		for (int i = 0; i < 11; i++)

		{
			WebElement objMonth = driver.findElement(By.xpath(monthLocator));
			WebElement objYear = driver.findElement(By.xpath(yearLocator));
			String month = objMonth.getText();
			String year = objYear.getText();
			if (month.contains(expDate[0])) {

				if (year.contains(expDate[2])) {
					break;
				}
			} else {
				driver.findElement(By.xpath(nextLocator)).click();

			}
		}

		List<WebElement> listDate = driver.findElements(By.xpath(dateLocator));
		int totalDate = listDate.size();
		for (int i = 0; i < totalDate; i++) {
			String actualDate = listDate.get(i).getText();
			String reActualDate = actualDate.trim();
			if (reActualDate.contains(expDate[1])) {
				listDate.get(i).click();
				break;
			}
		}
	}

	public static void ValidateBrookenLink(String Locator, String Value) throws InterruptedException {

		List<WebElement> objLink = driver.findElements(By.tagName("a"));
		int totalLink = objLink.size();

		for (int i = 0; i < totalLink; i++) {
			String CtrLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			objLink.get(i).sendKeys(CtrLink);
			// driver.get(arg0;
			Thread.sleep(2000);
		}
		Set<String> objWindow = driver.getWindowHandles();
		java.util.Iterator<String> it = objWindow.iterator();

		while (it.hasNext()) {
			String currentTitle = driver.switchTo().window(it.next()).getTitle();
			System.out.println(currentTitle);
		}

	}

	public static void selectLocation(String Location)
	{
		Select objP=new Select(driver.findElement(By.name("areaabb")));
		objP.selectByVisibleText(Location);
		
	}
	
	
	
	public static void setRun() {

		driver.findElement(By.linkText("my account")).click();
		driver.findElement(By.id("inputEmailHandle")).sendKeys("iphonepnt@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Tester@7453");
		driver.findElement(By.id("login")).click();
		Select objselect = new Select(driver.findElement(By.name("areaabb")));
		objselect.selectByVisibleText("delaware, DE, US");
		driver.findElement(By.xpath("//button[@value='go']")).click();
		driver.findElement(By.xpath("/html/body/article/section/form/ul/li[6]/label/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"new-edit\"]/div/label/label[18]/input")).click();
		driver.findElement(By.xpath("//input[@name='PostingTitle']")).sendKeys("All iPhone Parts retail and wholsale");
		driver.findElement(By.xpath("//input[@name='postal']")).sendKeys("19703");
		driver.findElement(By.xpath("//*[@name='PostingBody']"))
				.sendKeys("We have new LCD screen, battery and other patrs very good price please call me Thank you");
		// WebElement=driver.findElements(By.xpath("//select[@name='mobile_os']//option"));
		// driver.findElement(By.xpath("//select[@name='mobile_os']//option")).

		// driver.findElement(By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]")).click();
		// driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();

		/*
		 * WebElement
		 * objOsDrop=driver.findElement(By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]"))
		 * ; objOsDrop.click(); // objOsDrop.g //List<WebElement>
		 * objOption=objOsDrop.findElements(By.xpath("//*[@id=\"ui-id-6\"]"));
		 * //System.out.println(objOption.get(3)); Select objOs=new
		 * Select(driver.findElement(By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]")));
		 * List<WebElement> OSList=objOs.getOptions(); System.out.println(OSList); //
		 * System.out.print(objOs.getClass()); // objOs.selectByIndex(2); /*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"new-edit\"]/div/fieldset[2]/div/fieldset/div/label")).click();
		 * driver.findElement(By.xpath("//*[@name='contact_phone']")).sendKeys(
		 * "9294215155");
		 * driver.findElement(By.xpath("//*[@value='continue']")).click();
		 * driver.findElement(By.xpath("//*[@id=\"leafletForm\"]/button")).click();
		 * driver.findElement(By.xpath("//button[@value='Done with Images']")).click();
		 * driver.findElement(By.xpath("//button[@value='Continue']")).click();
		 * 
		 */
	}

}

package CrigList;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticDropDown  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		Thread.sleep(8000);
		/*driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
		WebElement ObjDp=driver.findElement(By.xpath("//*[@name='ctl00$mainContent$ddl_originStation1']/following-sibling::span"));
		new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(ObjDp));
		ObjDp.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@text='Amritsar (ATQ)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		*/
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		//WebElement ObjAd=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
		SelectStaticDropDown("//select[@name='ctl00$mainContent$ddl_Adult']","index","3");
		
		//Select ObjAdult=new Select(ObjAd);
		//ObjAdult.selectByIndex(3);
		WebElement ObjIn=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Child']"));
		Select ObjInfant=new Select(ObjIn);
		ObjInfant.selectByIndex(2);
		WebElement ObjElement=driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
		Select ObjList=new Select(ObjElement);
		ObjList.selectByIndex(2);
	/*	List<WebElement> ObjAdult=driver.findElements(By.xpath("//div[@id='divpaxinfo']"));
		
		int TotalAdult=ObjAdult.size();
		for(int i=0;i<TotalAdult;i++)
		{
			String Expected=ObjAdult.get(i).getText();
			if(Expected.contains("2"))
			{
				ObjAdult.get(i);
			}
		}
		
		WebElement ObjPassenger=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']"));
					ObjPassenger.click();
		Select ObjP=new Select(ObjPassenger);
		ObjP.deselectByVisibleText("Chennai (MAA)");
		WebElement ObjElement=driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
		Select ObjList=new Select(ObjElement);
		ObjList.selectByIndex(2);
		
		*/

	}

	private static void SelectStaticDropDown(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

}

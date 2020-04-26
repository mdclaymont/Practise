package CrigList;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(8,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		Thread.sleep(3000);
		String dateLocator="//*[@class='ui-state-default' and @href='#']";
		String monthLocator="//*[@class='ui-datepicker-month']";
		String yearLocator="//*[@class='ui-datepicker-year']";
		String nextLocator="//*[@class='ui-icon ui-icon-circle-triangle-e']";
		 String expectedDate="May/10/2020";
		String expDate[] = expectedDate.split("/");
		List<WebElement> objDate= driver.findElements(By.xpath(dateLocator));
		if(expDate[2].length()<3)
		{
			 expDate[2] =("20"+expDate[2]);
		}
		else {
			expDate[2]=expDate[2];
		}
		for (int i = 0; i < 11; i++)
			
		{
			WebElement objMonth=driver.findElement(By.xpath(monthLocator));
			WebElement objYear = driver.findElement(By.xpath(yearLocator));
			String month=objMonth.getText();
			String year=objYear.getText();
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
		
		List<WebElement>listDate=driver.findElements(By.xpath(dateLocator));
		int totalDate=listDate.size();
		for(int i=0;i<totalDate;i++)
		{
			String actualDate=listDate.get(i).getText();
			String reActualDate=actualDate.trim();
			if(reActualDate.contains(expDate[1]))
			{
				listDate.get(i).click();
				break;
			}
		}
		
		
		
	}

}
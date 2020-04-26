package CrigList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(8,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	//	driver.switchTo().alert().
	//	driver.switchTo().alert().dismiss();
		WebElement ObjCalender=driver.findElement(By.xpath("//input[@name='travel_date']"));
		ObjCalender.click();
		
		List<WebElement> ObjDayList=driver.findElements(By.xpath("(//*[@class='ui-datepicker-calendar']"));
		for(int i=0;i<ObjDayList.size();i++)
		{
		System.out.println(ObjDayList.get(i).getText());
		}

		
		String CalLocator="//*[@class='ui-datepicker-month']";
		String ExpectedYear="2020";
		
		for(int i=0;i<11;i++)
		{
			WebElement ObjCal=driver.findElement(By.xpath(CalLocator));
			WebElement ObjYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
			String Month=ObjCal.getText();
			String Year= ObjYear.getText();
			System.out.println(Month);
			if(Month.contains("January"))
			{
				if(Year.contains(ExpectedYear))
				{
					break;
				}
			}
			else
			{
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
			
			}
		}
		String dateLocator="";
		

	}
	

}

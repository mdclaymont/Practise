package CrigList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
		WebElement ObjDp = driver
				.findElement(By.xpath("//*[@name='ctl00$mainContent$ddl_originStation1']/following-sibling::span"));
		new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(ObjDp));
		ObjDp.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@text='Amritsar (ATQ)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		Thread.sleep(4000);
		// WebElement
		// ObjCalender=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
		/// ObjCalender.click();

		// List<WebElement>
		// ObjDayList=driver.findElements(By.xpath("(//*[@class='ui-datepicker-calendar']"));
		// for(int i=0;i<ObjDayList.size();i++)
		// {
		// System.out.println(ObjDayList.get(i).getText());
		// }

		String CalLocator = "//*[@class='ui-datepicker-month']";
		String ExpectedYear = "2020";

		for (int i = 0; i < 11; i++) {
			WebElement ObjCal = driver.findElement(By.xpath(CalLocator));
			WebElement ObjYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
			String Month = ObjCal.getText();
			String Year = ObjYear.getText();
			System.out.println(Month);
			if (Month.contains("January")) {
				if (Year.contains(ExpectedYear)) {
					break;
				}
			} else {
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[4]/a")).click();

			}
		}
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		WebElement ObjAd = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
		Select ObjAdult = new Select(ObjAd);
		ObjAdult.selectByIndex(3);
		WebElement ObjIn = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Child']"));
		Select ObjInfant = new Select(ObjIn);
		ObjInfant.selectByIndex(2);
		WebElement ObjElement = driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
		Select ObjList = new Select(ObjElement);
		ObjList.selectByIndex(2);

		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

	}

}

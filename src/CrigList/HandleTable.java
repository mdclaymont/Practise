package CrigList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		int sum=0;
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cricbuzz.com/live-cricket-scorecard");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='India v Bangladesh,2nd Test - IND Won']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Scorecard')]")).click();
		Thread.sleep(3000);
		//WebElement firstTable=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		WebElement firstTable=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int totalRow=firstTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'")).size();
		int totalColum=firstTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		//int totalRow=firstTable.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(totalRow);
		System.out.println(totalColum);
		for(int i=0;i<totalColum;i++)
		{
			String run=firstTable.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			sum=sum+Integer.parseInt(run);
			
			System.out.println(run);
		}
		System.out.println(sum);
		
	}

}

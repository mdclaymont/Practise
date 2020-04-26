package CrigList;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement objFooter=driver.findElement(By.id("gf-BIG"));
		//objFooter.findElement(By.tagName("a")).s
		int totalLink=objFooter.findElements(By.tagName("a")).size();
		System.out.println(totalLink);
		//underfooter if i want select a linklist
		WebElement objcoulm=objFooter.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int columLink=objcoulm.findElements(By.tagName("a")).size();
		System.out.println(columLink);
		
		for(int i=0;i<columLink;i++)
		{
			String ClLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			objcoulm.findElements(By.tagName("a")).get(i).sendKeys(ClLink);
		//	driver.get(arg0;
			Thread.sleep(2000);
		}
		Set<String> objWindow=driver.getWindowHandles();
		java.util.Iterator<String> it=objWindow.iterator();
		
		while(it.hasNext())
		{
			String currentTitle=driver.switchTo().window(it.next()).getTitle();
			System.out.println(currentTitle);
		}
		
		
		
	
//	System.out.println(TotalWindow);
	}

}

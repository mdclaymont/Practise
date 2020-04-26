package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		WebElement sourchElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		Actions objDrag=new Actions(driver);
		objDrag.dragAndDrop(sourchElement,targetElement).build().perform();
		driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Accept")).click();;
	}

}

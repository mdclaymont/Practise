package CrigList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nyc\\eclipse-workspace\\Criglist\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// driver.findElement(By.id("fromCity")).click();
		// driver.findElement(By.xpath("//input[@type='text' and
		// @placeholder='From']")).click();
		WebElement objFrom = driver.findElement(By.id("fromPlaceName"));
		String selectValue="BENGALURU DARSHINI";
		objFrom.sendKeys(selectValue);

		JavascriptExecutor objJs = (JavascriptExecutor) driver;

		String ScriptLocator = "return document.getElementById(\"fromPlaceName\").value;";

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

}

package mercary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScroolDown extends Function {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.driver.chrome","/AllCommonItem/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/blog/interview-questions/selenium-interview-questions-answers/");

		
		

	}

}

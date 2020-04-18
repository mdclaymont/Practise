package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import allcommonitem.Function;

public class HomePage extends Function {

	//public  HomePage(WebDriver driver) {
	//	this.driver=driver;
//	}
	By mypage=By.tagName("a");
	By sellonmercari=By.xpath("//*[text()='Sell on Mercari']");
	By signin=By.xpath("//p[text()='Sign in']");
	By sellnow=By.xpath("//*[text()='Sell now']");
	By search1=By.xpath("//input[@type='search']");
	@FindBy(xpath="//input[@type='search']") WebElement search;
	public  WebElement Search() {
		return search;
	}
	public WebElement Search1() {
		return driver.findElement(search1);
	}
	public WebElement signIn() {
		return driver.findElement(signin);
	}
	
	public WebElement sellOnMercari() {
		return driver.findElement(sellonmercari);
	}
	
	public WebElement sellNow() {
		return driver.findElement(sellnow);
	}
	public List<WebElement> myPage() {
		return driver.findElements(mypage);
	}

}

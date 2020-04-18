package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import allcommonitem.Function;

public class DetailsPageFind extends Function{
	public DetailsPageFind() {
		PageFactory.initElements(driver, this);
	}
	//@FindBy(how=How.XPATH,using="//input[@type='search']")
		//WebElement search;
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//*[text()='Sell on Mercari']")
	WebElement sellonmercari;
	
	
	public  WebElement sellOnMercari() {
		return sellonmercari;
	}
	public void OnMercari() {
		sellonmercari.click();
	}
	public  WebElement Search() {
		return search;
	}
	public  void Search1() {
		search.sendKeys("test");;
	}
	/*
	By search=By.xpath("//input[@type='search']");
	public WebElement Search() {
		return driver.findElement(search);
		
	}*/
}

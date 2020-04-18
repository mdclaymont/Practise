package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import allcommonitem.Function;

public class DetailsPage extends Function{

	//public DetailsPage(WebDriver driver) {
	//	this.driver=driver;
	//}
	By selectphoto=By.xpath("//*[contains(text(),'Drag and drop files')]");
	By title=By.xpath("//input[@placeholder='Create a title for your item']");
	By description=By.xpath("//*[@placeholder='Describe your item']");
	By tag=By.xpath("//*[@placeholder='Add up to 3 tags (optional)']");
	By catagory=By.xpath("//*[text()='CATEGORY']");
	By Scatagory=By.xpath("//*[text()='Please select a category']");
	By catagoryname=By.xpath("//*[contains(text(),'Cell phone & smartphones')]");
	By downshift=By.xpath("//div[contains(@class,'DownshiftSelect__Items')]");
	By downshift2=By.xpath("(//div[contains(@class,'DownshiftSelect__')])[2]");
	By downshift3=By.xpath("(//div[contains(@class,'DownshiftSelect__')])[3]");
	By brand=By.xpath("//*[@placeholder='Enter a brand name']");
	By cancel=By.xpath("//*[contains(text(),'Cancel')]");
	By conditionN=By.xpath("//*[text()='New']");
	By conditionG=By.xpath("//*[text()='Good']");
	By carrierU=By.xpath("//*[text()='Unlocked']");
	By carrierT=By.xpath("//*[text()='T-Mobile']");
	By carrierA=By.xpath("//*[text()='AT&T']");
	By imei=By.xpath("//*[@placeholder='Enter the imei for your device']");
	By zipcode=By.xpath("//*[@placeholder='Enter 5-digit Zip Code']");
	By shipping=By.xpath("//*[text()='SHIPPING']");
	By editshiping=By.xpath("//button[text()='Edit shipping']");
	By shipingNo=By.xpath("//span[@id='offerShippingNo']");
	By shipingYes=By.xpath("//span[@id='offerShippingYes']");
	By weight=By.xpath("//input[@name='weight_in_ounces']");
	By calshiping=By.xpath("//button[text()='Calculate shipping']");
	By shipbyusps=By.xpath("//span[@id='shippo_usps']");
	By save=By.xpath("//button[text()='Save']");
	By sellprice=By.xpath("//input[contains(@class,'SellPartial__NumberInput')]");
	
	By openmenu=By.xpath("//button[@aria-label='open menu']");
	By list=By.xpath("//button[text()='List']");
	
	public  WebElement selectPhoto()
	{
		return driver.findElement(selectphoto);
	}
	public WebElement Title()
	{
		return driver.findElement(title);
	}
	public WebElement Description()
	{
		return driver.findElement(description);
	}
	public WebElement Tag()
	{
		return driver.findElement(tag);
	}
	public WebElement Catagory()
	{
		return driver.findElement(catagory);
	}	
	public WebElement openMenu()
	{
		return driver.findElement(openmenu);
	}
	public WebElement SCatagory()
	{
		return driver.findElement(Scatagory);
	}
	public WebElement AutoSCatagoryName()
	{
		return driver.findElement(catagoryname);
	}
	public List<WebElement> downShift()
	{
		return driver.findElements(downshift);
	}
	
	public List<WebElement> downshift2()
	{
		return driver.findElements(downshift2);
		
	}
	public List<WebElement> downshift3()
	{
		return driver.findElements(downshift3);
	}
	
	public WebElement Brand()
	{
		return driver.findElement(brand);
	}
	public WebElement Cancel()
	{		
		return driver.findElement(cancel);
	}
	
	
	public WebElement ConditionN()
	{
		return driver.findElement(conditionN);
	}
	public WebElement carrierU()
	{
		return driver.findElement(carrierU);
	}
	public WebElement carrierA()
	{
		return driver.findElement(carrierA);
	}
	public WebElement carrierT()
	{
		return driver.findElement(carrierT );
	}
	public WebElement IMEI()
	{
		return driver.findElement(imei );
	}
	public WebElement ConditionG()
	{
		return driver.findElement(conditionG);
	}
	
	public WebElement ZipCode()
	{
		return driver.findElement(zipcode);
	}
	public WebElement Shiping()
	{
		return driver.findElement(shipping);
		
	}
	public WebElement EditShhiping()
	{
		return driver.findElement(editshiping);
	}
	public WebElement shipingNo()
	{
		return driver.findElement(shipingNo);
	}
	public WebElement shipingYes()
	{
		return driver.findElement(shipingYes);
	}
	public WebElement Weight()
	{
		return driver.findElement(weight);
	}
	public WebElement calShiping()
	{
	return driver.findElement(calshiping);
			
	}
	public WebElement shipByUsps()
	{
		return driver.findElement(shipbyusps);
	}
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	
	
	public WebElement SellPrice()
	{
		return driver.findElement(sellprice);
	}
	public WebElement List()
	{
		return driver.findElement(list);
	}
	
	
	
	
}

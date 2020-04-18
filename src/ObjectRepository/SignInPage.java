package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import allcommonitem.Function;

public class SignInPage extends Function{
	
	//public SignInPage(WebDriver driver) {
	//	this.driver=driver;
	//}
	By userid=By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/div[1]/input");
	By password=By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/div[3]/input");
	By signin=By.xpath("//*[@id=\"root-modal\"]/div[3]/div/div/div/div/div/div[2]/form/button/p");
	public WebElement userId() {
		return driver.findElement(userid);
	}
	public WebElement passWord() {
		return driver.findElement(password);
	}
	public WebElement signIn() {
		return driver.findElement(signin);
	}
}

package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 
{
	WebDriver driver;
	public PageFactory1(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="submit")
	WebElement loginbtn;
	
	public void username(String user)
	{
		username.sendKeys(user);
	}
	
	public void password(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void login()
	{
		loginbtn.click();
		
	}


}

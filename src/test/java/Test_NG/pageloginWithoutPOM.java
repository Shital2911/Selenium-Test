package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageloginWithoutPOM 
{

	WebDriver driver;

	public pageloginWithoutPOM(WebDriver d)
	{
	    driver = d;
	}
	
	By username = By.id("user-name");
	By pwd = By.id("password");
	By loginbtn = By.id("login-button");
	
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterpass(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickbtn()
	{
		driver.findElement(loginbtn).click();
	}


}

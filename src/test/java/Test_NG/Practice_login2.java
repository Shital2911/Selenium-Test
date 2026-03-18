package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice_login2 
{
	WebDriver driver;

	public Practice_login2(WebDriver d) 
	{
		driver = d;
	}
	
	By user = By.id("username");
	By pwd = By.id("password");
	By loginbtn = By.id("submit");
	
	public void username(String username)
	{
		driver.findElement(user).sendKeys(username);
	}
	
	public void password(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(loginbtn).click();
		
	}

}

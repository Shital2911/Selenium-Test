package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin 
{
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		
		
//		create object of login page
		pageloginWithoutPOM loginpage = new pageloginWithoutPOM(driver);
		
		driver.get("https://www.saucedemo.com");
		loginpage.enterUsername("standard_user");
		loginpage.enterpass("secret_sauce");
		loginpage.clickbtn();
		
	}

}

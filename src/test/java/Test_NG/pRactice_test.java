package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pRactice_test 
{
	public static void main(String args[])
	{
		WebDriver driver  = new ChromeDriver();
//		Practice_login2 test = new Practice_login2(driver);
		PageFactory1 test = new PageFactory1(driver);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		test.username("student");
		test.password("Password123");
		test.login();
		
	}

}

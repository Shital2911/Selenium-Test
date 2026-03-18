package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
	@Test
	public void testMethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Verifying title");
		String expectedTitle = "Automation Testing Practice";
		String actualTitle = driver.getTitle();
		sa.assertEquals(expectedTitle, actualTitle, "Title Verify");
		
		System.out.println("Verifying icon ");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		sa.assertTrue(icon.isDisplayed());
		
		System.out.println("Verifying search button");
		WebElement search = driver.findElement(By.className("wikipedia-search-button"));
		sa.assertTrue(search.isDisplayed());
		
		driver.close();
		
		
		
		
	
		
	

	}
}

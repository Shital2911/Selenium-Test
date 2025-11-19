package Testcases;

import org.testng.annotations.Test;

public class LoginTests 
{
    @Test
    public void validLoginTest() 
    {
        System.out.println("Running valid login test");
    }
    
    @Test
    public void invalidLoginTest() {
        System.out.println("Running invalid login test");
    }
}


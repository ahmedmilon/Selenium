package org.Itlink.selenium.selenium_automation;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public void testRegister() {
		
		

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		String baseUrl = "http://newtours.demoaut.com/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
    
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();
       
        
        // * compare the actual title of the page with the expected one and print
        // * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        } 
		
		
		
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("sagdgjas");
		driver.findElement(By.name("lastName")).sendKeys("hjasdbh");
		driver.findElement(By.name("lastName")).clear();
		
		Select select= new Select(driver.findElement(By.name("country")));
		select.selectByValue("2");
		driver.findElement(By.id("email")).sendKeys("hskdjd");
		
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name='register']")).click();
		  WebElement submitbutton;
		  submitbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='register']")));
		  submitbutton.click();
		
		
		
	}

}

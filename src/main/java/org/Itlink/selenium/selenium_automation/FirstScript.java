package org.Itlink.selenium.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("sagdgjas");
		driver.findElement(By.name("lastName")).sendKeys("hjasdbh");
		driver.findElement(By.name("lastName")).clear();
		
		Select select= new Select(driver.findElement(By.name("country")));
		select.selectByValue("2");
		driver.findElement(By.id("email")).sendKeys("hskdjd");
		
		
		//driver.findElement(By.xpath("//input[@name='register']")).click();
		  
		
		
		/* String baseUrl = "http://newtours.demoaut.com/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        } */
	
	

	}

}

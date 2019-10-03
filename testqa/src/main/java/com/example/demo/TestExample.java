package com.example.demo;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class TestExample {
private WebDriver driver;
private String baseUrl="https://www.google.com";
private String chromeDriver="E:\\Application\\chromedriver.exe";
private String actualString;
private WebElement webElement;

@Before
  public void setUp() throws Exception {
	  
	 System.setProperty("webdriver.chrome.driver", chromeDriver);
	  driver = new ChromeDriver();
	 
	  }

  @Test //User can search with “Google Search”
  public void searchByGoogleSearch()  {
	  
		try {

	// Given: I’m on the homepage
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

	// When:I type 'The name of the wind' into the search field
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
					.sendKeys("The name of the wind");

	// And:I click the Google Search button
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
			driver.manage().window().maximize();

	// And:the first result is 'The Name of the Wind - Patrick Rothfuss
			actualString = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3/div"))
					.getText();
			assertTrue(actualString.contains("“The Name of the Wind - Patrick Rothfuss"));

	// When:I click on the first result link
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3/div")).click();

	// Then:I go to the “Patrick Rothfuss - The Books” page
			assertTrue(driver.getTitle().contains("Patrick Rothfuss - The Books"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	  

    }
  
  @Test //  User can search by using the suggestions
   public void searchByGoogleBySuggestion()  {

	  try {
		  
	// Given: I’m on the homepage
			driver.get(baseUrl);

	// When:I type 'The name of the w' into the search field
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
					.sendKeys("The name of the w");

	// And: the suggestions list is displayed
			webElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));

	// And: I click on the first suggestion in the list
			Thread.sleep(1000);
			webElement.sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			webElement.sendKeys(Keys.RETURN);

	// And:the first result is 'The Name of the Wind - Patrick Rothfuss
			actualString = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3/div"))
					.getText();
			assertTrue(actualString.contains("“The Name of the Wind - Patrick Rothfuss"));

	// When:I click on the first result link
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3/div")).click();

	// Then:I go to the “Patrick Rothfuss - The Books” page
			assertTrue(driver.getTitle().contains("Patrick Rothfuss - The Books"));  
		  
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 

  }
  
  @After
  public void shutDown() throws Exception {
  driver.quit();
 
  
}
 }

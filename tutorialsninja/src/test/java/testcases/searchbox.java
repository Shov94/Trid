package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.baseclass;

public class searchbox extends baseclass {

	

	
	@Test
	public void searchExistingProduct() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.linkText("iMac")).isDisplayed());
		
	}
	
	@Test
	public void searchNonexistingProduct() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("fitbit");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	    
	    Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).isDisplayed());
	}
	
	
	
	
	
}

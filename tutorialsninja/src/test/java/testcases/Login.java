package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.baseclass;

public class Login extends baseclass{

	

	@BeforeMethod
	public void open() {
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	}


	@Test
	public void loginWithValidCredintials() {

		driver.findElement(By.id("input-email")).sendKeys("qscwdv@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("987poiu");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String actualText = driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).getText();
		Assert.assertEquals(actualText, "My Account");
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).click();
	}

	@Test
	public void loginWithInValidCredintials() {
        
		driver.findElement(By.id("input-email")).sendKeys("qscv@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("987piu");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMessage = driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]")).getText();
		Assert.assertEquals(errorMessage, "Warning: No match for E-Mail Address and/or Password.");

	}
}

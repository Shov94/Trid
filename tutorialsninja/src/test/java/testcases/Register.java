//package testcases;
//
//import org.apache.commons.lang.RandomStringUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import basefile.baseclass;
//
//public class Register extends baseclass{
//
//	WebDriver driver;
//	
//	@BeforeMethod
//	public void open() {
//		driver=openBrowser(driver);
//		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
//	}
//	
//	
//	@Test(priority = 1)
//	public void registerWithValidCredintials() {
//		
//		driver.findElement(By.id("input-firstname")).sendKeys("zszszs");
//		driver.findElement(By.id("input-lastname")).sendKeys("opopop");
//		driver.findElement(By.id("input-email")).sendKeys("qscwdv"+ creator()+"@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9513578520");
//		driver.findElement(By.id("input-password")).sendKeys("987poiu");
//		driver.findElement(By.id("input-confirm")).sendKeys("987poiu");
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		
//		String successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")).getText();
//		
//		Assert.assertEquals(successMessage, "Your Account Has Been Created!");	
//		
//	}
//	
//	@Test(priority = 2)
//	public void registerWithoutCredintials() {
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		String warningMessage=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//	    Assert.assertEquals(warningMessage, "Warning: You must agree to the Privacy Policy!");
//	   	
//	}
//	
//	
//	public String creator() {
//	String random = RandomStringUtils.randomAlphabetic(2);
//	return random;
//	
//	}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		driver.quit();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}

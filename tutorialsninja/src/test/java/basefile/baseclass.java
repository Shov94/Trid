//package basefile;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class baseclass {
//
//	public static WebDriver driver;
//	
//	
//	public  WebDriver openBrowser(WebDriver driver) {
//		
//		driver = new ChromeDriver();
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		return driver;
//	}
//	
//	
//}

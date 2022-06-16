import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoggerTest {
WebDriver driver;
Logger log = Logger.getLogger(LoggerTest.class);

	@BeforeMethod
	  public void setUp() {
		 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Selenium-java\\chromedriver.exe");
				driver = new ChromeDriver();
			
				log.info("browser launch");

			driver.get("https://www.facebook.com/");

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	  }
	
	@Test
	public void verifyTitleTest() {
		String title= driver.getTitle();
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

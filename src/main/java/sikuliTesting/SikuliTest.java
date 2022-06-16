package sikuliTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class SikuliTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Selenium-java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	/*
	 * Screen s = new Screen(); Pattern settings= new Pattern("settingsIcon.PNG");
	 * s.wait(settings,2000); s.click();
	 */

	}

}

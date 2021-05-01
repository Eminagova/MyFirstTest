import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

	@Test
	public void simpleTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(10*1000);
		driver.close();
	
	}
	@Test
	public void MozillaTest() throws Exception {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(10*1000);
		driver.close();
	}
	
}

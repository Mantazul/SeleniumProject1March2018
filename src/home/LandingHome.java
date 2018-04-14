package home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingHome {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
	}
}

package home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LandingPage {
	 WebDriver driver = null;
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.amazon.com");
	 driver.manage().window().maximize();
  }

  @Test
  public void test1() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Book", Keys.ENTER);
  }
  
  @Test
  public void test2() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium Book", Keys.ENTER);
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

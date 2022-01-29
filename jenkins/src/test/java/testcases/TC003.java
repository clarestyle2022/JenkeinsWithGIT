package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\clare\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Thread.sleep(5000);
	//  driver.manage().window().maximize();
	  driver.get("https://www.newtours.us/");
	  Thread.sleep(2000);
	  driver.close();
	  driver.quit();
	  
  }
}

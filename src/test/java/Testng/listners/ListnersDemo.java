package Testng.listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testng.listners.Listen.class)
public class ListnersDemo {
	public String baseUrl = "https://en-gb.facebook.com/";
	String driverPath = "C:/Users/kalpe/eclipse-workspace/SeleniumProjectPOM/Driver/chromedriver.exe";
	public WebDriver driver ;

	@Test(priority = 0)
	public void launchBrowser() {
	    System.out.println("launching chrome browser"); 
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(baseUrl);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	  @Test(priority = 1)
	  public void firstName_lastName() throws InterruptedException {
		  driver.findElement(By.name("email")).clear();
		  driver.findElement(By.name("email")).sendKeys("username");
		  System.out.println("fname Executed");
		  driver.findElement(By.name("pass")).clear();
		  driver.findElement(By.name("pass")).sendKeys("password");
		  System.out.println("lname Executed");
		  Thread.sleep(2000);
		  }
	  
	  @Test(priority = 2)
	  public void login() throws InterruptedException {
		  driver.findElement(By.name("ebsubmit")).click();
	  }
}

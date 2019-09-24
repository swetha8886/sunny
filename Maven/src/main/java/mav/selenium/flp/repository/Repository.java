package mav.selenium.flp.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Repository {
	
	WebDriver driver;
	@BeforeTest
	public void verify()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}

	@Test
	@Parameters({"sUsername","sPassword"})
	
	public void support(String sUsername,String sPassword) throws InterruptedException
	{
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
	driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
	//System.out.println("xyz");
	Thread.sleep(1000);
	}
	
//@Test(priority=2)
	 
	//public void execute() throws InterruptedException
	//{
	//driver.get("https://www.toolsqa.com/automation-practice-form");
	//driver.findElement(By.id("LoginForm_username")).sendKeys("Priya");
	//driver.findElement(By.id("LoginForm_password")).sendKeys("bvghfr");
	//System.out.println("abc");
	//Thread.sleep(1000);
	//}
	
	@AfterTest
	public void terminate()
	{
	driver.quit();
	}




}

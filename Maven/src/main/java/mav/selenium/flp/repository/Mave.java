package mav.selenium.flp.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mave {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.findElement(By.id("LoginForm_username")).sendKeys("Priya");
		driver.findElement(By.id("LoginForm_password")).sendKeys("bvghfr");
		Thread.sleep(10000);

	}

}

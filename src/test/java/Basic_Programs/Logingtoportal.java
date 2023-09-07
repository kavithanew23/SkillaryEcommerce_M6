package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logingtoportal {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kavitha");
		driver.findElement(By.name("pass")).sendKeys("kavipassword");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.quit();
						
}
}


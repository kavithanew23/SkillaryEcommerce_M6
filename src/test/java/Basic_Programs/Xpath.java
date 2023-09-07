package Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
		
		public static void main(String[] args)throws Throwable
		
		{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hi");
	    driver.findElement(By.xpath("//input[contains(@name='pass')]")).sendKeys("Hello");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Create a page']")).click();
	}
	}



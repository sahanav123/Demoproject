package project.github;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void Login1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(10);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("tutorial01@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("S@ss");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.quit();
		System.out.println("hello");
		
		
	}

}

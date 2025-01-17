import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait ~2 seconds time out
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Pankaj");
		driver.findElement(By.name("inputPassword")).sendKeys("world");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pankaj");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Pankaj@abc.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Pankajbm1580@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Pankaj");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
				
		
		
		
		
		
		

	}

}

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Pankaj";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		getpassword(driver);		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.tagName("p")).getText();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello name,");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();	
		driver.close();
		
	}
	
	
		public static String getpassword(WebDriver driver) throws InterruptedException
		
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("reset-pwd-btn")).click();
			String passwordText=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
			String [] passwordArray = passwordText.split("'");
			//String [] passwordArray2 = passwordArray[1].split("'");
			String password = passwordArray[1].split("'")[0];
			return password;
			
			
			

	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
		
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
		
		//count the number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
	
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for (int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
				{
			System.out.println("its enabled");
			Assert.assertTrue(true);
				}
			else
			{
				Assert.assertTrue(false);
			}
			
				
		
		Thread.sleep(1000);
		driver.close();
		
	}

}

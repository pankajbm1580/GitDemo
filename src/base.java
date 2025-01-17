import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
	    WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] itemsNeeded  = {"Cucumber", "Brocolli", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		additems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBTn")).click();
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		
		
		
	}
	
	public static void additems(WebDriver driver, String[]itemsNeeded)
	{
		
		int j =0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i<products.size(); i ++)
		{
			String [] name =products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemsNeededlist = Arrays.asList(itemsNeeded);
					
			
			if (itemsNeededlist.contains("formattedName"));
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==itemsNeeded.length)
				
				{
				break;
				
			}
		}
		
		}
	}
}



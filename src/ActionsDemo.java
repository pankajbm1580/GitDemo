import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("//span[@id='nav-link-accountList-nav-line-1']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown("SHIFT").sendKeys("hello").build().perform();
	}

}

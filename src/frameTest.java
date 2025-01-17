import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent();
	}

}

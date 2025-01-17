import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		//Chrome- ChromeDriver ->Methods
		//FireFox- firefoxDriver ->Methods close get
		//safari - Saaridriver ->Methods close get
		//Webdriver close get
		//Webdriver methods + class methods
		
		// chromedriver.exe -> Chrome browser
		//step to invoke chrome driver //
		//seleniumManager
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//Firefox

		//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		//WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		//WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		//driver.quit();
		

	}

}

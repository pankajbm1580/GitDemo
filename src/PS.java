import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {


	public void first()
	{
		System.out.println("Hello");
	}
	
	@BeforeTest
	public void apple()
	
	{
		System.out.println("toy");
	}
	@AfterTest
	public void apple1()
	
	{
		System.out.println("toy1");
	}
}



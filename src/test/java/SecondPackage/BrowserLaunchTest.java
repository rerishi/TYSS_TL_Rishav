package SecondPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunchTest {

	WebDriver driver;
	
	@Test
	public void m1Test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
}

package BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;


@SuppressWarnings("deprecation")
@BeforeTest
public void setup() {
	System.setProperty("webdriver.gecko.driver",
			"C:\\\\Users\\\\N Reshma\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterTest
public void teardown() {
	driver.quit();

}
}


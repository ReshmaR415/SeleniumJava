package TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Login extends BaseTest {


	@Test
	public void login() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().setSize(new Dimension(1550, 838));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("ADmin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin456");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement m = driver
				.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
		String act = m.getText();
		System.out.println("Error message is: " + act);



		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("saksdkbs");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("bsjdksbknbc");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		WebElement m1 = driver
				.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
		String act1 = m1.getText();
		System.out.println("Error message is: " + act1);

	}
}

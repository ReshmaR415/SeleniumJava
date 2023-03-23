package TS_011;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Logout extends BaseTest {

	 @Test
		public void logout() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().setSize(new Dimension(1550, 838));
			driver.findElement(By.name("username")).click();
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
	 }
}

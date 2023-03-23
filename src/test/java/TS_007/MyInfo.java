package TS_007;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class MyInfo extends BaseTest {
	@Test
	public void i() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().setSize(new Dimension(1550, 838));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.resizeTo(450,630);");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"))
				.sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"))
				.click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a")).click();
		driver.findElement(By
				.cssSelector("div.orangehrm-horizontal-padding:nth-child(1) > div:nth-child(1) > button:nth-child(2)"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys("Test");
		driver.findElement(By.cssSelector(
				"div.oxd-form-row:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"))
				.sendKeys("Father");
		driver.findElement(
				By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"))
				.click();
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}

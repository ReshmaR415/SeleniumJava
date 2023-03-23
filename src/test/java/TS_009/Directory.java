package TS_009;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Directory extends BaseTest {
	@Test
	public void d() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().setSize(new Dimension(1550, 838));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(9) .oxd-text")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).click();
		driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys("Suman 02");
		{
			WebElement element = driver.findElement(By.cssSelector(".oxd-form"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).click();
		driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys("Suman 02");
		{
			WebElement element = driver.findElement(By.cssSelector(".oxd-form"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]"))
				.click();
	}
}

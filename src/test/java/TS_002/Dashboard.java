package TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Dashboard extends BaseTest {
	@Test
	public void D() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		driver.findElement(By.cssSelector("button.oxd-icon-button:nth-child(2) > i:nth-child(1)")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(5000);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		WebElement E = driver
				.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/p"));
		E.click();
		driver.getTitle();
		driver.findElement(
				By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[7]/div/button/i"))
				.click();
		driver.getTitle();
		Thread.sleep(5000);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.findElement(By.cssSelector(
				"div.orangehrm-quick-launch-card:nth-child(4) > button:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)"))
				.click();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[5]/div[2]/div/div/div/form/div[2]/button[2]")).click();
        
	}
}

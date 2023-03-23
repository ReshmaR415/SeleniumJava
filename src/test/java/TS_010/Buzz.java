package TS_010;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Buzz extends BaseTest {
	@Test
	  public void buzz() throws InterruptedException {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().setSize(new Dimension(1550, 838));
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    driver.findElement(By.linkText("Buzz")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("Buzz"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".oxd-buzz-post-input")).click();
	    driver.findElement(By.cssSelector(".oxd-buzz-post-input")).sendKeys("testing selenium java");
	    driver.findElement(By.cssSelector(".oxd-button--main")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".oxd-glass-button:nth-child(2)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    Thread.sleep(8000);
	    
	    driver.findElement(By.cssSelector(".oxd-glass-button:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".bi-images")).click();
	    driver.findElement(By.cssSelector(".oxd-file-input")).sendKeys("C:\\Users\\N Reshma\\Desktop\\f01110e66472fbdb0322dfb6c4a1b41f.png");
	    driver.findElement(By.cssSelector(".oxd-form-actions > .oxd-button")).click();
	    Thread.sleep(8000);

	    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
}

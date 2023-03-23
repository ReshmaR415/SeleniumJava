package TS_008;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class Performance extends BaseTest {
	 @Test
	  public void p() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().setSize(new Dimension(1550, 838));
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(7) .oxd-text")).click();
	    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).click();
	    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys("Charlie");
	    {
	      WebElement element = driver.findElement(By.cssSelector(".oxd-grid-item:nth-child(5) .oxd-input-group__label-wrapper"));
	      Actions actions= new Actions(driver);
	    actions.moveToElement(element).click().build().perform();
	    }

	    driver.findElement(By.linkText("My Trackers")).click();
	    driver.findElement(By.name("view")).click();
	    
	    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
}

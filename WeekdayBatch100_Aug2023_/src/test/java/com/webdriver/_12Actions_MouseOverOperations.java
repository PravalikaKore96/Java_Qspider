package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _12Actions_MouseOverOperations {


	public static void main(String[] args) {

		try {

			Driver.launchBrowser("chrome", "https://www.flipkart.com/");

			WebElement crossMark = Driver.dr.findElement(By.className("_30XB9F"));
			if (crossMark.isDisplayed()) {
				crossMark.click();
			}

			// Mouse hover on Login button
			Actions act = new Actions(Driver.dr);
			act.moveToElement(
					Driver.dr.findElement(By.xpath("//span[text()='Sign in']"))).perform();

			Thread.sleep(2000);
			
			Driver.dr.findElement(By.xpath("//li[text()='My Profile']")).click();

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}
}
package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _14Actions_KeyBoardOpertaions {



	public static void main(String[] args) {

		try {

			Driver.launchBrowser("ff", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			WebElement  userName = Driver.dr.findElement(By.name("username"));
			userName.sendKeys("Admin");
			Thread.sleep(2000);
			Actions  act = new Actions(Driver.dr);
			//Select total text using double click method
			act.doubleClick(userName).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}
}
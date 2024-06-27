package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class _13Actions_ContextClick {


	public static void main(String[] args) {

		try {
			
			Driver.launchBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			// right click on username field
			Actions  act = new Actions(Driver.dr);
			act.contextClick(Driver.dr.findElement(By.name("username"))).perform();
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}

	}

}
package com.webdriver;

import org.openqa.selenium.By;

public class _10iFrameHandlingTestCases {

	public static void main(String[] args) {

		try {
			Driver.launchBrowser("cb", "https://www.rediff.com/");
			
			// Driver.dr.switchTo().frame(0); to switch based on index
			
			// Driver.dr.switchTo().frame("moneyiframe"); id based switch
			
			Driver.dr.switchTo().frame(Driver.dr.findElement(By.name("moneyiframe")));
			
			Driver.dr.findElement(By.id("query")).sendKeys("Selenium");
			
			// take control back to window
			Driver.dr.switchTo().defaultContent();
			
			// click on NEWS tab
			Driver.dr.findElement(By.linkText("NEWS")).click();
			
			
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			Driver.dr.quit();
		}		

	}

}
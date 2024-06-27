package com.webdriver;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class _8WindowHandles {


	public static void switchtoLatestWindow(String pageTitle) {
		try {
			Set<String>	set = Driver.dr.getWindowHandles();
			for (String windowID : set ) {
				Driver.dr.switchTo().window(windowID);
				if (Driver.dr.getTitle().trim().equalsIgnoreCase(pageTitle)) {
					System.out.println("you have successfully switched to "+pageTitle+" : window");
					Driver.dr.manage().window().maximize();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {

			Driver.launchBrowser("cb", "https://retail.onlinesbi.sbi/retail/login.htm#");

			Driver.dr.findElement(By.xpath("//div[@class='continue_btn']/a[text()='CONTINUE TO LOGIN']")).click();

			Driver.dr.findElement(By.partialLinkText("Register here/Act")).click();

			// Alert
			Alert  alt =  Driver.dr.switchTo().alert();
			System.out.println("Alert MSG : "+alt.getText());
			Thread.sleep(2000);
			alt.accept();

			
			Thread.sleep(4000);
			// switch to child window
			switchtoLatestWindow("State Bank of India");
			Thread.sleep(2000);
			//Assignment
			
			
			Driver.dr.close();
			
			
			
			Thread.sleep(2000);
			switchtoLatestWindow("State Bank of India - Personal Banking");
			//Assignment
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Driver.dr.quit();
		}

	}

}

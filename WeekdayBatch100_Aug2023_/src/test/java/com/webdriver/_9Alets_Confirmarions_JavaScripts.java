
package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class _9Alets_Confirmarions_JavaScripts {

	public static void main(String[] args) {


		try {
         //launch the browser
			Driver.launchBrowser("cb", "https://retail.onlinesbi.sbi/retail/login.htm#");
			Thread.sleep(2000);
           //click on continue to login button
			Driver.dr.findElement(By.xpath("//div[@class='continue_btn']/a[text()='CONTINUE TO LOGIN']")).click();
			Thread.sleep(2000);
             //click on register here/Act
			Driver.dr.findElement(By.partialLinkText("Register here/Act")).click();
			
			//get the text from poup box and click on ok button on popup

            // Alert
			Alert  alt =  Driver.dr.switchTo().alert();
			System.out.println("Alert MSG : "+alt.getText());
			Thread.sleep(2000);
			alt.accept();

			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}

	}

}
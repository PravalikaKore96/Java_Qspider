package com.webdriver;

import org.openqa.selenium.By;

public class _19FileAttchmentsUsingAutoIt {


	public static void main(String[] args) {

		try {


			Driver.launchBrowser("CB", 
					"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			Driver.dr.findElement(By.name("username")).sendKeys("Admin");

			Driver.dr.findElement(By.name("password")).sendKeys("admin123");

			//Click on login button
			Driver.dr.findElement(By.xpath("//button[@type='submit']")).click();

			//step 7 click on "MyInfo" tab
			Driver.dr.findElement(By.xpath("//span[text()='My Info']")).click();

			//step 8 click on contact details link
			Driver.dr.findElement(By.xpath("//a[contains(text(),'Contact Details')]")).click();

			//step 9 click on Add Attachment button'
			Driver.dr.findElement(By.className("oxd-button--text")).click();


			Driver.dr.findElement(By.xpath("//div[text()='Browse']")).click();

			//Click on Choose file button
			Thread.sleep(3000);

			//Execute AutoIt3 .exe file
			Runtime.getRuntime().exec
			("src\\test\\resources\\AutoIt3\\Fileupload\\Fileupload.exe");

			Thread.sleep(6000);


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}
}
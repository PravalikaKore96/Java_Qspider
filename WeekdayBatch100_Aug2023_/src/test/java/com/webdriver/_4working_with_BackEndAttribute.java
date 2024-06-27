package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4working_with_BackEndAttribute {

	private static WebDriver dr = null;

	public static void main(String[] args) {
		try {

			// Step1:  launch a Empty browser.
			dr = new ChromeDriver();

			// Step2:  maximize the browser.
			dr.manage().window().maximize();

			// Step3:  pass the URL("https://accounts.google.com/").
			dr.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fdata&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-1643432652%3A1695443815420917&theme=glif");

			// Step4:  Enter the Email id in the Gmail> "Enter Your Email" Field.
			WebElement userName = dr.findElement(By.id("identifierId"));
			userName.sendKeys("testautomation@gmail.com");

			// Step5:  and print  the Email id value in the console  screen (getattribute).
			System.out.println("Enterd Email ID : "+userName.getAttribute("data-initial-value"));

			Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Step6: close the browser.
			//dr.close();
		}
	}
}
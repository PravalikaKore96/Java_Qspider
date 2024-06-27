package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3Workingwith_WEBTEXT {

	private static WebDriver dr = null;

	public static void main(String[] args) {
		try {

			// Step1:  launch a Empty browser.
			dr = new ChromeDriver();

			// Step2:  maximize the browser.
			dr.manage().window().maximize();

			// Step3:  pass the URL("https://www.facebook.com/").
			dr.get("https://www.facebook.com/");

			// Step4:  get the title of the page and print in the console screen.
			System.out.println("FB title is : "+dr.getTitle());

			// Step5:  Click on Create New Account button
			dr.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(2000);

			//Step5:  verify the text "Sign Up" in the Facebook homepage,
			// and the print the Actual text  in console scrren.
			String expText = "Sign Up";
			String actText = dr.findElement(By.xpath("//div[text()='Sign Up']")).getText().trim();

			if (expText.equalsIgnoreCase(actText)) {
				System.out.println("Both texts are same!");
			}else {
				System.out.println("Both texts are not same!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Step6:  close the browser.
			dr.quit();
		}

	}

}

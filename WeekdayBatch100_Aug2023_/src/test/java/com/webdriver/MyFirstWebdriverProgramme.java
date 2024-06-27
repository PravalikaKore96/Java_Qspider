package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebdriverProgramme {

	private static WebDriver dr = null;

	public static void main(String[] args) {

		try {
			// step1  open chrome browser
			dr = new ChromeDriver();

			// Step2  and maximize the browser
			dr.manage().window().maximize();

			// stpe3  pass the flipkart URL
			dr.navigate().to("https://www.flipkart.com/");

			// stpe4  verify the Flipkart pagetitle, 
			// "Expected titile is:"Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"
			String expTitle = "1Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String actTitle = dr.getTitle().trim();
			if (expTitle.equals(actTitle)) {
				System.out.println("Both titles are same!");
			}else {
				System.out.println("Both titles are not same!");
			}

			// stpe5  print the flipkart page title in the console screen(system.out.println) 
			System.out.println("Flipkart page title : "+actTitle);

			// step6  close login popup(if popup is enabled)
			WebElement crossMark = dr.findElement(By.className("_30XB9F"));
			if (crossMark.isDisplayed()) {
				crossMark.click();
			}

			// step7  enter iphone value in the filpkart search box
			dr.findElement(By.name("q")).sendKeys("Iphone 14pro");

			// step8  click on flipkart search button
			dr.findElement(By.className("_2iLD__")).click();
			Thread.sleep(3000);

			dr.navigate().back();
			Thread.sleep(2000);

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// step9  close the chrome browser
			dr.close();
		}
	}

}


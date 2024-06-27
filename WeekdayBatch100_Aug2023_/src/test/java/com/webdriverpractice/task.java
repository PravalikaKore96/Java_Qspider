package com.webdriverpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	static WebDriver dr=null;

	public static void main(String[] args) {
		try {

			// step1  open chrome browser
			dr=new ChromeDriver();

			// Step2  and maximize the browser

			dr.manage().window().maximize();
			// stpe3  pass the flipkart URL
			dr.navigate().to("https://www.flipkart.com/");

			// stpe4  verify the Flipkart pagetitle, 
			String ExpText="Login";
			//String ActText=dr.findElement(By.xpath())

			String ActText=dr.findElement(By.xpath("//span[text()='Login']")).getText().trim();

			if(ExpText.equalsIgnoreCase(ActText)) {
				System.out.println("Both text same");

			}
			else {
				System.out.println("Both not same");
			}

			// stpe5  print the flipkart page title in the console screen(system.out.println) 
			System.out.println("flipkart page title"+dr.getTitle());

			// step6  close login popup(if popup is enabled)
			WebElement CrossMark=dr.findElement(By.className("_30XB9F"));
			if(CrossMark.isDisplayed()) {
				CrossMark.click();
			}



			// step7  enter iphone value in the filpkart search box
			dr.findElement(By.name("q")).sendKeys("Iphone 14pro");

			// step8  click on flipkart search button
			dr.findElement(By.className("_2iLD_")).click();


			// Step9 get Verify "filters" webtext and print page title in console screen
			String ExpText1="Filters";
			String ActText1=dr.findElement(By.xpath("//span[text()='Filters']")).getText().trim();

			// Step10 Navigate back to home page
			dr.navigate().back();

			// Step11 Click on ContacUS link and print page title in console screen
			dr.findElement(By.partialLinkText("Contact Us")).click();
			System.out.println("contact us"+dr.getTitle());
			dr.navigate().back();

			// Step12 Click on Payment link and print page title in console screen
			dr.findElement(By.partialLinkText("Payments")).click();
			System.out.println("payment"+dr.getTitle());
			dr.navigate().back();

			// Step13 Click on Privacy and print page title in console screen
			dr.findElement(By.partialLinkText("Privacy")).click();
			System.out.println("Privacy"+dr.getTitle());


			// Step14 Navigate back to home page anc close browser
			dr.navigate().back();

		


	}

	catch(Exception e) {
		e.printStackTrace();

	}
	finally {
		//step9  close the chrome browser

		dr.quit();
	}
}
}

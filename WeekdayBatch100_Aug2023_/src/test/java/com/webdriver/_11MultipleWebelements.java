package com.webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _11MultipleWebelements {

	public static void main(String[] args) {

		try {

			Driver.launchBrowser("chrome", "https://www.flipkart.com/");

			WebElement crossMark = Driver.dr.findElement(By.className("_30XB9F"));
			if (crossMark.isDisplayed()) {
				crossMark.click();
			}

			// Print About us link names
			String categorieName = "CONSUMER POLICY";
			List<WebElement> lst = Driver.dr.findElements
					               (By.xpath("//div[text()='"+categorieName+"']/following-sibling::a"));
			int i =1;
			for ( WebElement ele : lst ) {
				System.out.println(i+"."+ele.getText());
				i++;
			}

		} catch (Exception e) {

			e.printStackTrace();

		}finally {
			Driver.dr.quit();
		}

	}

}
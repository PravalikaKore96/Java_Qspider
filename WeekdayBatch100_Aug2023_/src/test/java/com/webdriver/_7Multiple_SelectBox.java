//testcase :verify the given list is equals to the selected list of options
package com.webdriver;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _7Multiple_SelectBox {


	public static void main(String[] args) {

		try {
			
			Driver.launchBrowser("ed", "https://demoqa.com/select-menu");
			//find the locator  "Standard multi select" dropdown
			Select multi = new Select(Driver.dr.findElement(By.id("cars")));
			//verify the feild is multi select or not
			System.out.println("Multi select box type : "   + multi.isMultiple());
			

			String actCarsList = "";
//store our list of options in a variable
			List<String> expCarsList = Arrays.asList("Volvo", "Saab", "Opel", "Audi");
			//store our multi selected options in a variable
			List<WebElement> lst = multi.getOptions();
			for (WebElement ele : lst) {
				//getting options from the selected list on application
				actCarsList = ele.getText().trim();
				//verify the given list is equals to the selected list of options
				if (expCarsList.contains(actCarsList)) {
					multi.selectByVisibleText(actCarsList);
				}
			}


			// print all selected values in console screen 
			List<WebElement> lst1 =	multi.getAllSelectedOptions();
			for(WebElement ele : lst1) {

				System.out.println(ele.getText()); 
			}

			Thread.sleep(1500);

			multi.deselectAll();

			Thread.sleep(1500);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}

}
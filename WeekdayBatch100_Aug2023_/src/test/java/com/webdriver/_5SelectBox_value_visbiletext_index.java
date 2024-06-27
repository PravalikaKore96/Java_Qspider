package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class _5SelectBox_value_visbiletext_index {


	public static void main(String[] args) {

		try {
			//launch url
			Driver.launchBrowser("ed", "https://www.facebook.com/");
			//click on create new Account
			Driver.dr.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(1500);
			//Day
			Select day = new Select(Driver.dr.findElement(By.id("day")));
			//verify the day feild is it multiple select or not 
			System.out.println("Day single/Multi select box : "+day.isMultiple());
			//get the value from the day feild before select the  our value 
			System.out.println("Before day selected value : "+day.getFirstSelectedOption().getText());
			//select the our value in the feild
			day.selectByValue("7");
			//After select the value get the selected value on console screen
			System.out.println("After day selected value : "+day.getFirstSelectedOption().getText());

			
			Select month = new Select(Driver.dr.findElement(By.id("month")));
		    System.out.println("Month single/Multi select box : "+month.isMultiple());
			System.out.println("Before Month selected value : "+month.getFirstSelectedOption().getText());
			month.selectByVisibleText("Nov");
			System.out.println("After Month selected value : "+month.getFirstSelectedOption().getText());
		
			//Year
			Select year = new Select(Driver.dr.findElement(By.id("year")));
			System.out.println("Year single/Multi select box : "+year.isMultiple());
			System.out.println("Before Year selected value : "+year.getFirstSelectedOption().getText());
			year.selectByIndex(13);
			System.out.println("After Year selected value : "+year.getFirstSelectedOption().getText());
		
			Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}

	}

}
package com.webdriverpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.webdriver.Driver;

public class SelectBox_visibletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Driver.launchBrowser("ed", "https://www.facebook.com/");
    	  Driver.dr.findElement(By.xpath("//a[@rel='async']")).click();
    	  Thread.sleep(1500);
    	  //Day
    	  Select day=new Select(Driver.dr.findElement(By.id("day")));
    	  System.out.println("Day single/Multi select box"+day.isMultiple());
    	  System.out.println("before day selected value"+day.getFirstSelectedOption().getText());
    	  day.selectByValue("7");
    	  System.out.println("After selected value"+day.getFirstSelectedOption().getText());
    	  
    	  //month
    	  Select month=new Select(Driver.dr.findElement(By.id("month")));
    	  System.out.println("month single/multi selectbox"+day.isMultiple());
    	  System.out.println("before day selected"+month.getFirstSelectedOption().getText());
    	  month.selectByValue("Nov");
    	  System.out.println("After selected value"+month.getFirstSelectedOption().getText());
    	  
    	  //Year
    	  Select Year=new Select(Driver.dr.findElement(By.id("Year")));
    	  System.out.println("month single/multi Select"+Year.isMultiple());
    	  System.out.println("before day selected"+Year.getFirstSelectedOption().getText());
    	  Year.selectByValue("20");
    	  System.out.println("After selcted value"+Year.getFirstSelectedOption());
    	  
    	  
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }
      finally {
    	  Driver.dr.close();
      }
      }
      }
	



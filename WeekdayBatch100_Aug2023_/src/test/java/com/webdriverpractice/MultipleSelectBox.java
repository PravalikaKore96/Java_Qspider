package com.webdriverpractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.webdriver.Driver;

public class MultipleSelectBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Driver.launchBrowser("ed", "https://demoqa.com/select-menu");
    	   Select multi=new Select(Driver.dr.findElement(By.id("cars")));
    	   System.out.println("Multi select box type"+multi.isMultiple());
    	   String actcarlist="";
    	   List<String>expCarList=Arrays.asList("Volvo", "Saab", "Opel", "Audi");
    	   List<WebElement> lst = multi.getOptions();
    	   for (WebElement ele : lst) {
    		   actcarlist=ele.getText().trim();
    		   if(expCarList.contains(actcarlist));
    		   multi.selectByVisibleText(actcarlist);
    	   }
    	   
    	   
    	   
       
    // print all selected values in console screen 
    			List<WebElement> lst1 =	multi.getAllSelectedOptions();
    			for(WebElement ele : lst1) {

    				System.out.println(ele.getText()); 
    			}
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
       finally{
    	   Driver.dr.quit();
       }
       }
	}



package com.webdriverpractice;

import java.util.Arrays;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.webdriver.Driver;

public class _7MultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Driver.launchBrowser("ed", "https://demoqa.com/select-menu");
      Select multi=new Select(Driver.dr.findElement(By.id("cars")));
      System.out.println("Multi select box type :" +multi.isMultiple());
      String ActCarlst="";
      List<String> expcarlst=Arrays.asList("Volvo", "Saab", "Opel", "Audi");
      List<WebElement>lst=multi.getOptions();
      for(WebElement ele:lst) {
    	  ActCarlst=ele.getText().trim();
    	  if(expcarlst.contains (ActCarlst)) {
    		  multi.selectByVisibleText(ele.getText());
    	  }
    	  List<WebElement> lst1 =	multi.getAllSelectedOptions();
			for(WebElement ele : lst1) {

				System.out.println(ele.getText());
      }
	}

}

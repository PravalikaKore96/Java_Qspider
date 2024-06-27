package com.webdriverpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxGetoptions {
public static WebDriver dr=null;
	public static void main(String[] args) {
		try {
		dr =new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(1000);
		String ExpMonth="July";
		Boolean flag=false;
		Select month=new Select(dr.findElement(By.id("month")));
		List<WebElement> lst =  month.getOptions();
		for(WebElement ele:lst) {
			if(ele.getText().trim().equalsIgnoreCase(ExpMonth)) {
				month.selectByVisibleText(ExpMonth);
				flag=true;
				break;
				
			}
			
		}
		if(!flag) {
			System.out.println("your exp "+ExpMonth+" is not avaliable in month dropdown");
		}
		Thread.sleep(1000);
		

	 
	
}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dr.quit();
		}
}
	}



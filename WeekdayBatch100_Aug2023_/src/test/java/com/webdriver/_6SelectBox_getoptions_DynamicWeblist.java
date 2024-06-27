
package com.webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _6SelectBox_getoptions_DynamicWeblist {
static WebDriver dr=null;
	public static void main(String[] args) {
		dr=new ChromeDriver();
		try {
//login to facebook and click on create Account
			dr.get("https://www.facebook.com/");
			//clcik on create new button
			dr.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(1000);
//verify the july month is showing in a list of month feild or not
			String expMnth = "Jul";
			boolean flag = false;
			Select  month = new Select(dr.findElement(By.id("month")));

			List<WebElement> lst =  month.getOptions();

			for(WebElement ele : lst) {
				if (ele.getText().trim().equalsIgnoreCase(expMnth)) {
					month.selectByVisibleText(expMnth);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("your exp "+expMnth+" is not avaliable in month dropdown");
			}
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//dr.quit();
		}

	}

}

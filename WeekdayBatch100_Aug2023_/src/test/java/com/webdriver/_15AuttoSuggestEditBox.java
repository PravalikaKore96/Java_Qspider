package com.webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _15AuttoSuggestEditBox {


	public static void main(String[] args) {

		try {

			Driver.launchBrowser("cb", "https://www.naukri.com/");

			String expKeySkill = "Selenium Automation";

			WebElement keySkillTxtFld =
					Driver.dr.findElement(By.xpath("//input[contains(@placeholder,'ski')]"));

			keySkillTxtFld .sendKeys("sel");


			Actions act = new Actions(Driver.dr);
			List<WebElement> lst = Driver.dr.findElements
					(By.xpath("//ul[@class='layer-wrap']/li/div"));

			for(WebElement ele : lst) {
				act.sendKeys(Keys.DOWN).perform();
				Thread.sleep(1500);
				if (ele.getText().trim().equalsIgnoreCase(expKeySkill)) {
					act.sendKeys(Keys.ENTER).perform();
					break;
				}
			}

			Thread.sleep(2000);

			System.out.println("Expected Key skill : "+
			keySkillTxtFld.getAttribute("value").replaceAll("[, @#$%^&*()!~_-]", ""));

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}
}
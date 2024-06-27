package com.webdriver;

import java.io.File;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class _21Screenshots {

	/**
	 * This method is used to capture page screenshot
	 */
	public static void getPageScreenshots() {
		try {
			Random ran  = new Random();
			int    val  = ran.nextInt(187232111);
			File  srcIMG = 	((TakesScreenshot)Driver.dr).getScreenshotAs(OutputType.FILE);
			File  dstIMG = new File("src/test/resources/Screenshots/PageScreenshots/Batch100_"+val+".png");
			FileUtils.copyFile(srcIMG, dstIMG);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to get capture webelement screenshot
	 * @param element
	 */
	public static void getElementScreenshot(WebElement element) {
		try {
			Random ran  = new Random();
			int    val  = ran.nextInt(187232111);
			File  srcIMG = 	element.getScreenshotAs(OutputType.FILE);
			File  dstIMG = new File("src/test/resources/Screenshots/ElementScreenshots/Batch100_"+val+".png");
			FileUtils.copyFile(srcIMG, dstIMG);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {

		try {
			Driver.launchBrowser("cb", "https://www.flipkart.com/");
			
			getPageScreenshots();

			WebElement crossMark = Driver.dr.findElement(By.className("_30XB9F"));
			if (crossMark.isDisplayed()) {
				getElementScreenshot(crossMark);
				crossMark.click();
			}

			getPageScreenshots();
			
			Driver.dr.findElement(By.name("q")).sendKeys("Iphone 14pro");
			getPageScreenshots();
			Driver.dr.findElement(By.className("_2iLD__")).click();
			Thread.sleep(3000);
			getPageScreenshots();
			Driver.dr.navigate().back();
			Thread.sleep(2000);

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.close();
		}
	}
}

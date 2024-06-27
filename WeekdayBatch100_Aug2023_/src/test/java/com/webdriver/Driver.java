
package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	/**
	 * Webdriver variable
	 */
	public static WebDriver dr = null;

	/**
	 * This method is used to launch a custom browser
	 * @param browserName
	 * @param url
	 */
	public static void launchBrowser(String browserName,String url) {

		try {
			if (browserName.equalsIgnoreCase("CHROME") || browserName.equalsIgnoreCase("CB") ) {
				dr = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("FIREFOX") || browserName.equalsIgnoreCase("FF") ) {
				dr = new FirefoxDriver();
			}else if (browserName.equalsIgnoreCase("EDGE") || browserName.equalsIgnoreCase("ED") ) {
				dr = new EdgeDriver();
			}else {
				dr = new ChromeDriver();
				System.out.println("Default Chrome browser is launched!");
			}

			dr.manage().window().maximize();
			dr.navigate().to(url);
			Driver.dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			System.out.println("Page title : "+dr.getTitle());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package com.webdriver;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class _17FileHandling_ReadDataFromExcellSheet {

	public static String getTestdata(String sheetName,int rowNo,int cellNo) {
		String val = "";
		try {
			
			FileInputStream  fis  = new FileInputStream("src\\test\\resources\\Testdata\\Batch100_TestData.xlsx");
			Workbook          wb  = WorkbookFactory.create(fis);
			Sheet             sh  = wb.getSheet(sheetName);
			Row               row = sh.getRow(rowNo);
			                  val = row.getCell(cellNo).getStringCellValue().trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val ;
	}


	public static void main(String[] args) {

		try {
			
			Driver.launchBrowser( getTestdata("OrangeHRMLoginCred", 4, 0) ,
					              getTestdata("OrangeHRMLoginCred", 1, 0));
			
			Driver.dr.findElement(By.name("username")).
			sendKeys(getTestdata("OrangeHRMLoginCred", 1, 1));
			
			Driver.dr.findElement(By.name("password")).
			sendKeys(getTestdata("OrangeHRMLoginCred", 1, 2));
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}

}
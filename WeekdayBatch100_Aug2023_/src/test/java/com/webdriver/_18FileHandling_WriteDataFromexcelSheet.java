
package com.webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class _18FileHandling_WriteDataFromexcelSheet {

	public static void setTestdata(String sheetName, int rowNo, int cellNo,String val) {
		try {

			String path = "src\\test\\resources\\Testdata\\Batch100_TestData.xlsx";

			FileInputStream fis = new FileInputStream(path);
			Workbook  wb = 	WorkbookFactory.create(fis);
			Sheet sh =	wb.getSheet(sheetName);
			Row  row = sh.getRow(rowNo);

			Cell  cel =	row.createCell(cellNo);
			cel.setCellValue(val);
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		try {

			Driver.launchBrowser(_17FileHandling_ReadDataFromExcellSheet.
					getTestdata("OrangeHRMLoginCred", 4, 0), 
					_17FileHandling_ReadDataFromExcellSheet.
					getTestdata("OrangeHRMLoginCred", 1, 3));


			Driver.dr.findElement(By.xpath("//a[@rel='async']")).click();

			
			setTestdata("OrangeHRMLoginCred", 1, 4, 
					Driver.dr.findElement(By.xpath("//div[text()='Sign Up']")).getText().trim());


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Driver.dr.quit();
		}
	}

}
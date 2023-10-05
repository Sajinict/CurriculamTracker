package org.ictak.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
		public static XSSFWorkbook excelWbook;
		public static XSSFSheet excelSheet;
		 
		public static String getData(int rowNum,int colNum) throws IOException {
			
			FileInputStream inp=new FileInputStream("D:\\Internship\\CurriculamTrackerWebsite\\src\\main\\resources\\TestData.xlsx");
				excelWbook=new XSSFWorkbook(inp);
				excelSheet=excelWbook.getSheetAt(0);
				
				
				XSSFRow currentRow=excelSheet.getRow(rowNum);
				XSSFCell currentCell=currentRow.getCell(colNum);
				if(currentCell==null)
					
				{return"";}
				
				DataFormatter formatter=new DataFormatter();
				String strValue=formatter.formatCellValue(currentCell);
				return strValue;
				
			
		} 
	}



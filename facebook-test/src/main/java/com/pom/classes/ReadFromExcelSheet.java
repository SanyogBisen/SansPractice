package com.pom.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelSheet {
	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {
		File file = new File("C:\\Users\\csp\\Documents\\software testing study material\\parameterisation.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook sanWorkbook = null;
		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx"))
		{
			sanWorkbook = new XSSFWorkbook(inputStream);
			
		}
		else if(fileExtensionName.equals(".xls"))
		{
			sanWorkbook = new HSSFWorkbook(inputStream);
			
		}
		
		Sheet sheetNew = sanWorkbook.getSheet(sheetName);
		int rowCount = sheetNew.getLastRowNum()-sanSheet.getFirstRowNum();
		
		for(int i=0; i<rowCount+1; i++)
		{
			Row row = sanSheet.gertRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
			
			}
		}
	
	public static void main(String args[]) throws IOException {
		ReadSanExcelFile objExcelFile = new ReadSanExcelFile();
		
		String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
		objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelSanDemo");
	
	
	}

}

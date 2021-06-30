package com.pom.classes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcelSheet {

 public static void main(String args[]) throws EncryptedDocumentException, IOException {
 String path = "C:\\Users\\csp\\Documents\\software testing study material\\parameterisation.xlsx";
 FileInputStream file = new FileInputStream(path);
 String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();

 System.out.println(value);

}
}

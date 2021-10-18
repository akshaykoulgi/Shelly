package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

public String getData(String sheetname,int rownum,int coloumn) throws EncryptedDocumentException, IOException {
	

	FileInputStream fis = new FileInputStream(Iconstants.excelFilePath);
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheet(sheetname);
 	Row rw = sh.getRow(rownum);
 	Cell cl = rw.getCell(coloumn);
 	String value = cl.getStringCellValue();
 	wb.close();

 	return value;
 	
 
}


public void setData(String sheetname,int row,int coloumn,String data) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(Iconstants.excelFilePath);
	
	
 Workbook wb = WorkbookFactory.create(fis);
 Sheet sh = wb.getSheet(sheetname);
  Row rw = sh.getRow(row);
  Cell cl = rw.createCell(coloumn);
  cl.setCellValue(data);
  FileOutputStream fout = new FileOutputStream(Iconstants.excelFilePath);
  wb.write(fout);
  wb.close();
 	
	
}

	
	
}

package GeneralLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {

	public static String toReadStringDataFromExcel(String filename, String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		File absPath = new File("./testData/"+filename+".xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
	}
	
	public static double toReadIntDataFromExcel(String filename, String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		File absPath = new File("./testData/"+filename+".xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public static LocalDateTime toReadDateDataFromExcel(String filename, String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		File absPath = new File("./testData/"+filename+".xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
	}
	
	public static boolean toReadBooleanDataFromExcel(String filename, String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		File absPath = new File("./testData/"+filename+".xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum).getBooleanCellValue();
	}
	
	
}

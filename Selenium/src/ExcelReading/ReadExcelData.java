package ExcelReading;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import GeneralLibrary.UtilityClass;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println(UtilityClass.toReadStringDataFromExcel("C:\\Users\\Bhoomika\\eclipse-workspace\\Selenium\\testData\\datails.xlsx", "Sheet1", 1, 1));

	}

}

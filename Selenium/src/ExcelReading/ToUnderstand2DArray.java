package ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToUnderstand2DArray {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File absPath = new File("C:\\Users\\Bhoomika\\eclipse-workspace\\Selenium\\testData\\arrayData.xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rownum = dataSheet.getPhysicalNumberOfRows();
		int colnum = dataSheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rownum);
		System.out.println(colnum);
		
		String[][] data=new String[rownum-1][colnum];
		for(int i=0;i<rownum-1;i++) {
			for(int j=0;j<colnum;j++) {
				data[i][j]=dataSheet.getRow(i+1).getCell(j).toString();
				System.out.print(data[i][j]+",");
				
			}
			System.out.println();
			System.out.println("************************************************************");
		}
	}
	
}

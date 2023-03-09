package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadFromCSV {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("./testData/testData1.csv");
		
		CSVReader reader=new CSVReader(fr);
		
		//read methods
//		String[] firstLineData = reader.readNext();
//		for(String data:firstLineData) {
//			System.out.print(data+", ");
//		}
//		System.out.println();
//		String[] secondLineData = reader.readNext();
//		for(String data:secondLineData) {
//			System.out.print(data+", ");
//		}
		
		List<String[]> alldata = reader.readAll();
		for(String[] sarr:alldata) {
			for(String arr: sarr) {
				System.out.print(arr+", ");
			}
			System.out.println();
		}
		
//		List<String[]> alldata = reader.readAll();
//		for(String[] sarr:alldata) {
//			for(int i=0;i<sarr.length;i++) {
//				System.out.print(sarr[i]);
//			}
//			System.out.println();
//		}
	}

}

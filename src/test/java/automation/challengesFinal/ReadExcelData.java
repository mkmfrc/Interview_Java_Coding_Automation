package automation.challengesFinal;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	final static String filePath = "./TestData/ExcelData.xlsx";

	// How to read excel in automation?
	// Ans: 1st I need Apache POI dependencies

	public static void main(String[] args) throws Throwable {
		
		//1. First i have to create an object using FileInputStream Class
		//and pass the argument as location of the Excel file
		FileInputStream input = new FileInputStream(filePath);

		
		// HSSFWorkbook wb = new HSSFWorkbook(input) below 2010
		
		//2. Now I have to create another object with the help of XSSFWorkbook class from ApachePOI
		//and take the control of FileInputStream object 
		XSSFWorkbook wb = new XSSFWorkbook(input);

		
		//3. With the help of XSSFWorkbook object i can call the getSheet() method
		//and pass the sheet name then take control of the sheet data 
		//with the help of XSSFSheet object
		XSSFSheet sheet = wb.getSheet("SheetName");

		
		//4. With the help of XSSFSheet obj i can call the Iterator() method to go through all the data
		//and store into the Iterator instance 
		Iterator<Row> rowiterator = sheet.iterator();

		//5. Using Iterator intense I can call next() to ignore the Sheet header
		rowiterator.next();

		//6. I have to create an ArrayList obj to handle the multiple data from Excel
		List<String> data = new ArrayList<String>();

		//7. I have to create a loop to looping all data and ignore the header
		while (rowiterator.hasNext()) {
		
			//8. With the help of ArrayList obj i can read the file using getCell() method by index number
			data.add(rowiterator.next().getCell(1).getStringCellValue());
			System.out.println(data);
		}
		
		
		
		// deserialization
				// FileOutputStream output = new FileOutputStream(".xls");

				// serialization
				
				
	}
}

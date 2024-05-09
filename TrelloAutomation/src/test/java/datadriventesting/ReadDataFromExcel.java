package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
public static void main(String[] args) throws Throwable {
	//Create the FileInputStream Obj of java with the absolute path of the address.
	  FileInputStream fis = new FileInputStream("./src/test/resources/readdatafromworkbook.xlsx");
		//Call the create() from WorkBookFactory Class of POI Library
		Workbook workBook = WorkbookFactory.create(fis);
		//call the getSheet() by specifying the sheetName
		Sheet sheet = workBook.getSheet("myworkbook");
		//call the getRow() by specifying the row index value
		Row row = sheet.getRow(0);
		//call the getCell() by specifying the cell index
		Cell cell = row.getCell(2);
		//based on the type of data call the appropriate method
//		 long numericValue =(long)cell.getNumericCellValue();
//		System.out.println(numericValue);
		int rowValue = row.getRowNum(); //to get row number
		System.out.println(rowValue);
		String cellValue = cell.getStringCellValue(); //to get value present in particular cell
		System.out.println( cellValue);
		workBook.close();
	
}
}

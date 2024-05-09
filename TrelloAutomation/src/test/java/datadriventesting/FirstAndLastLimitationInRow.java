package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastLimitationInRow {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/facebookdata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("dropdowndata");
		Row dayRow = sheet.getRow(0);
		short firstRowCell = dayRow.getFirstCellNum();
		System.out.println(firstRowCell);
		short lastRowCell = dayRow.getLastCellNum();
		System.out.println(lastRowCell);
		workBook.close();

	}

}

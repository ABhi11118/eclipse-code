package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDataIntoExecelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/CustomerTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(3).getCell(2).setCellValue("Fail");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/CustomerTestData.xlsx");
		wb.write(fos);
		
	}

}

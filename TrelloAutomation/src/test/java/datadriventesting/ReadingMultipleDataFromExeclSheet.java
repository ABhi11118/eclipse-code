package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExeclSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./src/test/resources/CustomerTestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int count = wb.getSheet("InvalidLogin").getLastRowNum();
for(int i=1;i<=count;count++) {
	String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
	System.out.println(un);
	}
}
}

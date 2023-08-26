package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readExcel();
	}

	public static String[][] readExcel() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(2);
		int rowCount = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();
		String cellValues="";

		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {

				cellValues = sheetAt.getRow(i).getCell(j).getStringCellValue();

				data[i - 1][j] = cellValues;
			}
		}

		// close the book (Mandatory step)
		book.close();
		return data;
	}

}

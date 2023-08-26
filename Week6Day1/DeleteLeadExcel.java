package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DeleteLeadExcel {

	
	public static String[][] readExce() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/DeleteLead.xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(3);
		int lastRowNum = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();
		String[][] data = new String[lastRowNum][colCount];
		String cellValues = "";
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < colCount; j++) {
				cellValues = sheetAt.getRow(i).getCell(j).toString();
				data[i - 1][j] = cellValues;
			}
		}
		book.close();
		return data;
	}
}

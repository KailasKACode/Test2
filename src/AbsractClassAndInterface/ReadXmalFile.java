package AbsractClassAndInterface;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXmalFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Kailas\\Desktop\\Rashan.xlsx");
			System.out.println("In...");
			XSSFWorkbook book = new XSSFWorkbook(fis);
			System.out.println("In...");
			XSSFSheet sheet = book.getSheet("rashnnn");
			System.out.println("In...");
			
			
			int lastrownum = sheet.getLastRowNum();
			System.out.println("In...");
			for (int i = 0; i <= lastrownum; i++) {
				System.out.println("In...");

				Row row = sheet.getRow(i);
				int getlastcellnum = row.getLastCellNum();
				System.out.println("In...");

				for (int j = 0; j < getlastcellnum; j++) {
					Cell cell = row.getCell(j);

					if (cell.getCellType().name().equals("STRING")) {
						System.out.print(cell.getStringCellValue() + "\t");
					} else if (cell.getCellType().name().equals("NUMERIC")) {
						System.out.print(cell.getNumericCellValue() + "\t");
					} else if (cell.getCellType().name().equals("BOOLEAN")) {
						System.out.print(cell.getBooleanCellValue() + "\t");
					} else {
						System.out.print(cell.getErrorCellValue() + "\t");
					}

				}

				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

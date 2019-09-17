package sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Path");
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheetAt(0);
	    Row row = sh.getRow(0);
	    Cell cell = row.getCell(0);
	    
	    System.out.println(cell);
	    System.out.println(sh.getRow(0).getCell(0));
		
	}

}

package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPractice {

	public static void main(String[] args) throws IOException   {

		FileInputStream File=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\Test-Data\\Automation sample.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int Trows=sheet.getLastRowNum();
		int Tcells=sheet.getRow(1).getLastCellNum();
		System.out.println("Total rows:"+ Trows+ ",Total cells:"+ Tcells);
		
		System.out.println("========");
		
		for(int r=0; r<Trows; r++) {
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<Tcells; c++) {
				String value=currentrow.getCell(c).toString();
				System.out.print(value+ "     ");
			}
			System.out.println();
		}
		
		
		
	}

}

package excelreader;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
public class Excelread {
	public static void main(String args[]) throws IOException
	{
		FileInputStream file= new FileInputStream(Sample.Test_PATH);
	HSSFWorkbook workbook=new HSSFWorkbook(file);
	HSSFSheet sheet= workbook.getSheetAt(0);
	HSSFRow row=sheet.getRow(0);
	HSSFCell cell=row.getCell(1);
	System.out.println(cell);
	
for(Row r:sheet)
{
	for(Cell c:r) {
		System.out.println(c+"");
	}
	System.out.println();
}
	}
}

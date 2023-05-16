package Utility;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import com.aventstack.extentreports.ExtentTest;


public class ExcelDataProvider extends BaseClass {
	static ExtentTest test;
	Workbook wb,workbook;
	FileInputStream fis1;
	FileOutputStream outFile;
	
	
	 
	public ExcelDataProvider() throws Exception {
		  
			String preprod = config.get_preprod();
		    String path=System.getProperty("user.dir")+preprod;
		    System.out.println(path);
		    System.out.println(preprod);
			FileInputStream fis=new FileInputStream(path);
			 wb=WorkbookFactory.create(fis);
		
		
	}
	public String getExcelData(String sheetname, int row, int cell) {

		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();

	}
	
	public void updateData(String sheetName, String Data1, String Data2, String Data3) throws IOException

	{

	//Setting path of the excel test data file

	String preD = config.get_preprod_data();

	String exclPath=System.getProperty("user.dir")+preD;
	FileInputStream fis1 =new FileInputStream (exclPath);
	Workbook workbook = WorkbookFactory.create(fis1);

	

	//Creating excel objects

	
	System.out.println("Total number of sheets" + workbook.getNumberOfSheets());


    Sheet sheet = workbook.getSheet(sheetName); // get the first sheet in the workbook

	
	int lastRowNum = sheet.getLastRowNum();

	

	Row dataRow = sheet.createRow(++lastRowNum);

	Cell cell1 = dataRow.createCell(0);
	Cell cell2 = dataRow.createCell(1);
	Cell cell3 = dataRow.createCell(2);

	

	cell1.setCellValue(Data1);
	cell2.setCellValue(Data2);
	cell3.setCellValue(Data3);

	fis1.close();

	FileOutputStream fos = new FileOutputStream(exclPath);
	workbook.write(fos);
	fos.close();
	}
	
	

}

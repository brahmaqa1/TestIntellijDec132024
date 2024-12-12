package ExcelBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelByXssfworkbook {

	public static void main(String[] args) throws IOException {

		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\TestData.xlsx";
		// 
//		HSSFWorkbook
//		XSSFWorkbook

		
		// create obj for -XSSFWorkbook class
		FileInputStream fis = new FileInputStream(xlFile);
//		XSSFWorkbook xssfwb =  new XSSFWorkbook(fis);
//		XSSFSheet xssfsh  =  xssfwb.getSheet("Sheet1");	
			//  (or)
		Workbook xssfwb =  new XSSFWorkbook(fis);
		Sheet xssfsh  =  xssfwb.getSheet("Sheet1");	
		

		// read data from row no, cell no = 0,0 
		String data00 =xssfsh.getRow(0).getCell(0).toString();
		

		
		
		System.out.println("data00="+data00);
		// data00=ProductName

		// HW read data from  row no, cell no = 0,1


		// HW read data from  row no, cell no = 0,2


		// HW read data from  row no, cell no =1,0

		//		HW read data from  row no, cell no =1,1


		//HW  Get Rows count

		//HW  Get columns Cnt 
		
	
				

	}

}

package TestCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

import Utilities.ExcelUtilities;

public class TestExcelUtilities {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String xlFilePath= "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\src\\test\\Resources\\TestData\\TestData.xlsx";
		
		// getRowsCnt
		ExcelUtilities xlutil = new ExcelUtilities();
		int rowscnt = xlutil.getRowsCnt(xlFilePath, "Sheet1");
	
		System.out.println("rowscnt-"+rowscnt);
//		  get rows cnt from 'CreateUsers'
		 rowscnt = xlutil.getRowsCnt(xlFilePath, "CreateUsers");
		System.out.println("rowscnt-" +rowscnt);
//		
		//**********************************
		// HW Get Columns cnt from excel fiel , passing sheet name =sheet1
			

		//HW Get Columns cnt from excel fiel , passing sheet name =CreateUsers
		
		//************************
		
		// Read data from row no 1 .cell no =1 ,   from given xl file and sheet name ?
			String data11= 	xlutil.readExcel(xlFilePath, "Sheet1", 1, 1);
		System.out.println("data11= "+ data11);
//		
		String data12= 	xlutil.readExcel(xlFilePath, "Sheet1", 1, 2);
		System.out.println("data12= "+ data12);
//		data11= ProductName
//				data12= Qty
//		
//		
////	HW 	Read data from 2,1 ,,2,2 
		
				

		
		//  1,4  cell is not there ???
//		String data14 = xlutil.readExcel(xlFilePath, "Sheet1", 1, 4);
//		System.out.println("data14 ="+ data14);// null
		
//		 data21= readExcel(xlFilePath, "Sheet1", 2, 4);
//			System.out.println("data21= "+ data21);
//			//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()"
		//because the return value of "org.apache.poi.ss.usermodel.Row.getCell(int)" is null
			//  due to cell no =4 i.e column 4 is not exist in excel
			
		// if we give invlaid row  no --  
//		String data14 = xlutil.readExcel(xlFilePath, "Sheet1", 6, 1);
		
			 
//				System.out.println("data21= "+ data14);
				//Check Cell No or Column no = 1 is not exist in excel file e=java.lang.NullPointerException: 
				//Cannot invoke "org.apache.poi.ss.usermodel.Row.getCell(int)" 
				//because the return value of "org.apache.poi.ss.usermodel.Sheet.getRow(int)" is null
			
		
	
		
		//   Get Column No by passing ColumnNo from given xl file and sheet name 
		// From sheet1, get "ProductName", "Qty" -->  column no 
		int Colno = xlutil.getColNoBasedColumnName(xlFilePath, "Sheet1", "ProductName");
		System.out.println("colNo for Productname -column ="+ Colno);
		
		
		Colno = xlutil.getColNoBasedColumnName(xlFilePath, "Sheet1", "Qty");
		System.out.println("colNo for Qty -column ="+ Colno);
		
		// HW get column no for Price column
		
		// read all column data  by passing column name -ProductName
		ArrayList<String> ProductNameColumnDataList =  xlutil.readColumnData(xlFilePath, "Sheet1", "ProductName");
		
		System.out.println("ProductNameColumnDataList="+ProductNameColumnDataList);
		
		// read all column data  by passing column name -Qty
		ArrayList<String> QtyColumnDataList =  xlutil.readColumnData(xlFilePath, "Sheet1", "Qty");
		System.out.println("QtyColumnDataList="+QtyColumnDataList);
		
		
		//HW read all column data  by passing column no =1 
		
		
		
		//HW read all column data  by passing column no =2
		
				 	
		


	}

}

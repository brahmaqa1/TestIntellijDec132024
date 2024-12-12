package ExcelBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader3 {
	// develop a method -isSheetExist(String xlFile, String sheetName ) throws 
	//  isSheetExist();
	public static int isSheetExist(String xlFile,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(xlFile);
		Workbook  wb =  WorkbookFactory.create(fis);
		int indexno = wb.getSheetIndex(sheetName);
		//
		System.out.println("Index no of given sheet=" +indexno);

		if(indexno>=0)
		{
			System.out.println("Given sheet=" +sheetName+" is  available in excel = "+xlFile);
		}
		else
		{
			System.out.println("Given sheet= "+sheetName+" is not available in excel = "+xlFile);
		}
			
		return indexno;
	}

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Jul2023WorkSpace\\MavenProjectThroughCommand\\TestData.xlsx";

		// check isSheetExist(xlFile, "Sheet1");
		int indexno = isSheetExist(xlFile, "Sheet1");//0
		System.out.println("indexno="+indexno);

		// check isSheetExist(xlFile, "Sheet2");// 1
		isSheetExist(xlFile, "Sheet2");
		
		//check isSheetExist(xlFile, "CreateUsers");//2
		isSheetExist(xlFile, "CreateUsers");//2
		
		// check isSheetExist(xlFile, "CreateUsersInvalid");// -1
		isSheetExist(xlFile, "CreateUsersInvalid");// -1

	}
}



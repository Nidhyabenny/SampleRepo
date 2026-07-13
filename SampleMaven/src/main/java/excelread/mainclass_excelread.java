package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mainclass_excelread {
	
	//Step1:Get file
	static FileInputStream f; //Used to input a file-give a file
 	static XSSFWorkbook w; //To input workbook
 	static XSSFSheet s;  //To input a excel sheet
 	public static String getStringData(int a, int b) throws IOException //To get StringData
 	{
 		f=new FileInputStream("C:\\Users\\nidhy\\OneDrive\\Desktop\\Java_Course\\ExcelReading.xlsx");
 		w=new XSSFWorkbook(f);   //If red underline-->Hover and click on Throws Exception 
 		s=w.getSheet("Sheet1");
 		XSSFRow r=s.getRow(a);
 		XSSFCell c=r.getCell(b);
 		return c.getStringCellValue();
 		
 	}
 	public static int getIntegerData(int a,int b) throws IOException
 	{
 		f=new FileInputStream("C:\\Users\\nidhy\\OneDrive\\Desktop\\Java_Course\\ExcelReading.xlsx");
 		w=new XSSFWorkbook(f);   //If red underline-->Hover and click on Throws Exception 
 		s=w.getSheet("Sheet1");
 		XSSFRow r=s.getRow(a);
 		XSSFCell c=r.getCell(b);
 		//Here by default taken as double- convert to Integer 
 		//So TypeCasting- convert data one data to another (Double to Int)
 		int x=(int) c.getNumericCellValue();
 		return x;
 	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(mainclass_excelread.getStringData(1,0));
		System.out.println(mainclass_excelread.getIntegerData(1,1));

	}

}

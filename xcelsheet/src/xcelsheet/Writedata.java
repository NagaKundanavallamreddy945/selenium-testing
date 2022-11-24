package xcelsheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws= wb.getSheet("Sheet1");
		Row r=null;
		Cell c =null;
		r=ws.createRow(2);
		r.createCell(0).setCellValue("manual testing");
		
		r=ws.createRow(3);
		r.createCell(0).setCellValue("QTP");
		
		r=ws.createRow(4);
		r.createCell(0).setCellValue("selenium");
		
		FileOutputStream f1=new FileOutputStream("D:\\Book1.xlsx");
		wb.write(f1);
		f1.close();
		
		
		

	}

}

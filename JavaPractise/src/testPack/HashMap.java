package testPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		File f = new File("C:\\Users\\Amar\\Desktop\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet st =  wb.getSheetAt(0);
		int rows = st.getLastRowNum();
		System.out.println("Row count is :"+rows);
		
	}

}

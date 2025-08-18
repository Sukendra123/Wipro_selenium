package Day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Arrays;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class ExcelDataProvider { 
   @DataProvider()
   public String[][] getdata() throws IOException {
      
       File s = new File("C:\\Users\\Sukendra Reddy\\Desktop\\Test.xlsx");
       System.out.println(s.exists());
      
       FileInputStream fis = new FileInputStream(s);
      
      
       XSSFWorkbook workbook = new XSSFWorkbook(fis);
       XSSFSheet sheet = workbook.getSheet("Sheet1"); // index , name
      
       
       int noOfRows = sheet.getPhysicalNumberOfRows();
       int noOfCols = sheet.getRow(0).getLastCellNum();
      
       String[][] data = new String[noOfRows-1][noOfCols]; // excluding header row
      
       for(int i=0;i<noOfRows-1;i++) {
           for(int j=0;j<noOfCols;j++) {
               DataFormatter df = new DataFormatter();
               data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
           }
       }
      
       workbook.close();
       fis.close();
       return data;
       }
    }


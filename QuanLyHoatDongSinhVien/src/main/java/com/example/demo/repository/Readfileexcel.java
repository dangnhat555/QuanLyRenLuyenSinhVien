package com.example.demo.repository;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.example.demo.entity.Danhsach;
 
public class Readfileexcel {
     
    public List<Danhsach> readBooksFromExcelFile(String excelFilePath) throws IOException {
        List<Danhsach> listBooks = new ArrayList<Danhsach>();
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        DataFormatter fmt = new DataFormatter(); 
        Workbook workBook = getWorkbook(inputStream, excelFilePath);
        Sheet firstSheet = workBook.getSheetAt(0);
        Iterator<Row> rows = firstSheet.iterator();
        Row currentRow1 = rows.next();
        while (rows.hasNext()) {
    	        Row currentRow = rows.next();
    	        Danhsach customer = new Danhsach();
    	        customer.setTT(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(0))));       
    	        customer.setMASV(currentRow.getCell(1).getStringCellValue());
    	        customer.setHovaTen(currentRow.getCell(2).getStringCellValue());
    	        customer.setNgaysinh(currentRow.getCell(3).getStringCellValue());
    	        customer.setLop(currentRow.getCell(4).getStringCellValue());
    	        try {
    	        	customer.setB1(currentRow.getCell(5).getStringCellValue());
    	        }
    	        catch(Exception e)
    	        {
    	        	customer.setB1("");
    	        }
    	       
    	        try {
   	        	 customer.setB2(currentRow.getCell(6).getStringCellValue());
    	        }
    	        catch(Exception e)
    	        {
    	        	customer.setB2("");
    	        }
    	        try {
    	        	customer.setB3(currentRow.getCell(7).getStringCellValue());
    	        }
    	        	catch(Exception e)
    	        {
    	        	customer.setB3("");
    	        }		
    	        try {
    	        	 customer.setB4(currentRow.getCell(8).getStringCellValue());
    	        }
    	        catch(Exception e)
    	        {
    	        	customer.setB4("");
    	        }
    	        //customer.setB4(currentRow.getCell(8).getStringCellValue());
    	        //customer.setB5(currentRow.getCell(9).getStringCellValue());
    	        try {
   	        	 	customer.setB5(currentRow.getCell(9).getStringCellValue());
    	        }
    	        catch(Exception e)
    	        {
    	        	customer.setB5("");
   	        }
    	        listBooks.add(customer);
    	      
        }
         
        workBook.close();
        inputStream.close();
         
        return listBooks;
    }
     

     
    private Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
      
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }
      
        return workbook;
    }
     
}


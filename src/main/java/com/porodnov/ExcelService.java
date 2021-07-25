package com.porodnov;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelService {

    public void creating() throws IOException {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet0 = wb.createSheet("1 List");

        FileOutputStream file = new FileOutputStream("E:/JavaProjects/ProjectExcel/result.xls");

        wb.write(file);
        file.close();

    }

    public void readExcelFile() throws IOException {

        Workbook wb = new HSSFWorkbook(new FileInputStream("E:/JavaProjects/ProjectExcel/result.xls"));

        String resultRead = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();

        System.out.println(resultRead);
        wb.close();

    }

}

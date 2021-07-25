package com.porodnov;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("mySheet");

        FileOutputStream file = null; // создание потока, для создание файл

        file = new FileOutputStream("E:/JavaProjects/ProjectExcel/result.xls");
        wb.write(file);
        file.close();

    }
}

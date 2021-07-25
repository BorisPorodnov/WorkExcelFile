package com.porodnov;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ExcelService file = new ExcelService();

        //file.creating();
        file.readExcelFile();

    }
}

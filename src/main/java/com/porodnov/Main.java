package com.porodnov;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] array = new int[]{41, 22, 342, 41, 15, 26, 57, 12338, 29, 110, 1111, 212};

        int minValue = array[0]; // значение которое мы считаем минимальным
        int minIdx = 0; // индекс значения которого мы считаем миним

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIdx = i;
            }
        }
        System.out.println("Min value " + minValue + "\n" + "MinIndx" + minIdx );
    }

}
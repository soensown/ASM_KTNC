package com.example.asm_KTNC_1.service;

public class tinhTBC {
    public static double tbc(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Array is empty or null");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

}

package com.example.asm_KTNC_1.service;

public class timSoNhoNhat {
    private static int getMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("mảng trống");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}

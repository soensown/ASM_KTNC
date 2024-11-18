package com.example.asm_KTNC_1.service;

public class tinhThuong {
    public static int chia(float a, float b) throws Exception {
        if (a % 1 != 0 || b % 1 != 0) {
            throw new IllegalArgumentException("Cả hai số phải là số nguyên.");
        }

        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0.");
        }
        return (int) (a / b);
    }
}

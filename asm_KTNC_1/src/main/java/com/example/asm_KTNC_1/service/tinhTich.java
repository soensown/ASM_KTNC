package com.example.asm_KTNC_1.service;

public class tinhTich {
    public static long nhan(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("ko phải số nguyên");
        }
        return (long) a * b;
    }
}

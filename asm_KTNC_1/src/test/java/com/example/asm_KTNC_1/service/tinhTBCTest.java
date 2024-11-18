package com.example.asm_KTNC_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTBCTest {

    tinhTBC testTBC = new tinhTBC();

    @Test
    void test1(){
        double[] Number = {4,5,6,7,8};
        assertEquals(6, testTBC.tbc(Number));
    }

    @Test
    void testTrong() {
        double[] trong = {};
        assertThrows(ArithmeticException.class, () -> {
            testTBC.tbc(trong);
        }, "Mảng không được trống hoặc rỗng");
    }
    @Test
    void testNull() {
        assertThrows(ArithmeticException.class, () -> {
            testTBC.tbc(null);
        }, "Mảng không được trống hoặc rỗng");
    }
}
package com.example.asm_KTNC_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTichTest {
    tinhTich multiply = new tinhTich();
    @Test
    void testNhan1() {
        assertEquals(20,multiply.nhan(4,5));
    }

    @Test
    void testNhan2() {
        assertEquals(20, multiply.nhan(-4, -5));
    }

    @Test
    void testNhan3() {
        assertEquals(-20, multiply.nhan(4, -5));
    }

    @Test
    void testNhan4() {
        assertEquals(10, multiply.nhan(2, 5));
    }
    @Test
    void testNhan5() {
        assertEquals(50, multiply.nhan(10, 5));
    }
    @Test
    void testNhan6() {
        assertEquals(0, multiply.nhan(0, 15));
    }
    @Test
    void testNhan7() {
        assertEquals(150, multiply.nhan(10, 15));
    }
    @Test
    void testNhan8() {
        assertEquals(20, multiply.nhan(4, 5));
    }
    @Test
    void testNhan9() {
        assertEquals(30, multiply.nhan(6, 5));
    }
    @Test
    void testNhan10() {
        assertEquals(45, multiply.nhan(9, 5));
    }
}
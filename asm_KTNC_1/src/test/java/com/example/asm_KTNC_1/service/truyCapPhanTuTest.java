package com.example.asm_KTNC_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class truyCapPhanTuTest {
    truyCapPhanTu tuyCap = new truyCapPhanTu();
    @Test
    void testOutOfBoundsThrowsException() {
        int[] array = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> tuyCap.getIndex(array, 5));
    }
}
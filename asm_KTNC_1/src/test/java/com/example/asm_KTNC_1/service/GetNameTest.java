package com.example.asm_KTNC_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNameTest {
        @Test
        void testCoTen() {
            GetName profile = new GetName("John Doe");
            assertEquals("John Doe", GetName.getNameFromProfile(profile));
        }

        @Test
        void testHoSoTrong() {
            assertThrows(NullPointerException.class, () -> GetName.getNameFromProfile(null));
        }

        @Test
        void TestTenTrong() {
            GetName profile = new GetName(null);
            assertThrows(NullPointerException.class, profile::getNameObject);
        }
}
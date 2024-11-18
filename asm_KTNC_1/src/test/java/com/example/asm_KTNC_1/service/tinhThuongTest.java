package com.example.asm_KTNC_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhThuongTest {

    tinhThuong testchia = new tinhThuong();

    @Test
    void test1() {
        assertThrows(ArithmeticException.class, () -> {
            testchia.chia(10, 0);
        }, "Không thể chia cho 0.");
    }

    @Test
    void test2(){
        try {
            int chia = testchia.chia(10,2);
            assertEquals(5,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test3(){
        try {
            int chia = testchia.chia(10,5);
            assertEquals(2,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test(){
        try {
            int chia = testchia.chia(50,5);
            assertEquals(10,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test5(){
        try {
            int chia = testchia.chia(100,2);
            assertEquals(50,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }
    @Test
    void test6(){
        try {
            int chia = testchia.chia(60,6);
            assertEquals(10,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test7(){
        try {
            int chia = testchia.chia(70,7);
            assertEquals(10,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test8(){
        try {
            int chia = testchia.chia(80,8);
            assertEquals(10,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test9(){
        try {
            int chia = testchia.chia(90,9);
            assertEquals(10,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }

    @Test
    void test10(){
        try {
            int chia = testchia.chia(40,2);
            assertEquals(20,chia );
        }
        catch (Exception e){
            fail("Lỗi: "+ e.getMessage());
        }
    }
}
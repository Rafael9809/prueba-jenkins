package com.example.lbdemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheckTest {
    @Test
    void testSuma() {
        Check a = new Check();
        int rs = a.suma(2, 3);
        assertEquals(5,rs);
    }

    
}

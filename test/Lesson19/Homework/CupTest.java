package Lesson19.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    Cup cupTest = new Cup("water", 80);

    @Test
    void getLiquidType() {
        assertEquals("water", cupTest.getLiquidType());

    }
}
package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void testPosition() {
        Position position = new Position('B', 3);
        assertEquals("B-3", position.toString());
    }
}
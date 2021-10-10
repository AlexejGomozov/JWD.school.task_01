package com.javacourse.lesson2.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayNumberTest {
    double[] expectedArrDigit1;
    double[] expectedArrDigit2;
    ArrayNumber arrayNumber;
 @BeforeEach
        void prepare() {
    expectedArrDigit1 = new double[]{2.0, 4.0, 3.0};
    expectedArrDigit2 = new  double[]{1.0, 4.0, 3.0};
    arrayNumber = new ArrayNumber(expectedArrDigit1);
}
    @Test
    void testGetArrayNumber() {
        double[] actual = arrayNumber.getArrayNumber();
        assertArrayEquals(expectedArrDigit1, actual);
    }

    @Test
    void testSetArrayNumbers() {
        arrayNumber.setArrayNumber(expectedArrDigit2);
        double[] actual = arrayNumber.getArrayNumber();
        assertArrayEquals(expectedArrDigit2, actual);
    }
}
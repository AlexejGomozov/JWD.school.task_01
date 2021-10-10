package com.javacourse.lesson2.service;

import com.javacourse.lesson2.entity.ArrayNumber;
import com.javacourse.lesson2.service.impl.CalculationServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationServiceTest  {

        ArrayNumber arrayNumber;
        CalculationService numberArrayCalc;
        double[]  expectedForTestReplace;
        double[] array;

    @BeforeEach
         void prepare() {
         array = new double[]{1.0, 2.0, 4.0, 3.0, -1.1};
         expectedForTestReplace = new double[]{1.0, 2.0, 4.0, 3.0, 1.1};

        arrayNumber = new ArrayNumber(array);
        numberArrayCalc = new CalculationServiceImpl();

    }

    @Test
    void testAverage() {
     double expected = 1.78;
     double actual = numberArrayCalc.average(arrayNumber);
        assertEquals(expected, actual);
    }
    @Test
    void testAverageStream() {
        double expected = 1.78;
        double actual = numberArrayCalc.averageStream(arrayNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testMaximum() {
        double expected = 4.0;
        double actual = numberArrayCalc.maximum(arrayNumber);
        assertEquals(expected, actual);
    }
    @Test
    void testMaximumStream() {
        double expected = 4.0;
        double actual = numberArrayCalc.maximumStream(arrayNumber);
        assertEquals(expected, actual);
    }
    @Test
    void testMinimum() {
        double expected = -1.1;
        double actual = numberArrayCalc.minimum(arrayNumber);
        assertEquals(expected, actual);
    }
    @Test
    void testMinimumStream() {
        double expected = -1.1;
        double actual = numberArrayCalc.minimumStream(arrayNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testReplace() {
       double[] actual = numberArrayCalc.replaceNegative(arrayNumber);
        assertArrayEquals(expectedForTestReplace, actual);
    }
    @Test
    void testReplaceStream() {
        double[] actual = numberArrayCalc.replaceNegativeStream(arrayNumber);
        assertArrayEquals(expectedForTestReplace, actual);
    }
}


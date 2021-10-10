package com.javacourse.lesson2.service;

import com.javacourse.lesson2.entity.ArrayNumber;
import com.javacourse.lesson2.service.impl.CalculationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceSortTest {
    double[] array;
    double[] expected;
    ArrayNumber arrayNumber;
    CalculationService numberArrayCalc;

    @BeforeEach
            void prepare() {
        array = new double[]{1.0, 2.0, 4.0, 3.0, -1.1};
        expected = new double[]{-1.1, 1.0, 2.0, 3.0, 4.0};
        arrayNumber = new ArrayNumber(array);
        numberArrayCalc = new CalculationServiceImpl();
    }
    @Test
    void bubbleSort() {
        double[] actual = numberArrayCalc.bubbleSort(arrayNumber);
        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSort() {

        double[] actual = numberArrayCalc.mergeSort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void quickSort() {
        double[] actual = numberArrayCalc.quickSort(array, 0, array.length-1);
        assertArrayEquals(expected, actual);
    }
}
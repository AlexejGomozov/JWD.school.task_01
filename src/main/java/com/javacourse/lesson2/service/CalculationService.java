package com.javacourse.lesson2.service;

import com.javacourse.lesson2.entity.ArrayNumber;

public interface CalculationService {

        double average(ArrayNumber array);
        double averageStream(ArrayNumber array);

        double maximum(ArrayNumber array);
        double maximumStream(ArrayNumber array);


        double minimum(ArrayNumber array);
        double minimumStream(ArrayNumber array);

        double[] replaceNegative(ArrayNumber array);
        double[] replaceNegativeStream(ArrayNumber array);

        double[] bubbleSort(ArrayNumber array);

        double[] mergeSort(double[] arrayS);

        double[] quickSort( double[] array, int low, int high) ;

}
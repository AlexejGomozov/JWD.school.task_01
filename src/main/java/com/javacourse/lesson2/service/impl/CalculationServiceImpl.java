package com.javacourse.lesson2.service.impl;

import com.javacourse.lesson2.service.CalculationService;
import com.javacourse.lesson2.entity.ArrayNumber;

import java.util.stream.DoubleStream;

public class CalculationServiceImpl implements CalculationService{

@Override
    public double average(ArrayNumber array) {
        double[] arrNum= array.getArrayNumber();
        double sum = 0;
        for (double num : arrNum) {
            sum += num;
        }
        return sum / arrNum.length;
    }
    @Override
    public double averageStream(ArrayNumber array){
    double[] arrNum= array.getArrayNumber();
    return DoubleStream.of(arrNum)
                       .average()
                       .getAsDouble();
    };
@Override
    public double maximum(ArrayNumber array) {
        double[] arrNum= array.getArrayNumber();
        double max = arrNum[0];
        for (int numMax = 1; numMax < arrNum.length; numMax++) {
            if (arrNum[numMax] > max) {
                max = arrNum[numMax];
            }
        }
        return max;
    }
    @Override
    public double maximumStream(ArrayNumber array){
        double[] arrNum= array.getArrayNumber();
        return DoubleStream.of(arrNum)
                           .max()
                           .getAsDouble();
    };
@Override
    public double minimum(ArrayNumber array) {
        double[] arrNum= array.getArrayNumber();
        double min = arrNum[0];
        for (int numMin = 1; numMin < arrNum.length; numMin++) {
            if (min > arrNum[numMin]) {
                min = arrNum[numMin];
            }
        }
        return min;
    }
    @Override
    public double minimumStream(ArrayNumber array){
        double[] arrNum= array.getArrayNumber();
        return DoubleStream.of(arrNum)
                           .min()
                           .getAsDouble();
    };
@Override
    public double[] replaceNegative(ArrayNumber array) {
        double[] arrNum= array.getArrayNumber();
        for (int num = 0; num < arrNum.length; num++) {
            if (arrNum[num] < 0) {
                arrNum[num] = arrNum[num] * (-1);
            }
        }
        return arrNum;
    }
    @Override
    public double[] replaceNegativeStream(ArrayNumber array){
        double[] arrNum= array.getArrayNumber();
        double[] arrNumStream = DoubleStream.of(arrNum)
                .map(n -> {
                    if (n < 0) {
                        n = (-1) * n;
                    }
                    return n;
                })
                .toArray();
        return arrNumStream;
    }

@Override
    public double[] bubbleSort(ArrayNumber array) {
        double[] arrNum= array.getArrayNumber();
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrNum.length - 1; i++) {
                if (arrNum[i] > arrNum[i + 1]) {
                    temp = arrNum[i];
                    arrNum[i] = arrNum[i + 1];
                    arrNum[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arrNum;
    }

@Override
    public double[] mergeSort(double[] arrMergeSort) {
        if (arrMergeSort == null) return null;
        if (arrMergeSort.length < 2) return arrMergeSort;

        double[] leftSide = new double[(arrMergeSort.length) / 2];
        double[] rightSide = new double[arrMergeSort.length - (arrMergeSort.length / 2)];
        System.arraycopy(arrMergeSort, 0, leftSide, 0, arrMergeSort.length / 2);
        System.arraycopy(arrMergeSort, arrMergeSort.length / 2, rightSide, 0, arrMergeSort.length - (arrMergeSort.length / 2));
        double[] left = mergeSort(leftSide);
        double[] right = mergeSort(rightSide);


        class LokalMerge {
            private static void merge(double[] targetArray, double[] arr1, double[] arr2) {

                int arr1MinIndex = 0, arr2MinIndex = 0;
                int targetArrMinIndex = 0;

                while ((arr1MinIndex < arr1.length) && (arr2MinIndex < arr2.length)) {
                    if (arr1[arr1MinIndex] <= arr2[arr2MinIndex]) {
                        targetArray[targetArrMinIndex] = arr1[arr1MinIndex];
                        arr1MinIndex++;
                    } else {
                        targetArray[targetArrMinIndex] = arr2[arr2MinIndex];
                        arr2MinIndex++;
                    }
                    targetArrMinIndex++;
                }
                while (arr1MinIndex < arr1.length) {
                    targetArray[targetArrMinIndex] = arr1[arr1MinIndex];
                    arr1MinIndex++;
                    targetArrMinIndex++;
                }
                while (arr2MinIndex < arr2.length) {
                    targetArray[targetArrMinIndex] = arr2[arr2MinIndex];
                    arr2MinIndex++;
                    targetArrMinIndex++;
                }
            }
        }
        LokalMerge.merge(arrMergeSort, left, right);
        return arrMergeSort ;
    }

@Override
    public double[] quickSort( double[] array, int low, int high) {

        if (array.length == 0) return null;
        if (low >= high) return array;

        int middle = low + (high - low) / 2;
        double pivot = array[middle];

        int i = low; int y = high;
        while (i <= y) {
            while(array[i]< pivot){
                i++;
            }
            while(array[y]> pivot){
                y--;
            }
            if(i<=y){
                double temp = array[i];
                array[i] = array[y];
                array[y] = temp;
                i++;
                y--;
            }
        }
        if(low < y) quickSort(array, low, y);
        if(high > i) quickSort(array, i, high);

        return array;
    }
}

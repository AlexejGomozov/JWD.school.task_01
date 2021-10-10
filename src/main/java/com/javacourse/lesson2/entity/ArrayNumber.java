package com.javacourse.lesson2.entity;

import java.util.Arrays;

public class ArrayNumber {

    private double[]  arrayNumber;

    public ArrayNumber(double[] arrayNumber){
            this.arrayNumber = arrayNumber.clone();
    }

    public double[] getArrayNumber() {
        double[] arrayCopyNumber= arrayNumber.clone();
        return arrayCopyNumber;
    }
    public void setArrayNumber(double[] arrayNumber) {
        this.arrayNumber = arrayNumber.clone();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayNumber that = (ArrayNumber) o;
        return Arrays.equals(arrayNumber, that.arrayNumber);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayNumber);
    }

    @Override
    public String toString() {
        return "ArrayNumber{" +
                "arrayNumber=" + Arrays.toString(arrayNumber) +
                '}';
    }
}

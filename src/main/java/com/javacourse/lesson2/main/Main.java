package com.javacourse.lesson2.main;

import com.javacourse.lesson2.entity.ArrayNumber;
import com.javacourse.lesson2.exception.ReaderException;
import com.javacourse.lesson2.parser.impl.ParserDataImpl;
import com.javacourse.lesson2.reader.impl.ReaderFromFileImpl;
import com.javacourse.lesson2.service.impl.CalculationServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws ReaderException {
        ReaderFromFileImpl reader = new ReaderFromFileImpl();
        ParserDataImpl parser = new ParserDataImpl();
         String text = reader.read("resources/numbers");
         double [] arrayDigit = parser.parseDataLines(text);

        ArrayNumber arrayNumber= new ArrayNumber(arrayDigit);
       double[] arrayResult = arrayNumber.getArrayNumber();
        logger.info("Array of real numbers" + Arrays.toString(arrayResult));


        double averageNumberArray = new CalculationServiceImpl().average(arrayNumber);
        logger.info("The average of the array is: " + averageNumberArray);

              double averageNumberArrayStream = new CalculationServiceImpl().averageStream(arrayNumber);
              logger.info("The average of the array is: " + averageNumberArrayStream);


        double maxNumberArray = new CalculationServiceImpl().maximum(arrayNumber);
        logger.info("The maximum of the array is: " + maxNumberArray);

               double maxNumberArrayStream = new CalculationServiceImpl().maximumStream(arrayNumber);
               logger.info("The maximum of the array is: " + maxNumberArrayStream);


        double minNumberArray = new CalculationServiceImpl().minimum(arrayNumber);
        logger.info("The minimum of the array is: " + minNumberArray);

               double minNumberArrayStream = new CalculationServiceImpl().minimum(arrayNumber);
               logger.info("The minimum of the array is: " + minNumberArrayStream);


        double[] replaceNumberArrayPositiveWithNegative = new CalculationServiceImpl().replaceNegative(arrayNumber);
        logger.info("\n" +
                "Array of negative numbers replaced with positive ones is: " + Arrays.toString(replaceNumberArrayPositiveWithNegative));

                double[] replaceNumberArrayPositiveWithNegativeStream = new CalculationServiceImpl().replaceNegative(arrayNumber);
                logger.info("\n" +
                "Array of negative numbers replaced with positive ones is: " + Arrays.toString(replaceNumberArrayPositiveWithNegativeStream));


        double[] bubbleSortNumberArray = new CalculationServiceImpl().bubbleSort(arrayNumber);
        logger.info("Sort the array using the bubble method: " + Arrays.toString(bubbleSortNumberArray));


        double[] quickSortNumberArray = new CalculationServiceImpl().quickSort(arrayResult, 0,arrayResult.length-1);
        logger.info("Sort the array using the quick sort method: " + Arrays.toString(quickSortNumberArray));


        double[] mergeSortNumberArray = new CalculationServiceImpl().mergeSort(arrayResult);
        logger.info("Sort the array using the merge sort method: " + Arrays.toString(mergeSortNumberArray));
    }
}

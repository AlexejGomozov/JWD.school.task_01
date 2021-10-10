package com.javacourse.lesson2.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.javacourse.lesson2.parser.ParserData;

import com.javacourse.lesson2.validation.impl.ValidatorDataImpl;
import org.apache.commons.lang3.ArrayUtils;

public class ParserDataImpl implements ParserData {

    static Logger logger = LogManager.getLogger();
    private static final String REGEX_SPLIT = "\s";

    @Override
    public double[] parseDataLines(String line) {
        List<Double> listDouble = new ArrayList<>();

        String[] lineAfterSplit = line.split(REGEX_SPLIT);

        for (String st : lineAfterSplit) {
            if (ValidatorDataImpl.getInstance().validatorData(st)) {
                double value = Double.parseDouble((st));
                listDouble.add(value);
            }
        }
        if(listDouble.size()==0) {
            logger.warn("File is empty. It's nothing to parse. ");
        }
        int arrayDoubleSize = listDouble.size();
        Double[] arrayObjectDouble = listDouble.toArray(new Double[arrayDoubleSize]);

        return ArrayUtils.toPrimitive(arrayObjectDouble);

    }
}

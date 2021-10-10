package com.javacourse.lesson2.validation.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.javacourse.lesson2.validation.ValidatorData;

public class ValidatorDataImpl implements ValidatorData {

    private final static String REGEX_DIGIT = "-?\\d\\d*(\\.\\d+)?";

    private static ValidatorDataImpl instance;

   public static ValidatorDataImpl getInstance(){
       if (instance == null) instance =  new ValidatorDataImpl();

       return instance;
    }
    @Override
    public boolean validatorData(String stringNumber) {
            Pattern pattern = Pattern.compile(REGEX_DIGIT);
            Matcher matcher = pattern.matcher(stringNumber);

            return matcher.matches();
        }
    }


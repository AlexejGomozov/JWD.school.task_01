package com.javacourse.lesson2.validation;

import com.javacourse.lesson2.validation.impl.ValidatorDataImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {

    String strActual = "1.0 3.0 4.0 56.0 = < > 4.0 ...1<";
    String strExpected = "1.0 3.0 4.0 56.0 4.0 1<";

    @Test
    void  validatorData(){
       boolean actual =(ValidatorDataImpl.getInstance().validatorData(strActual));
       boolean expected = (ValidatorDataImpl.getInstance().validatorData(strExpected));

        assertEquals( expected, actual);
    }
}

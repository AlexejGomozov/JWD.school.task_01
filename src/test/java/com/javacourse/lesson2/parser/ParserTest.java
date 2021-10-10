package com.javacourse.lesson2.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.javacourse.lesson2.parser.impl.ParserDataImpl;

class ParserTest {


        String strActual = "1.0 3.0 4.0 56.0 4.0 ...1<";
        double[] expected = new double[]{1.0, 3.0, 4.0, 56.0, 4.0};

    @Test
    void parseDataLines()  {
        ParserDataImpl parser = new ParserDataImpl();
        double [] actual = parser.parseDataLines(strActual);

        assertArrayEquals( expected, actual);
    }

}
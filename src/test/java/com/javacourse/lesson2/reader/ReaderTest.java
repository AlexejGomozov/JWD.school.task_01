package com.javacourse.lesson2.reader;

import com.javacourse.lesson2.exception.ReaderException;
import com.javacourse.lesson2.reader.impl.ReaderFromFileImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReaderTest {

        String  strExpected = "1.0 aba 2.0 4.0 sfg sb --  3.0 -1.1 ";
    char[] expected = strExpected.toCharArray();
        String fileName = "resources/testNumbers";
        ReaderFromFileImpl reader = new ReaderFromFileImpl();

        @Test
        void readerTest()  throws ReaderException {       // ReaderException used for method read()

            String strActual = reader.read(fileName);
            char[] actual = strActual.toCharArray();
            assertArrayEquals( expected, actual);
        }
    }


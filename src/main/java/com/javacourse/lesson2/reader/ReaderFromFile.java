package com.javacourse.lesson2.reader;

import com.javacourse.lesson2.exception.ReaderException;


public interface ReaderFromFile {

        String read(String fileName) throws ReaderException;
}

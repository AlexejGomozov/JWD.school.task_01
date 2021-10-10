package com.javacourse.lesson2.reader.impl;

import com.javacourse.lesson2.reader.ReaderFromFile;
import com.javacourse.lesson2.exception.ReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReaderFromFileImpl implements ReaderFromFile{

    static Logger logger = LogManager.getLogger();
    private static final String REGEX_SPACE = "\s";
@Override
    public String read(String fileName) throws ReaderException{

        StringBuilder strBuilder = new StringBuilder();

        try(Scanner scanner = new Scanner(new FileReader(fileName))){
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                strBuilder.append(line + REGEX_SPACE);
            }
        } catch (FileNotFoundException e){
            logger.log(Level.ERROR, "File" + fileName + " was not found", e);
           throw  new ReaderException("File was not found", e);
            }
        return strBuilder.toString();
    }
}

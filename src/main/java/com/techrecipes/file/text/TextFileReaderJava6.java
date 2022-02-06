package com.techrecipes.file.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderJava6 {

    public static void main(String[] args) throws IOException {
        System.out.println(readFileString(new File("src/main/resources/test.txt")));
    }

    public static String readFileString(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line).append(System.lineSeparator());
        }
        return  stringBuilder.toString();
    }

}

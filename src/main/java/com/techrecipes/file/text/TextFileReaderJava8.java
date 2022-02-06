package com.techrecipes.file.text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextFileReaderJava8 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","test.txt");

        List<String> listString = Files.readAllLines(path);
        String strFile = String.join(System.lineSeparator(), listString);
        //System.out.println(strFile);
        strFile =  new String(Files.readAllBytes(path));
        //System.out.println(strFile);
        System.out.println(readFileString(new File("src/main/resources/test.txt")));
    }

    static String readFileString(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while((line = reader.readLine()) != null) {
            stringBuilder.append(line).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }


}


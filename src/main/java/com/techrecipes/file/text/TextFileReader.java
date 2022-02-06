package com.techrecipes.file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileReader {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","test.txt");
        String strFile = Files.readString(path);
        System.out.println(strFile);
    }
}

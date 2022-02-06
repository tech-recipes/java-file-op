package com.techrecipes.file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamFile {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","test.txt");

        Files.lines(path)
                .filter( s -> s.length() == 20)
                .forEach(System.out::println);

    }
}

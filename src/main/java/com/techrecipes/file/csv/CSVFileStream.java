package com.techrecipes.file.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CSVFileStream {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","cars.csv");

        Map<String, Long> carsMap = Files.lines(path)
                .skip(1)
                .map(CSVFileStream::getCar)
                .collect(Collectors.groupingBy(Car::getMake, Collectors.counting()));
        System.out.println(carsMap);
    }

    private static Car getCar(String line) {
        String[] fields = line.split(",");
        if(fields.length!=4)
            throw new RuntimeException("Invalid CSV line - " + line);
        return new Car(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3]);
    }
}

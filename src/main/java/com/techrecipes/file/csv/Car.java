package com.techrecipes.file.csv;

public class Car {
    private final int year;
    private final String make;
    private final String model;
    private final String size;

    public Car(int year, String make, String model, String size) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.size = size;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

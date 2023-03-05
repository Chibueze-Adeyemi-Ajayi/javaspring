package org.example;

public class Car implements Vehicle {
    public void print_car_name () {
        System.out.println("Royce Rolls");
    }

    static Car getInstance () {
        return new Car();
    }

}

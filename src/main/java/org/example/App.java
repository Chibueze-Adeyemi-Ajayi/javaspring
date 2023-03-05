package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        java singleton
        Car car = Car.getInstance();
        car.print_car_name();
    }
}

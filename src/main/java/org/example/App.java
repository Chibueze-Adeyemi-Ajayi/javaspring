package org.example;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // application context

        Vehicle car = new EV();
        car.print_car_name();
    }
}

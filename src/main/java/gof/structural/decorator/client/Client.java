/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.client;

import gof.structural.decorator.component.Display;
import gof.structural.decorator.component.StringDisplay;
import gof.structural.decorator.decorator.FullBorder;
import gof.structural.decorator.decorator.SideBorder;

/**
 * Client for Decorator pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        Display d1 = new StringDisplay("Hello, Canada!");
        Display d2 = new SideBorder(d1, '*');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();

        Display d4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("I love Japan!!")), '*')))), '#');
        d4.show();

    }

}

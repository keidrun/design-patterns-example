/**
 * Copyright 2017 Keid
*/
package gof.structural.flyweight.client;

import gof.structural.flyweight.flyweight.BigString;

/**
 * Client for Flyweight pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        BigString bigStr1 = new BigString("0123456789");
        bigStr1.print();

        BigString bigStr2 = new BigString("abc");
        bigStr2.print();

        BigString bigStr3 = new BigString("7E7");
        bigStr3.print();

    }

}

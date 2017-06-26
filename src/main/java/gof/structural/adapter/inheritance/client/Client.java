/**
 * Copyright 2017 Keid
*/
package gof.structural.adapter.inheritance.client;

import gof.structural.adapter.inheritance.adapter.SkyCar;
import gof.structural.adapter.inheritance.target.Car;

/**
 * Client for Adapter pattern using inheritance.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {
        Car myCar = new SkyCar();
        myCar.run();
        myCar.stop();
    }

}

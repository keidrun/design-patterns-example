/**
 * Copyright 2017 Keid
*/
package gof.structural.adapter.composition.client;

import gof.structural.adapter.composition.adapter.SkyCar;
import gof.structural.adapter.composition.target.Car;

/**
 * Client for Adapter pattern using composition.
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

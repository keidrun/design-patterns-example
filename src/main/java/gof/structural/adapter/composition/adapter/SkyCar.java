/**
 * Copyright 2017 Keid
*/
package gof.structural.adapter.composition.adapter;

import gof.structural.adapter.composition.adaptee.Airplane;
import gof.structural.adapter.composition.target.Car;

/**
 * SkyCar :Adaptee
 * 
 * @author Keid
 */
public class SkyCar extends Car {

    private Airplane plane = new Airplane();

    @Override
    public void run() {
        System.out.println("[composition]'run' start.");
        plane.takeOff();
        System.out.println("[composition]'run' done.");
    }

    @Override
    public void stop() {
        System.out.println("[composition]'stop' start.");
        plane.load();
        System.out.println("[composition]'stop' done.");
    }

}

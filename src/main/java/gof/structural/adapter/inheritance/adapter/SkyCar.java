/**
 * Copyright 2017 Keid
*/
package gof.structural.adapter.inheritance.adapter;

import gof.structural.adapter.inheritance.adaptee.Airplane;
import gof.structural.adapter.inheritance.target.Car;

/**
 * SkyCar :Adapter
 * 
 * @author Keid
 */
public class SkyCar extends Airplane implements Car {

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.adapter.inheritance.target.Car#run()
     */
    @Override
    public void run() {
        System.out.println("[inheritance]'run' start.");
        takeOff();
        System.out.println("[inheritance]'run' done.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.adapter.inheritance.target.Car#stop()
     */
    @Override
    public void stop() {
        System.out.println("[inheritance]'load' start.");
        load();
        System.out.println("[inheritance]'load' done.");
    }

}

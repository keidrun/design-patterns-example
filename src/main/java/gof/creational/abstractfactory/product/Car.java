/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.product;

/**
 * Car :ConcreteProduct
 * 
 * @author Keid
 */
public class Car extends Vehicle {

    public Car(int kilometerPerHour) {
        super.kilometerPerHour = kilometerPerHour;
    }

    @Override
    public void saySpeed() {
        System.out.println("The car's speed is about " + kilometerPerHour + " km/h.");
    }

}

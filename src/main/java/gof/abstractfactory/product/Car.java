/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * Car :ConcreteProduct
 * 
 * @author Keid
 */
public class Car extends Vehicle {

    public Car(int kilometerPerHour) {
        super.kilometerPerHour = kilometerPerHour;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.product.Vehicle#saySpeed()
     */
    @Override
    public void saySpeed() {
        System.out.println("The car's speed is about " + kilometerPerHour + " km/h.");
    }

}

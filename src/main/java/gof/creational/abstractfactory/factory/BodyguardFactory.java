/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.factory;

import gof.creational.abstractfactory.product.Car;
import gof.creational.abstractfactory.product.Gun;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;

/**
 * BodyguardFactory :ConcreteFactory
 * 
 * @author Keid
 */
public class BodyguardFactory extends HumanFactory {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createWeapon()
     */
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createVehicle()
     */
    @Override
    public Vehicle createVehicle() {
        return new Car(80);
    }

}

/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.factory;

import gof.creational.abstractfactory.product.IPhone;
import gof.creational.abstractfactory.product.Segway;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;

/**
 * MillennialFactory :ConcreteFactory
 * 
 * @author Keid
 */
public class MillennialFactory extends HumanFactory {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createWeapon()
     */
    @Override
    public Weapon createWeapon() {
        return new IPhone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createVehicle()
     */
    @Override
    public Vehicle createVehicle() {
        return new Segway(10);
    }

}

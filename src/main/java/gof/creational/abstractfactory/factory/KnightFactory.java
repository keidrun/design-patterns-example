/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.factory;

import gof.creational.abstractfactory.product.Horse;
import gof.creational.abstractfactory.product.Sword;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;

/**
 * KnightFactory :ConcreteFactory
 * 
 * @author Keid
 */
public class KnightFactory extends HumanFactory {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createWeapon()
     */
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createVehicle()
     */
    @Override
    public Vehicle createVehicle() {
        return new Horse(30);
    }

}

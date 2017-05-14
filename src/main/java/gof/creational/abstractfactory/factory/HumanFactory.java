/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.factory;

import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;

/**
 * HumanFactory :AbstractFactory
 * 
 * @author Keid
 */
public abstract class HumanFactory {

    public static HumanFactory getFactory(String className) {
        HumanFactory factory = null;
        try {
            factory = (HumanFactory) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        return factory;
    }

    public abstract Weapon createWeapon();

    public abstract Vehicle createVehicle();

}

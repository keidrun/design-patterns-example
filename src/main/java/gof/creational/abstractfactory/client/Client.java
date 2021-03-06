/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.client;

import gof.creational.abstractfactory.factory.HumanFactory;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;

/**
 * Client for AbstractFactory pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        // Create bodyguard's weapon and vehicle.
        System.out.println("=== Bodyguard ===");
        HumanFactory factory = HumanFactory.getFactory("gof.creational.abstractfactory.factory.BodyguardFactory");
        Weapon weapon = factory.createWeapon();
        weapon.attack();
        Vehicle vehicle = factory.createVehicle();
        vehicle.saySpeed();

        // Create knight's weapon and vehicle.
        System.out.println("=== Knight ===");
        factory = HumanFactory.getFactory("gof.creational.abstractfactory.factory.KnightFactory");
        weapon = factory.createWeapon();
        weapon.attack();
        vehicle = factory.createVehicle();
        vehicle.saySpeed();

        // Create millennial generation's weapon and vehicle.
        System.out.println("=== Millennial Generation ===");
        factory = HumanFactory.getFactory("gof.creational.abstractfactory.factory.MillennialFactory");
        weapon = factory.createWeapon();
        weapon.attack();
        vehicle = factory.createVehicle();
        vehicle.saySpeed();

    }

}

/**
 * Copyright 2017 Keid
*/
package gof.creational.builder.builder;

import gof.creational.abstractfactory.product.Horse;
import gof.creational.abstractfactory.product.Sword;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;
import gof.creational.builder.product.Human;

/**
 * KnightBuilder :ConcreteBuilder
 * 
 * @author Keid
 * 
 */
public class KnightBuilder implements HumanBuilder {

    private Human human;

    public KnightBuilder() {
        human = new Human();
    }

    @Override
    public void buildName(String name) {
        human.setName(name);
    }

    @Override
    public void buildType() {
        human.setType("Knight");
    }

    @Override
    public void buildWeapon() {
        Weapon weapon = new Sword();
        human.setWeapon(weapon);
    }

    @Override
    public void buildVehicle() {
        Vehicle vehicle = new Horse(30);
        human.setVehicle(vehicle);
    }

    public Human getResult() {
        return human;
    }

}

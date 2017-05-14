/**
 * Copyright 2017 Keid
*/
package gof.creational.builder.director;

import gof.creational.builder.builder.HumanBuilder;

/**
 * HumanDirector :Director
 * 
 * @author Keid
 */
public class HumanDirector {

    private HumanBuilder builder;

    public HumanDirector(HumanBuilder builder) {
        this.builder = builder;
    }

    public void construct(String name) {
        builder.buildName(name);
        builder.buildType();
        builder.buildWeapon();
        builder.buildVehicle();
    }

}

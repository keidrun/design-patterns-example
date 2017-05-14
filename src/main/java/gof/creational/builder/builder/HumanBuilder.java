/**
 * Copyright 2017 Keid
*/
package gof.creational.builder.builder;

/**
 * HumanBuilder :Builder
 * 
 * @author Keid
 */
public interface HumanBuilder {

    public void buildName(String name);

    public void buildType();

    public void buildWeapon();

    public void buildVehicle();

}

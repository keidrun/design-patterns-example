/**
 * Copyright 2017 Keid
*/
package gof.prototype.product;

/**
 * Drawing :Prototype
 * 
 * @author Keid
 */
public interface Drawing extends Cloneable {

    public void draw(int count);

    public Drawing clone();

}

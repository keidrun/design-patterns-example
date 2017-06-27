/**
 * Copyright 2017 Keid
*/
package gof.structural.proxy.subject;

/**
 * Displayable :Subject
 * 
 * @author Keid
 */
public interface Displayable {

    public void setName(String name);

    public String getName();

    public void display(String message);

}

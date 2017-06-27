/**
 * Copyright 2017 Keid
*/
package gof.structural.proxy.subject;

/**
 * Window :RealSubject
 * 
 * @author Keid
 */
public class Window implements Displayable {

    private String name;

    public Window(String name) {
        this.name = name;
        System.out.println("Create REAL Window instance (" + name + ") ...");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display(String message) {
        System.out.println("[name] " + this.name);
        System.out.println("[message] " + message);
    }

}

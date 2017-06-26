/**
 * Copyright 2017 Keid
*/
package gof.structural.bridge.abstraction;

import gof.structural.bridge.implementor.WindowImpl;

/**
 * Display :Abstraction
 * 
 * @author Keid
 */
public class Window {

    private WindowImpl impl;

    public Window(WindowImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.devOpen();
    }

    public void print() {
        impl.devPrint();
    }

    public void close() {
        impl.devClose();
    }

    public final void draw() {
        open();
        print();
        close();
    }

}

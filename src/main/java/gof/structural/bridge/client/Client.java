/**
 * Copyright 2017 Keid
*/
package gof.structural.bridge.client;

import gof.structural.bridge.abstraction.CountWindow;
import gof.structural.bridge.abstraction.Window;
import gof.structural.bridge.implementor.StringWindowImpl;

/**
 * Client for Bridge pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        Window window = new Window(new StringWindowImpl("Hi, Canada!"));
        CountWindow countWindow = new CountWindow(new StringWindowImpl("Oops, is this Philippines?"));

        window.draw();
        countWindow.draw();
        countWindow.multiDraw(5);

    }

}

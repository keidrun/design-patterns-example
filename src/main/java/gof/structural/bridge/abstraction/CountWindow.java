/**
 * Copyright 2017 Keid
*/
package gof.structural.bridge.abstraction;

import gof.structural.bridge.implementor.WindowImpl;

/**
 * BorderWindow :RefinedAbstraction
 * 
 * @author Keid
 */
public class CountWindow extends Window {

    public CountWindow(WindowImpl impl) {
        super(impl);
    }

    public void multiDraw(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}

/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.decorator;

import gof.structural.decorator.component.Display;

/**
 * Border :Decorator
 * 
 * @author Keid
 */
public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }

}

/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.decorator;

import gof.structural.decorator.component.Display;

/**
 * SideBorder :ConcleteDecorator
 * 
 * @author Keid
 */
public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int byteColumns() {
        return 1 + display.byteColumns() + 1;
    }

    @Override
    public int byteRows() {
        return display.byteRows();
    }

    @Override
    public String rowText(int row) {
        return borderChar + display.rowText(row) + borderChar;
    }

}

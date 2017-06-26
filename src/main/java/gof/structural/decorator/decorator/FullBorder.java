/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.decorator;

import gof.structural.decorator.component.Display;

/**
 * FullBorder :ConcreteDecorator
 * 
 * @author Keid
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int byteColumns() {
        return 1 + display.byteColumns() + 1;
    }

    @Override
    public int byteRows() {
        return 1 + display.byteRows() + 1;
    }

    @Override
    public String rowText(int row) {
        if (row == 0) {
            // over line
            return "+" + makeLine('-', display.byteColumns()) + "+";
        } else if (row == display.byteRows() + 1) {
            // under line
            return "+" + makeLine('-', display.byteColumns()) + "+";
        } else {
            return "|" + display.rowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }

}

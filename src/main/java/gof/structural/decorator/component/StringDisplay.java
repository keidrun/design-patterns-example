/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.component;

/**
 * StringDisplay :ConcreteComponent
 * 
 * @author Keid
 */
public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int byteColumns() {
        return str.getBytes().length;
    }

    @Override
    public int byteRows() {
        return 1;
    }

    @Override
    public String rowText(int row) {
        if (row == 0) {
            return str;
        } else {
            return null;
        }
    }

}

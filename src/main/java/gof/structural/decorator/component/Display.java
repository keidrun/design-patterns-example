/**
 * Copyright 2017 Keid
*/
package gof.structural.decorator.component;

/**
 * Display :Component
 * 
 * @author Keid
 */
public abstract class Display {

    public abstract int byteColumns();

    public abstract int byteRows();

    public abstract String rowText(int row);

    public final void show() {
        for (int i = 0; i < byteRows(); i++) {
            System.out.println(rowText(i));
        }
    }

}

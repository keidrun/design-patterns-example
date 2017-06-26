/**
 * Copyright 2017 Keid
*/
package gof.structural.bridge.implementor;

/**
 * StringWindowImpl :ConcreteImplementor
 * 
 * @author Keid
 */
public class StringWindowImpl implements WindowImpl {

    private String str;
    private int size;

    public StringWindowImpl(String str) {
        this.str = str;
        this.size = str.getBytes().length;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.bridge.implementor.WindowImpl#devOpen()
     */
    @Override
    public void devOpen() {
        printLine();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.bridge.implementor.WindowImpl#devPrint()
     */
    @Override
    public void devPrint() {
        System.out.println("|" + str + "|");
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.bridge.implementor.WindowImpl#devClose()
     */
    @Override
    public void devClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}

/**
 * Copyright 2017 Keid
*/
package gof.structural.composite.leaf;

import gof.structural.composite.component.Entry;

/**
 * File :Leaf
 * 
 * @author Keid
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#name()
     */
    @Override
    public String name() {
        return name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#size()
     */
    @Override
    public int size() {
        return size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#printList(java.lang.String)
     */
    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

}

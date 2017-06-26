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

    @Override
    public String name() {
        return name;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

}

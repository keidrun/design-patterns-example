/**
 * Copyright 2017 Keid
*/
package gof.structural.composite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gof.structural.composite.component.Entry;

/**
 * Directory :Composite
 * 
 * @author Keid
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#name()
     */
    @Override
    public String name() {
        return this.name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#size()
     */
    @Override
    public int size() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.size();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.structural.composite.component.Entry#printList(java.lang.String)
     */
    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.listIterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }

}

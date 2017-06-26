/**
 * Copyright 2017 Keid
*/
package gof.structural.composite.component;

/**
 * Entry :Component
 * 
 * @author Keid
 */
public abstract class Entry {

    public abstract String name();

    public abstract int size();

    public Entry add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public void printLine() {
        printList("");
    }

    public abstract void printList(String prefix);

    public String toString() {
        return this.name() + " (" + this.size() + ")";
    }
}

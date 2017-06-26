/**
 * Copyright 2017 Keid
*/
package others.immutable.client;

import java.util.Date;

import others.immutable.object.ImmutableDate;

/**
 * Client for Immutable Object
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        ImmutableDate date = new ImmutableDate(new Date());
        System.out.println(date.getDate());
        Thread.sleep(2000);
        date = date.changeDate(new Date());
        System.out.println(date.getDate());

    }

}

/**
 * Copyright 2017 Keid
*/
package others.immutable.object;

import java.util.Date;

/**
 * ImmutableDate :Immutable Object
 * 
 * @author Keid
 */
public final class ImmutableDate {

    private final Date date;

    public ImmutableDate(Date date) {
        this.date = (Date) date.clone();
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public ImmutableDate changeDate(Date date) {
        return new ImmutableDate(date);
    }

}

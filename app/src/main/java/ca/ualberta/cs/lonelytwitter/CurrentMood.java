package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bangotti on 9/14/17.
 */

public abstract class CurrentMood {

    private Date date;

    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String emoji();

}

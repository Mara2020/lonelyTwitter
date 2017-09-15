package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bangotti on 9/14/17.
 */

public class SadMood extends CurrentMood {
    public SadMood(Date date) {
        super(date);
    }

    public SadMood() {
        super();
    }

    public String emoji() {
        return ":(";
    }
}

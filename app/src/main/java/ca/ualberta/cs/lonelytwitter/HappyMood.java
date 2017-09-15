package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bangotti on 9/14/17.
 */

public class HappyMood extends CurrentMood {
    public HappyMood(Date date){
        super(date);
    }

    public HappyMood(){
        super();
    }

    public String emoji() {
        return ":)";
    }
}

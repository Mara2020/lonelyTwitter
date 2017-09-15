package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Mara2020 on 9/14/17.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
    }

    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

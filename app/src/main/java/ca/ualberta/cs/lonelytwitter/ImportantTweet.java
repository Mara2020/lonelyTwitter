package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Mara2020 on 9/14/17.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
    }

    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override
    public String getMessage() {
        return "!!!" + super.getMessage();
    }

}

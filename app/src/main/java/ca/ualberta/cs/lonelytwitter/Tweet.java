package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by Mara2020 on 9/14/17.
 */
public abstract class Tweet implements Tweetable {
    private String message;
    protected Date date;

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    public Tweet(String message, Date date) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public String getMessage() {
        return message;
    }

    public abstract Boolean isImportant();

}

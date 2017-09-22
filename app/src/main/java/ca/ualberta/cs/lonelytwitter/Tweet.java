package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mara2020 on 9/14/17.
 */
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

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

    @Override
    public String toString() {
        return date.toString() + " | " + message;
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

    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    public abstract Boolean isImportant();

}

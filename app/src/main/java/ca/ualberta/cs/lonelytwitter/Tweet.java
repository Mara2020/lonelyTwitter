/*
* Class name: Tweet
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 * @author Bianca Angotti
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    /**
     * Constructs Tweet Objects
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    /**
     * Constructs Tweet Objects
     * @param message tweet message
     * @param date tweet date
     * @throws TweetTooLongException
     */
    public Tweet(String message, Date date) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
    }

    /**
     * Sets the date
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the date.
     * @return date tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Specifies to string output
     * @return String message
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * gets the tweet message
     * @return message tweet message
     */
    public String getMessage() {
        return message;
    }

    /**
     * gets the list of moods
     * @return moodlist ArrayList<CurrentMood>
     */
    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    /**
     * sets the list of moods
     * @param moodList ArrayList<CurrentMood>
     */
    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    /**
     * Marks whether or not the tweet is important
     * @return boolean
     */
    public abstract Boolean isImportant();

}

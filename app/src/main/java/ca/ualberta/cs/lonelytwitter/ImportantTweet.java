/*
* Class name: ImportantTweet
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an Important Tweet
 * @author Bianca Angotti
 * @version 1.0
 * @see Tweetable
 * @see Tweet
 * @since 1.0
 *
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructor of Important Tweet
     * @param message tweet message
     * @param date tweet date
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
    }

    /**
     * Constructor of Important Tweet
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * Implements the isImportant boolean
     * @return true
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Overrides String for proper formatting
     * @return string important tweet
     */
    @Override
    public String getMessage() {
        return "!!!" + super.getMessage();
    }

}

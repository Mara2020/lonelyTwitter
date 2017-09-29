/*
* Class name: NormalTweet
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Normal Tweet
 * @author Bianca Angotti
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public class NormalTweet extends Tweet {
    /**
     * Constructor for Normal Tweet
     * @param message tweet message
     * @param date tweet date
     * @throws TweetTooLongException
     */
    public NormalTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
    }

    /**
     * Constructor for Normal Tweet
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * Implements the isImportant boolean
     * @return false
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

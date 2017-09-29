/*
* Class name: Tweetable
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweetable class
 * @author Bianca Angotti
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 *
 */

public interface Tweetable {
    /**
     * Requires the get message function
     * @return string tweet message
     */
    public String getMessage();

    /**
     * Requires the get date function
     * @return tweet date
     */
    public Date getDate();
}

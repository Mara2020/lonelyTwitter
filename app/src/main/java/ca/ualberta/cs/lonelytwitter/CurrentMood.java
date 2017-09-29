/*
* Class name: CurrentMood
*
* Version: Version 1.0
*
* Date: September 28, 2017
*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a CurrentMood
 * @author Bianca Angotti
 * @version 1.0
 * @see HappyMood
 * @see SadMood
 * @since 1.0
 *
 */

public abstract class CurrentMood {

    private Date date;

    /**
     * Constructs Mood Objects
     */
    public CurrentMood() {
        this.date = new Date();
    }

    /**
     * Constructs Mood Objects
     * @param date Mood date
     */
    public CurrentMood(Date date) {
        this.date = date;
    }

    /**
     * Sets the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the emoji string
     * @return emoji String
     */
    public abstract String emoji();

}

/*
* Class name: SadMood
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Sad Mood
 * @author Bianca Angotti
 * @version 1.0
 * @see CurrentMood
 * @see HappyMood
 * @since 1.0
 *
 */

public class SadMood extends CurrentMood {
    /**
     * Constructor for Sad mood
     * @param date mood date
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Constructor for Sad Mood
     */
    public SadMood() {
        super();
    }

    /**
     * Returns an emoji string
     * @return
     */
    public String emoji() {
        return ":(";
    }
}

/*
* Class name: HappyMood
*
* Version: Version 1.0
*
* Date: September 28, 2017
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Happy Mood
 * @author Bianca Angotti
 * @version 1.0
 * @see CurrentMood
 * @see SadMood
 * @since 1.0
 *
 */
public class HappyMood extends CurrentMood {
    /**
     * Constructs HappyMood
     * @param date mood date
     */
    public HappyMood(Date date){
        super(date);
    }

    /**
     * Constructs HappyMood
     */
    public HappyMood(){
        super();
    }

    /**
     * Returns an emoji string
     * @return
     */
    public String emoji() {
        return ":)";
    }
}

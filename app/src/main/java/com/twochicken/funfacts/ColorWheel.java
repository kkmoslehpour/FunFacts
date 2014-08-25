package com.twochicken.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by kevinmoslehpour on 8/23/14.
 */
public class ColorWheel {
    //Member Variables (properties about the object)
    public String [] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray



    };
    public int getColor(){

        //Method (abilities: things object can do)

        String color = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;


    }
};

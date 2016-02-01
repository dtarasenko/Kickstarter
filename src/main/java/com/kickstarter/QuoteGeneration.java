package com.kickstarter;

import java.util.Random;

/**
 * Created by DTarasenko on 1/31/2016.
 */
public class QuoteGeneration {
    public String nextQuote() {
        String[] quotes = new String[] {
                "Welcome to Kickstarter!",
                "Think different!",
                "Make world better!"
        };
        int index = new Random().nextInt(quotes.length);
        return quotes[index];
    }
}

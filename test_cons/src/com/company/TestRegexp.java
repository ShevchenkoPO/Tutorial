package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 12.05.2016.
 */
public class TestRegexp {
    public static final Pattern pattern = Pattern.compile
            ("^\\([A-Za-z0-9_]+\\)$");

    public static void doMatch(String word) {
        String output = "Validation for \"" + word + "\"";
        Matcher matcher = pattern.matcher(word);
        if (matcher.matches())
            output += " passed.";
        else
            output += " not passed.";
        System.out.println(output);
    }

    public static void main(String[] args) {
        doMatch("c0nst@money.simply.net");
        doMatch("somebody@dev.com.ua");
        doMatch("Name.Sur_name@gmail.com");
        doMatch("useR33@somewhere.in.the.net");
    }
}
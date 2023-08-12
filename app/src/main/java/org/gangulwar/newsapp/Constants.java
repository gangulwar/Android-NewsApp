package org.gangulwar.newsapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {

    public static String shortenDescription(String input) {
        if (input.length() <= 65) {
            return input;
        } else {
            int lastSpaceIndex = input.lastIndexOf(" ", 65);
            if (lastSpaceIndex != -1) {
                return input.substring(0, lastSpaceIndex) + "...";
            } else {
                return input.substring(0, 65) + "...";
            }
        }
    }

    public static String getTimeAgo(String dateTimeString) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        try {
            Date date = format.parse(dateTimeString);
            long currentTimeMillis = System.currentTimeMillis();
            long dateTimeMillis = date.getTime();
            long diffMillis = currentTimeMillis - dateTimeMillis;

            if (diffMillis < 0) {
                return "Future";
            } else if (diffMillis < 60000) {
                return "Just now";
            } else if (diffMillis < 3600000) {
                long minutes = diffMillis / 60000;
                return minutes + " minutes ago";
            } else if (diffMillis < 86400000) {
                long hours = diffMillis / 3600000;
                return hours + (hours == 1 ? " hour ago" : " hours ago");
            } else {
                long days = diffMillis / 86400000;
                return days + (days == 1 ? " day ago" : " days ago");
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid Date";
        }
    }


}

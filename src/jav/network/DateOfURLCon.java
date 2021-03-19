/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 *
 * @author HP
 */
public class DateOfURLCon {

    public static void main(String args[])
            throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();
        if (date == 0) {
            System.out.println("No date information.");
        } else {
            System.out.println("Date: " + new Date(date));
        }
    }
}

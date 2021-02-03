/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicprog;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
/**
 *
 * @author HP
 */


public class DateTime {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}
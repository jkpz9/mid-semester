/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itus.course.qc2015.king.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GetWeek {
public static void main(String[] args)
{
    try { 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Calendar candidate = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse("2018-02-11"));
        c.add(Calendar.DATE, 12*7);
        System.out.println(" calculation: " + sdf.format( c.getTime()));
    } catch (ParseException ex) {
        Logger.getLogger(GetWeek.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}

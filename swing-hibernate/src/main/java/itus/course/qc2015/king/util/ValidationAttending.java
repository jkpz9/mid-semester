
package itus.course.qc2015.king.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


 public class ValidationAttending {
    public static boolean isValid(Date originalDate, String startPeriod, String finishPeriod, int nthweek) throws ParseException {
         String[] token1 = startPeriod.split(":");
         String[] token2 =  finishPeriod.split(":");
         int startHours, startMinutes,finishHours, finishMinutes;
       startHours  = Integer.parseInt(token1[0]);
       startMinutes = Integer.parseInt(token1[1]);
       finishHours  = Integer.parseInt(token2[0]);
       finishMinutes = Integer.parseInt(token2[1]);
       System.out.println(new StringBuilder()
                                                        .append("Start Hours: ").append(startHours).append("\n")
                                                        .append("Start Minutes: ").append(startMinutes).append("\n")
                                                        .append("End Hours: ").append(finishHours).append("\n")
                                                        .append("End Minutes: ").append(finishMinutes) );
               
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        
        Calendar candidate = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(sdf.format(originalDate)));
         c.add(Calendar.DATE, nthweek*7);
        System.out.println(" calculation: " + sdf.format( c.getTime()));
        Calendar c1 =  Calendar.getInstance();
        c1 =(Calendar) c.clone();
        Calendar c2 =Calendar.getInstance();
        c2 =(Calendar) c.clone();
       
         c2.set(Calendar.HOUR_OF_DAY, finishHours);
        c2.set(Calendar.MINUTE, finishMinutes);
        
        c1.set(Calendar.HOUR_OF_DAY, startHours);
        c1.set(Calendar.MINUTE, startMinutes);
        
       
        Date from, to;
        from = c1.getTime();
        to = c2.getTime();
        
        candidate.setTime(sdf.parse(sdf.format(new Date())));
        System.out.println(" from: " + sdf.format(c1.getTime()));
         System.out.println("to: "+sdf.format(c2.getTime()));
          System.out.println("present: "+sdf.format(candidate.getTime()));
          
        return c1.compareTo(candidate) <=0 && c2.compareTo(candidate)>0;
    }
            
}

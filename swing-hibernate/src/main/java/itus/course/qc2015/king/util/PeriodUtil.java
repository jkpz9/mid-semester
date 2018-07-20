package itus.course.qc2015.king.util;

public class PeriodUtil {
    private static  String[] splitBySeparator(String src, String spliter){
         return src.split(spliter);
    }
    
    public static boolean isValid(String startPeriod, String finishPeriod)
    {
        String[] token1 = splitBySeparator(startPeriod, ":");
         String[] token2 = splitBySeparator(finishPeriod, ":");
         if (Integer.parseInt(token1[0])>Integer.parseInt(token2[0]))
             return false;
         else if (Integer.parseInt(token1[0]) == Integer.parseInt(token2[0]))
         {
            return Integer.parseInt(token1[1]) >  Integer.parseInt(token2[1]);
         }
         return true;
    }
   
}

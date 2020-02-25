package com.java.basics;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

public class TimeDifference {

	public static void main(String[] args) {
		
		 Calendar cal1 = Calendar.getInstance();
         cal1.setTime(new Date());
         
         Calendar cal = Calendar.getInstance();
         cal.setTime(Timestamp.valueOf("2018-10-10 10:10:10.0"));
         
         System.out.println(cal.get(Calendar.YEAR));
         Calendar cal2 = Calendar.getInstance(); 
         cal2.add(Calendar.DAY_OF_MONTH, -100);
         Long diffHours = (cal1.getTime().getTime() - cal2.getTime().getTime())/ (60*60*1000);
         System.out.println(diffHours);
         if(diffHours > 2160) {
        	 System.out.println(Calendar.getInstance().get(Calendar.YEAR));
         }


	}

}

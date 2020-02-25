package com.java.io;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Result {

    public static String findDay(int month, int day, int year) {
    	String inputDate =  month+"/"+day+"/"+year;
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    	Date date = null;
		try {
			date = format.parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String dayName = dayOfWeek(calendar.get(Calendar.DAY_OF_WEEK));
        return dayName;
    }
    public static String dayOfWeek(int dayOfWeek) {
    	String day = "";
    	switch(dayOfWeek) {
    	case 1:day = "SUNDAY";break;
    	case 2:day = "MONDAY";break;
    	case 3:day = "TUESDAY";break;
    	case 4:day = "WEDNESDAY";break;
    	case 5:day = "THURSDAY";break;
    	case 6:day = "FRIDAY";break;
    	case 7:day = "SATURDAY";break;
    	}
    	return day;
    }

}

public class CalenderProblem {
    public static void main(String[] args) throws IOException {

        String res = Result.findDay(4, 19, 2019);
        System.out.println(res);

    }
}

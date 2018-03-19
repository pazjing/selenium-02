package javaPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.Callable;

public class DatePractice {

    public static void main(String[] args) throws ParseException {

        //datePractice();
        //calendarPractice();
        //setCalendar();
        convertDate2Calendar();
        timestamp2date();

    }

    public static void datePractice() throws ParseException {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

        String dateString = "2017-01-12 10:22:30";
        Date date = sdf.parse(dateString);
        System.out.println(date);
    }

    public static void calendarPractice() throws ParseException {

        Calendar cld = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(cld.getTime()));


        Calendar cld2 = new GregorianCalendar(2016,10,31);
        System.out.println(sdf.format(cld2.getTime()));
        int year = cld2.get(Calendar.YEAR);
        int month = cld2.get(Calendar.MONTH);
        System.out.println("Year is \t\t:" + year);
        System.out.println("Month is \t\t:" + month);
        System.out.println(cld2.getTime());
    }

    public static void setCalendar() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cld3 = Calendar.getInstance();
        cld3.set(Calendar.YEAR,2015);
        cld3.set(Calendar.MONTH,Calendar.FEBRUARY);
        cld3.set(Calendar.DATE,Calendar.MONDAY);
        cld3.set(Calendar.HOUR,11);
        cld3.set(Calendar.MINUTE, 12);
        cld3.set(Calendar.SECOND,30);
        System.out.println("Cld3 is \t\t: " + sdf.format(cld3.getTime()));

        cld3.add(Calendar.MONTH, 1);
        cld3.add(Calendar.DATE,-2);
        System.out.println(sdf.format(cld3.getTime()));
    }

    public static void convertDate2Calendar() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateString = "22-01-2016 10:10:30";
        Date date1 = sdf.parse(dateString);
        Calendar cld4 = Calendar.getInstance();
        cld4.setTime(date1);
        System.out.println("convertDate2Calendar " + sdf.format(cld4.getTime()));

    }

    public static void timestamp2date() throws ParseException {

        String dateString = "2017-12-01 10:10:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = sdf.parse(dateString);

        long epoch = d.getTime();
        System.out.println("epoch is : " + epoch);

        Date d2 = new Date(1514190773);
        System.out.println("d2 : " + d2);


        long epoch2 = epoch - 5000000;
        System.out.println("subtract epoch then to : " + sdf.format(epoch2));

        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(epoch2);
        System.out.println("caldendar of epoch2 : " + sdf.format(c.getTime()));

        System.out.println("Year is :" + c.get(Calendar.YEAR));
        System.out.println("Month is :" + c.getDisplayName(Calendar.MONTH,Calendar.SHORT, Locale.ENGLISH));
        System.out.println("Day is :" + c.get(Calendar.DATE));



    }
}

package com.lun.other.date;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimePractise {
	
	public static void main(String[] args) {
		//f1();
		f5();
		
	}
	
	/**
	 * 如何取得年月日、小时分钟秒？
	 */
	public static void f1() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));    // 0 - 11
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Java 8
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
	}
	
	/**
	 * 如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
	 */
	public static void f2() {
		
		Calendar.getInstance().getTimeInMillis();
		System.currentTimeMillis();
		Clock.systemDefaultZone().millis(); // Java 8
		
	}
	
	/**
	 * 如何取得某月的最后一天？
	 */
	public static void f3() {
		Calendar time = Calendar.getInstance();
		time.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 如何格式化日期？
	 */
	public static void f4() {
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1));

        // Java 8
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));
	}
	
	/**
	 * 打印昨天的当前时刻?
	 */
	public static void f5() {
		
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
		
        //Java8
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
	}
	
}

package com.karonl.tambo;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Getweek {
	@SuppressLint("SimpleDateFormat")
	public static String getweek(){
	Calendar calendar = new GregorianCalendar(); 
	 SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    calendar.setTime(new Date()); 
    calendar.add(Calendar.DATE,-1);//��������������һ��.����������,������ǰ�ƶ� 
      Date date=calendar.getTime(); 

   dateFormatter.applyPattern("w");
   return dateFormatter.format(date);
	}

}

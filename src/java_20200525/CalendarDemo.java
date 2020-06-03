package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	//현재 시스템 시간
		
		cal.setTimeInMillis(1589168830);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	//0부터 세기 때문에 +1를 한다.
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년"+month+"월"+day+"일");
		System.out.println(hour+"시"+minute+"분"+second+"초");
	
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
	}
}

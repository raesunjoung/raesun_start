package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
 
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec= date.getSeconds();
		
		System.out.println("현재 시각은: "+hour+"시"+min+"분"+sec+"초");
		
		int year = date.getYear()+1900;
		int mon = date.getMonth()+1;
		int day = date.getDay();//요일
		
		System.out.println("오늘 날짜는: "+year+"년"+mon+"월");
		System.out.println(day+"번째 요일");
		
		

		
		
	}

}

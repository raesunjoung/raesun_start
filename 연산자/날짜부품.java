package ������;

import java.util.Date;

public class ��¥��ǰ {

	public static void main(String[] args) {
 
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec= date.getSeconds();
		
		System.out.println("���� �ð���: "+hour+"��"+min+"��"+sec+"��");
		
		int year = date.getYear()+1900;
		int mon = date.getMonth()+1;
		int day = date.getDay();//����
		
		System.out.println("���� ��¥��: "+year+"��"+mon+"��");
		System.out.println(day+"��° ����");
		
		

		
		
	}

}

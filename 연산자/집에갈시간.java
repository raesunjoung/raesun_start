package 연산자;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은 "+hour+"시");

		
		//비교 연산자의 결과는 boolean
		//true/false
		if(hour < 16){
		System.out.println("집에 갈 시간이 좀 남아있군요.");
		}else {System.out.println("집에 갈 시간이 거의 다 되었군요.");
			
		}
		
		
		
		
	}

}

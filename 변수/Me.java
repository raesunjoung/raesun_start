package 변수;

/*
 * 작성자: 정래선
 * 날짜: 2019.07.13
 * 수정내용: 반응 처리
 */
public class Me {

	public static void main(String[] args) {
	  byte age; //선언=>메모리 공간 확보
	  age = 100; //= =>할당 연산자, 대입 연산자
	  
	  int money = 10;
	  
	  double weight = 99;
	  float eye = 0.9f;
	  
	  char gender = '남';
	  String name = "정래선";
	  
	  boolean lunch = true; //false
	  //+: 결합 연산자
	  System.out.println("내 이름은 : "+name);
	  System.out.println("내 나이: "+age+"세");
	  System.out.println("내 돈은: "+money+"억원");
	  System.out.println("내 몸무게는: "+weight+"kg");
	  System.out.println("내 시력은: "+eye);
	  System.out.println("내 성별은: "+gender);
	  System.out.println("점심은 맛있게 드셨나요?: "+lunch);
	  

	}

}

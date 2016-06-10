/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :김동혁
 * @file   :Kaup.java
 * @story  :카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작 의뢰 입니다.
	 * 비만지수를 구하는 것인데요.
	 * 키와 몸무게를 입력하면 당사자가
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어 주세요.
	 * 돈은 입금했습니다.
	 * 잘을 모르는데 kaup 공식을 쓰면
	 * 된다고 하네요. 공식은 나도 몰라요
	 * 알아서 하삼.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double wei = 0.0, cm= 0.0,kaup =0.0;
		String result = "",name ;
		
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("키를 입력하세요");
		cm = scanner.nextInt();
		System.out.println("몸무게를 입력하세요.");
		wei = scanner.nextInt();
		kaup = wei / (cm/100) / (cm/100);
		
		
		if (kaup < 18.5) {
			result = "저체중";
			
		} else if (18.5<=kaup && kaup <= 22.9) {
			result = "정상체중";
			
			
		}else if (kaup >= 23.0 && kaup <= 24.9) {
			result = "위험체중";
			
		}else if (kaup >= 25.0 && kaup <= 29.9) {
			result = "비만 1단계";
			
		}else if (kaup >= 30.0 && kaup <= 39.9) {
			result = "비만 2단계";
			
		}else  {
			result = "비만 3단계";
			
			
		}
		
		System.out.println(name + "님의 bmi수치는"+ kaup +"이고, 단계는 '" + result + "' 입니다.");
		
		
		
	}

}

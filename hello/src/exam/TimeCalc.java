/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :김동혁
 * @file   :TimeCalc.java
 * @story  :초를 가지고 시간 분 초로 환산하기
 */
public class TimeCalc {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000로 나오네요.
	 * 그런데 이게 감이 잘 안와서요..
	 * 시간,분,초로 나누어서 보게 해주세요.
	 * 예를들면 50000초가 입력되면
	 * "25시간 32분15초 "이렇게 보이게 해주세요.
	 * 
	 * */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int hour=0, min = 0, sec=0, sec1=0;
			
			System.out.println("초를 입력하시오");
			sec = scanner.nextInt();
			hour = sec/3600;
			min =  sec% 3600 / 60;
			sec1 = sec % 3600 % 60;
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println(hour+"시간"+ min+"분"+ sec1+"초");
			
			
	}

}

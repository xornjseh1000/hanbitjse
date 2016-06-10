/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :김동혁
 * @file   :Kaup2.java
 * @story  : 카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	/**
	 * 개발자님 BMI 지수가 너무 길어요.
	 * 소수점 이하 2자리에서 끊어주세요.
	 * */
	
	public static void main(String[] args) {
		//------------------init-----------------------------
		Scanner scanner = new Scanner(System.in);
		String name="", result="";
		double bmi = 0.0, height = 0.0, weight=0.0;
		//------------------op------------------------------
		System.out.println("이름 ?");
		name = scanner.next();
		System.out.println("키 ?");
		height = scanner.nextDouble();
		System.out.println("몸무게 ?");
		weight = scanner.nextDouble();
		
		bmi = weight / (height/100) / (height/100);
		
		if (bmi < 18.5) {
			result = "저체중";
		} else if(18.5<=bmi && bmi <= 22.9){
			
			result = "정상체중";
		} else if(bmi >= 23.0 && bmi <= 24.9){
			
			result = "위험체중";
		} else if(bmi >= 25.0 && bmi <= 29.9){
			
			result = "비만 1단계";
		} else if(bmi >= 30.0 && bmi <= 39.9){
			
			result = "비만 2단계";
		} else if(bmi >= 40){
			
			result = "비만 3단계";
		}

		double d = Double.parseDouble(String.format("%.2f", bmi));
		System.out.println(name+"은 BMI지수는 "+Double.parseDouble(String.format("%.2f", bmi)) +
				"이고, "+result+"이다 ");
		
	}

}

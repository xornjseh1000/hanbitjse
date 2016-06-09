/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :김동혁
 * @file :IfEx.java
 * @story :Branch 구문 예제
 */
public class IfEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수갑을 입력하세요");
		int input = scanner.nextInt();
		if (input==10) {
			System.out.println("입력된 정수값" + input + "이 10 입니다");
		} else {
			System.out.println("입력된 정수값" + input + "이 10 이 아닙니다");

		}
		
	}

}

package user;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :김동혁
 * @file   :VarEx3.java
 * @story  :int 곱하기 예제
 */
public class VarEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0, z = 0;
		System.out.println("정수 x : [ ]");
		x = scanner.nextInt();
		System.out.println("정수 y : [ ]");
		y = scanner.nextInt();
		z = x * y;
		System.out.println("x * y =" + z);

	}

}

package user;

import java.util.Scanner;

public class VarEx7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0, d = 0, b = 0, z = 0;
		System.out.println("정수 x = [ ]");
		x = scanner.nextInt();
		System.out.println("정수 y = [ ]");
		y = scanner.nextInt();
		System.out.println("정수 d = [ ]");
		d = scanner.nextInt();
		System.out.println("정수 b = [ ]");
		b = scanner.nextInt();
		z = x + y + d + b;
		System.out.println("x + y + d + b =" + z);

	}

}
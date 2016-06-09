/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :김동혁
 * @file :Tax.java
 * @story : 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 연봉을 입력받아서 연봉 ***만원을 받으시는 XXX님께서 납부할세금은
 *        ???만원입니다. 로 출력하는 프로그램을 만들어 주세요. 단) 세율이 정책이 바뀔 때 마다 변하니, 관리자가 쉽게
 *        적용가능하도록 만들어 주세요. 현재는 세율이 9.7프로인데, 만약 세율이 바뀌면 바뀐 세율을 적용바랍니다. 이름은 String
 *        name = _____(); 연봉은 int sal, 세금은 int money, 세율은 double tax = 0.097
 */
public class Tax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int sal = 0, money = 0, change=0;
		double tax = 0.0;

		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("연봉을 입력하세요");
		sal = scanner.nextInt();
		System.out.println("세율이 바뀌었습니까?" + "그대로이면 1, 바뀌었으면 2를 입력하세요");
		
		change = scanner.nextInt();
		if (change == 1) {
			tax = 0.097;
			

		} else {
			System.out.println("그럼, 바뀐세율을 입력바랍니다");
			
			tax = scanner.nextDouble();
			

		}
		money = (int) (sal * tax);
		System.out.println("연봉" + sal + "만원을 받으시는" + name + 
				"님께서 납부할세금은 " + money + "만원입니다.");

	}

}

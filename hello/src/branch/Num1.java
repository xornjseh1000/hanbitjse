/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :김동혁
 * @file   :Num1.java
 * @story  :
 */
public class Num1 {
	/**
	 * 저희 반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점 사이 입니다.
	 * 3명의 평균 점수를 입력하면 
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.
	 * 단 , 학생이름은 스캐너로 입력받습니다. if문
	 * 홍길동
	 * 49
	 * .
	 * .
	 * .
	 * ======
	 * 1등 김구 96점
	 * .
	 * .
	 * .
	 * ======
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int avg1 = 0, avg2 = 0, avg3=0;
		String name1="",name2 ="", name3="";
		
		System.out.println("이름을 입력하시오");
		name1 = scanner.nextLine();
		System.out.println("평균을 입력하시오");
		avg1 = scanner.nextInt();
		System.out.println("이름을 입력하시오");
		name2 = scanner.nextLine();
		System.out.println("평균을 입력하시오");
		avg2 = scanner.nextInt();
		System.out.println("이름을 입력하시오");
		name3 = scanner.nextLine();
		System.out.println("평균을 입력하시오");
		avg3 = scanner.nextInt();
		
		if (avg1 > avg2 && avg1 > avg3) {
			System.out.println("1등 홍길동");
		} else if(avg2 > avg3 && avg2 > avg1){
			System.out.println("1등 김유신");
		} else if(avg3 > avg1 && avg3 > avg1);
		
		
	}
}

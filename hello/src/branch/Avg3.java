/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :김동혁
 * @file   :Avg.java
 * @story  :
 */
public class Avg3 {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서()
	 * [홍길동 : 총점 ***점, 평균***점,학점 : ??]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 90점 이상 A
	 * 80점이상이면 B
	 * 70점이상이면 C
	 * 60점이상이면 D
	 * 50점이상이면 E
	 * 50점 미만이면 F학점입니다라고 
	 * 출력되게 해주세요.
	 * [단] switch-case 문으로 해결하세요.
	 **/
	public static void main(String[] args) {
		//------------------변수 선언부, 준비 , 초기화(init) ------------------
		Scanner scanner = new Scanner(System.in);
		String name, result = "";
		int kor = 0, eng = 0, mat = 0, total = 0,avg = 0 ;
		//------------------연산부 (알고리즘) ----------------------------------
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		if (kor > 100 || kor < 0){
			System.out.println("0이상 100이하 값을 입력하세요");
			return;
		}
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		if (eng > 100 || eng < 0){
			System.out.println("0이상 100이하 값을 입력하세요");
			return;
		}
		System.out.println("수학점수를 입력하세요");
		mat = scanner.nextInt();
		if (mat > 100 || mat < 0){
			System.out.println("0이상 100이하 값을 입력하세요");
			return;
		}
		total = kor + eng + mat;
		avg = total / 3;
		
		switch (avg/10) {
		case 9:
			 result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		case 5:
			result = "E";
			break;
			
			
		default:
			result = "F";
			break;
		}
		
		
		
		
		


		
		
		//------------------출력부 ( 콘솔) ---------------------------------------
		System.out.println("[" + name + " : 총점 " + total + "점, 평균" 
				+ avg + "점"+ "학점 :( "+ result + "학점 입니다)]");
	}
}
	
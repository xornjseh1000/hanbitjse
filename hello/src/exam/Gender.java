/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :김동혁
 * @file   :Gender.java
 * @story  :
 */
public class Gender {
	/**
	 * 개발자님 저희 사이트는 주민번호 앞자리와 성별 판별번호만
	 * 입력합니다.
	 * 예를들어 800101-1까지만 입력하면
	 * 소비자가 자신이 남자인지 밝히지 않아도
	 * 자동으로 DB에 저장되는 시스템을 개발해주세요.
	 * [출력문] 홍길동(남), 아이유(여)
	 * */
	/*1,2 : 국내 1900년대생 남,녀
	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "",gen="",num="";
		
		
		System.out.println("이름을 입력하세요:");
		name = scanner.next();
		System.out.println("주민번호 뒷번호 첫번째짜리까지 입력하세요.(- 표시하세요)");
		num = scanner.next();
		char c = num.charAt(7);
		if (c=='0' || c=='9') {
			System.out.println("0 이나 9는 입력불가");
			return;
			 
		}
		
		switch (c) {
		case '1': case'3': case'5': case'7':
			gen = "남";
			break;
		
		
			
		default:gen ="여";
			break;
		}
		
		
		System.out.println(name+"("+gen+")");
		
	}

}

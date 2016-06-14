/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :김동혁
 * @file   :ArrAssign.java
 * @story  :
 */
public class ArrAssign2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**
		 * 전교생이 몇명인지 몰라교 
		 * 전교생 수를 입력받고
		 * 학생의 이름과 나이를 
		 * 입력받고, 이것을 출력하세요.
		 * */
		int i = 0, j=0;
		System.out.println("학생 수가 몇명입니까 ?");
		j=scanner.nextInt();
		int[] num = new int[j];
		String[]name = new String[j];
		int[]age = new int[j];
		
		for (; i < age.length; i++) {
			
			System.out.println("학번과 이름과 나이를 입력하시요.");
			num[i]=scanner.nextInt();
			name[i]=scanner.nextLine();
			age[i]=scanner.nextInt();
			
			
		}
		System.out.print("==========================\n");
		System.out.print("학번 | 이름 | 나이 ");
		System.out.print("==========================\n");
		for (i =0; i < age.length; i++) {
			System.out.printf("%s\t%s\t%d\n",num[i],name[i],age[i]);
		}
		
	}
	
}

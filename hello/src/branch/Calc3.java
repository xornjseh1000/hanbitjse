/**
 *
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :김동혁
 * @file :Calc.java
 * @stornum2 :
 */
public class Calc3 {
       /*
       * 두 개의 정수를 입력 받아서 count 값이 1이면 덧셈 2이면 뺄셈, 3이면 곱셈, 4이면 나눗셈(몫), 5이면 나머지 구하는
       * 계산기
       */
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String symbol="",count = ""; 
            int  num1 = 0, num2 = 0, numResult = 0;
            System.out.println( "정수 한개를 입력하시오" );
             num1 = scanner.nextInt();
            System.out.println("연산자 :");
             count = scanner.next();
            System. out.println( "정수 한개 더 입력하시오" );
             num2 = scanner.nextInt();
             switch (count) {
			case "+":
				 symbol = "+"  ;
            	 numResult = num1 + num2;
				break;
			
			case "-":
				 symbol = "-"  ;
            	 numResult = num1 - num2;
				break;
			
			case "*":
				 symbol = "*"  ;
            	 numResult = num1 * num2;
				break;
			
			case "/":
				 symbol = "/,"  ;
            	 numResult = num1 / num2;
				break;
			
			case "%":
				 symbol = "%,"  ;
            	 numResult = num1 % num2;
				break;

			
			
			default: 
				System.out.println("연산자를 입력하시오.");
				return;
			}
             System.out.println(num1 + count + num2 + "=" + numResult + "입니다");
       }
}
           


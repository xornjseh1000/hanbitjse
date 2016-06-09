/**
 *
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :김동혁
 * @file :Calc.java
 * @story :
 */
public class Calc {
       /*
       * 두 개의 정수를 입력 받아서 opcode 값이 1이면 덧셈 2이면 뺄셈, 3이면 곱셈, 4이면 나눗셈(몫), 5이면 나머지 구하는
       * 계산기
       */
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             int opcode = 0, x = 0, y = 0, z = 0;
            System. out.println( "정수 한개를 입력하시오" );
             x = scanner.nextInt();
            System. out.println( "정수 한개 더 입력하시오" );
             y = scanner.nextInt();

             if (opcode == 1) {
                   z = x + y;

            } else if (opcode == 2) {
                   z = x - y;
            } else if (opcode == 3) {
                   z = x * y;

            } else if (opcode == 4) {
                   z = x / y;

            } else {
                   z = x % y;
            }

            System. out.println( "결과값은 " + z + "입니다");

      }
}


/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13. 
 * @author :pakjkwan@gmail.com
 * @file   :ForLoopEx.java
 * @story  :3의배수를 제외한 1부터 10까지 급수는?
 *    (단,공차는 1)
*/
public class ForLoopEx4 {
	public static void main(String[] args) {
		int i=0,Sum=0;
		for (i = 0; i <= 10; i++) {
			
			if (i%3!=0) {
				Sum += i;
			
		}
		
	}System.out.printf("합=%d",Sum);
	}
}


/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 14.
 * @author :김동혁
 * @file   :ForLoopEx6.java
 * @story  :inti=0, limit=10, diff=2 인 reverse sequences
 */
public class ForLoopEx6 {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i-=2) {
			System.out.printf("%d\t",i);
		}
	}
}

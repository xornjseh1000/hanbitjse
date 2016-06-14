  
  package branch;

import java.util.Scanner;

  /**
   * @date   :2016. 6. 9. 
* @author :pakjkwan@gmail.com
@@ -32,7 +34,72 @@
	 * ==============
	 * */
public class Num1_2 {	
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score0=0,score1=0,score2=0;
		int i = 0;
		int[]avg = new int[3];
		//avg[0]=0; avg[1]=0; avg[2]=0;
		int[]score = new int[3];
		//score[0]=0; score[1]=0; score[2]=0;
		String[] name = new String[3];
		//name[0]=""; name[1]=""; name[2]="";
		String[] grade = new String[3];
		//grade[0]=""; 
		
	
		
		
		
		
		for (; i < avg.length; i++) {
			System.out.println("이름,점수 입력");
			name[i]=scanner.next();
			avg[i]=scanner.nextInt();
		}
		
		
		
		
		if (avg[0]>avg[1]&&avg[1]>avg[2]) {
			grade[0]=name[0];
			grade[1]=name[1];
			grade[2]=name[2];
			score0=avg[0];
			score1=avg[1];
			score2=avg[2];
		} else if(avg[0]>avg[1]&&avg[2]>avg[1]){
			grade[0]=name[0];
			grade[1]=name[2];
			grade[2]=name[1];
			score0=avg[0];
			score1=avg[2];
			score2=avg[1];
		}else if(avg[1]>avg[0]&&avg[0]>avg[2])
			{
		grade[0]=name[1];
		grade[1]=name[0];
		grade[2]=name[2];
		score0=avg[1];
		score1=avg[0];
		score2=avg[2];}
		else if(avg[1]>avg[0]&&avg[2]>avg[0]){
			
		
		grade[0]=name[1];
		grade[1]=name[2];
		grade[2]=name[0];
		score0=avg[1];
		score1=avg[2];
		score2=avg[0];
		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
			grade[0]=name[2];
			grade[1]=name[0];
			grade[2]=name[1];
			score0=avg[2];
			score1=avg[0];
			score2=avg[1];
		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
			grade[0]=name[2];
			grade[1]=name[0];
			grade[2]=name[1];
			score0=avg[2];
			score1=avg[0];
			score2=avg[1];}
		
			{
		
				System.out.println("1등+"+grade[0]+"점수는"+score0 );
				System.out.println("2등+"+grade[1]+"점수는"+score1 );
				System.out.println("3등+"+grade[2]+"점수는"+score2 );
 			}
  	}
 
	}
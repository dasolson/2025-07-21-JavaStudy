/*
 *     점수를 입력 => 0~100사이
 *      = 60점 이상이면 합격
 *      = 60점 이하면 불합격
 *      
 *      if(score>=60)
 *       합겹
 *      if(score<60)
 *       불합격 
 */
import java.util.Scanner;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력:");
		int i=scan.nextInt();
		
		if(i>=60)
			System.out.println(i+"합격입니다");
		if(i<60)
			System.out.println(i+"불합격입니다");
		
		
		

	}

}

/*
 *   사용자로부터 세개의 정수를 입력받아, 그 수들의 최대값과 최소값. 합계와 평균을 구해보자
 */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println(a+","+b+","+c);

		System.out.printf("합계%d\n", a+b+c);
		System.out.printf("평균:%.2f\n",(a+b+c)/30.0);
		
		int max=a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		
		int min=a;
		if(min<b) {
			min=b;
		}
		if(min<c) {
			min=c;
		}
		
		System.out.printf("최대값:",+max);
		System.out.printf("최소값:",+max);
		
		//다음에 사용 => 변수
		//출력 =>변수x
			
		

		

	}

}

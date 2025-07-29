/*
 *     => UpDown game
 *     => 난수 => 1~100사이
 *     => 사용자 입력
 *       => 힌트 Up/Down
 *     ------------------
 *      무한루프(맞출때까지)  
 *
 */
import java.util.Scanner;
/*
 *     반복문 => 제어 => 반복제어문
 *     1. 반복문 종료
 *         => break
 *     2. 특정부분을 제외
 *         => continue
 *         
 *      for(int i=1;i<=10;i++ {
 *         if(i==5)
 *         break;
 *         System.out.println(i);
 *      }  //1 2 3 4
 *      
 *      for(int i=1;i<=10;i++ {
 *         
 *         System.out.println(i);
 *         if(i==5)
 *         break;
 *      } 1 2 3 4 5 
 *      
 *      for(int i=1;i<=10;i++ {
 *         if(i==5)
 *         continue;
 *         System.out.println(i);
 *      } // 1 2 3 4 6 7 8 9 10  => 5를 제외
 *
 *           
 */
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("=====for=====");
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+" ");
//		}
//		System.out.println("\n===== break =====");
//		for(int i=1;i<=10;i++) {
//			if(i==5) break;
//			System.out.println(i+" ");
//		}
//        System.out.println("===== continue =====");
//        for(int i=1;i<=10;i++) {
//			if(i==5) continue;
//			System.out.println(i+" ");
//		}
		Scanner scan=new Scanner(System.in);
		// 1. 컴퓨터에서 난수 발생
		int com=(int)(Math.random()*100)+1; //1~100
		int count=0;
		for(;;) //무조건 => 무한루프
		{
			// 2.사용자 입력값 받기
			System.out.println("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			// 입력이 잘못된 경우 => continue
			// 정답 => 종료 => break
			// 게임 => 횟수 지정을 하지 않는다
			// 자동화
			if(user<1 || user>100) {
				System.err.println("1~100까지 정수만 사용이 가능합니다");
				// 처음으로 돌아간다
				continue;
				/*
				 *    continue(for에서 주로 사용)
				 *    for ======> 증가식 (for에서 주로 사용)
				 *    while ====> 조건식
				 *    
				 *    => continue는 반드시 반복에서만 사용이 가능
				 *    => if, switch에서는 사용이 불가
				 *    => break
				 *       => if 사용이 불가
				 *       => 반복문, switch에서 사용 가능
				 */
			}
			count++; // 정상입력시에만 count증가
			// 경우의 수 => if
			/*
			 *   1. com > user
			 *   2. com < user
			 *   3. com == user
			 */
			if(com>user) {
				System.out.println("입력값보다 큰 정수를 입력하세요");
			}
			else if(com<user) {
				System.out.println("입력값보다 작은 정수를 입력하세요");
			}
			else {
				System.err.println("Game Over");
				System.out.println("입력횟수:"+count);
				break;
			}
		}
	}

}

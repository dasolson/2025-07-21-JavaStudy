// 10qjs => 가위 바위 보 5승 1무 4패
import java.util.Scanner;
/*
 *     com 0 가위       com - user
 *      user 0 가위          0
 *      user 1 바위          -1      user
 *      user 2 보           -2      com
 *     com 1 바위
 *      user 0 가위          1       com
 *      user 1 바위          0
 *      user 2 보           -1       user
 *     com 2 보
 *      user 0 가위          2         user
 *      user 1 바위          1
 *      user 2 보           0
 */
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1; i<=10; i++) {
		    // 1. computer => 난수
			int com=(int)(Math.random()*3);
			// 2. 사용자 입력
			System.out.print("가위(0), 바위(2), 보(2):");
			int user=scan.nextInt();
			
			// 오류 처리 => continue => 재실행
			if(user<0 || user>2) {
				System.err.println("가위바위보를 입력해야됩니다");
				i--;
				continue; //i++
			}
			// 정상 입력이 된 상테
			int res=com-user;
			if(res==-2 || res==1) {
				lose++;
				System.out.println("컴퓨터 win");
			}
			else if(res==2 || res ==-1) {
				win++;
				System.out.println("플레이어 win");
			}
			else {
				same++;
				System.out.println("비겼다");
			}
			
			// 3. 승 / 무 / 패
		}
		System.out.println("====결과값====");
		System.out.printf("%d승 %d무 %d패\n", win, same, lose);
		
		
		// 모든 프로그램 => 가정
		// 게임 => 숫자로 가정
		

	}

}

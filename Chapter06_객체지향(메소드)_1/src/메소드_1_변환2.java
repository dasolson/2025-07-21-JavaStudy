import java.util.Scanner;
public class 메소드_1_변환2 {
	// 난수
	/*
	 *    사용자 입력
	 *    비교
	 *    종료
	 */
    static int[] com=new int[3];
    static int[] user=new int[3];
    static int s,b;
    // 전역변수 => 프로그램 종료시까지 유지
    // 리턴형, 매개변수 신경안써도 됨
    /*
     *     class 역역 => 전역변수  => 클래스 안에 있는 모든 메소드에서 사용 가능
     *                  매소드에서 공통으로 사용되는 변수
     *    -----------------------
     *    |메소드 영역  => 지역변수  |
     *    |메소드 괄호안에 => 매개변수|
     *    ----------------------- 스택 => 메소드 종료시 메모리 회수
     */
    static void rand() {
    	// 자동삭제
    	for(int i = 0; i < com.length; i++) {
    		com[i]=(int)(Math.random()*9)+1;
    		for(int j = 0; j < i; j++) {
    			if(com[j]==com[i]) {
    				i--;
    				break;
    			}
    		}
    	}
    }
    
    static void userInput() {
    	Scanner scan=new Scanner(System.in);
    	while(true) {
    		// 사용자 입력 시작
    		System.out.print("세자리 정수 입력:");
    		int input=scan.nextInt();
    		// 오류 처리 => 입력이 잘 못 됐을때
    		/*
    		 *  1. 세자리가 아닐때
    		 *  2. 중복된 수 입력
    		 *  3. 0을 입력한 경우
    		 */
    		if(input < 100 || input > 999) {
    			System.out.println("❌ 잘 못 된 입력입니다");
    			// 다시 처음부터 입력 => while의 조건식 이동
    			continue;
    		}
    		user[0]=input / 100;
    		user[1]=(input % 100) / 10;
    		user[2]=input % 10;
    		
    		if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
    			System.out.println("❌ 중복된 수는 사용 할 수 없습니다");
    			continue;
    		}
    		
    		if(user[0]==0 || user[1]==0 | user[2]==0) {
    			System.out.println("❌ 0은 사용 할 수 없습니다");
    			continue;
    		}
    		break;
	    }
    }
    
    static void compare() {
        s=0;
        b=0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(com[i]==user[j]) {
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		
		// 힌트
		System.out.printf("Input Number: %d%d%d, Result:%ds-%dB\n", user[0], user[1], user[2],s,b);
    }
    
    static boolean isEnd() {
    	boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
    }
    
    static void process() {
    	rand();
		Scanner scan=new Scanner(System.in);
		while(true) {
			userInput();
			compare();
			if(isEnd()) {
				System.out.println("🎉 축하합니다!!");
				System.out.print("게임을 다시할까요?(y/Y):");
				char c=scan.next().charAt(0);
				if(c=='y' || c=='Y') {
					System.out.println("새 게임을 시작합니다");
					process();  // 재귀호출
					// 자신의 메소드를 호출
					
				}
				else {
					System.out.println("Game Over");
					System.exit(0);
				}
			}
			
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		

	}

}

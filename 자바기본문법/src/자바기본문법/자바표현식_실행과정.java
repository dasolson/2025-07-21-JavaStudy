package 자바기본문법;
/*
 *    숫자
 *     = 정수
 *       = 2진법  => 1000 => 0b1111
 *                         --
 *       = 8진법  => 111 => 0111
 *                        --
 *       = 10진법 => 1000, 345..
 *       = 16진법 => 0x111
 *                 --
 *       = 21억 4천 정도 까지 인식
 *         => 이상 넘어갈 경우 : ~L(1)            
 *     = 실수
 *       = 10.5, 100.23...
 *    문자
 *     = 문자 한개 저장
 *       'A', '홍', '심'... => 자바는 모든 국가 언어 사용 가능 (C 언어는 불가능)
 *       => Unicode : 한글자 2바이트 => 멀티바이트
 *    문자열
 *     = 문자 여러개 저장
 *       "홍길동"
 *    논리형
 *     = true / false
 *    특수문자
 *     = \t => tab 일정 간격
 *     = \n => new line = 줄바꿈
 *     = \" => " 출력
 *     = \\ => \ 출력 => 경로명
 *     
 *   실행 과정
 *   --------
 *   프로그램 구동
 *   ----------
 *   컴파일 방식 : Java / C# / C, C++ => 컴퓨터가 인식하는 언어로 변경
 *   인터프린터 방식 : 한 줄씩 읽어서 출력
 *                 HTML / JavaScript / Python
 *                  javac
 *                  컴파일
 *   A.java ================> 컴퓨터 인식 언어로 변경 
 *   원시소스                    ㅣ 010101010
 *    ㅣ 프로그래머만 알고 있는 언어     010100010
 *                                   ㅣ
 *                                   A.class (바이트 코드)
 *                                      ㅣ
 *                                      ㅣjava (인터프린터)
 *                                      한 줄씩 읽어서 출력
 *   => 문법에러 : 컴파일 에러
 *   => 실행시 에러 : 인터프린터 에러 
 *   ------------------------------------------------------------
 *                                    
 *                                      
 *                                      
 *   C/C++ : 저급언어 => 하드웨어
 *   Python : 고급언어 => 소프트웨어
 *   Java : 고급언어 => 소프트웨어
 *   코볼 / 포트란 : 고급언어 => 소프트웨어
 *   ----나누는 기준 하드웨어 / 소프트웨어                                 
 *                                  
 *     
 */
public class 자바표현식_실행과정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(0b1000);
        System.out.println(0111);
        System.out.println(0x111);
        System.out.println(2500000000L);
        System.out.println(10.5);
        System.out.println('홍');
        System.out.println('길');
        System.out.println('동');
        System.out.println("홍길동");
        System.out.println(true);
        System.out.println(false);
        System.out.print("Hello\tJava!!");
        System.out.print("\nHello Java!!\n");
        System.out.println("\"홍길동\"");
        System.out.println("C:\\javaDev\\javaStudy\\자바기본문법\\src\\자바기본문법\\자바표현식_실행과정.java");
	}

}

/*
 *   1. 연산자 (목표) = 단항연산자 / 이항연산자 (산술연산자)
 *      1) 기본 : 변수 / 연산 / 제어문
 *      2) 데이터를 묶어서 사용
 *         -----------
 *          같은 데이터 : 배열
 *       ***다른 데이터 : 객체
 *      3) 관련된 명령문 : 기능
 *         예) 게시판 => 목록출력 / 글쓰기 / 상세보기 / 수정 / 삭제
 *           => 기능 (메소드)
 *           => 재사용이 가능
 *           => 기능추가 => 예) 답변 / 수정 => 목록 (이미지)
 *              오버로딩 - 기능추가(new) / 오버라이딩 - 수정
 *   
 *   2025-07-22 정리
 *   --------------
 *   1. 자바실행 과정
 *      => 클래스명과 파일 저장명 동일 (대소문자 구분)
 *       예) class MainClass => mainClass.java  (x)
 *                ---------    ---------
 *                    ㅣ            ㅣ
 *                    -------------- 일치
 *        - 이클립스 사용 안하고 Editplus / 울투라Edit 쓰는 경우 있음
 *      => A.java ============= A.class =============== 실핼
 *          원시소스             바이트코드(0,1)
 *                     ㅣ                      ㅣ
 *                   javac                   java
 *                    컴파일                  인터프린터
 *               (컴퓨터언어로 변경)          (한 줄씩 읽어서 출력)
 *                     ㅣ                      ㅣ
 *                  컴파일 영역                 실행시
 *                  --------문법에서 에러        ---- 입력값
 *                  => 프로그래머 실수            => 사용자 실수   
 *      => 프로그램 개발 => 다시 사용해야하는 데이터
 *                      ------------------ 메모리에 저장 (변수)
 *        **변수 : 한개의 데이터만 저장하는 메모리 공간의 이름
 *                                  ----- 주소값
 *          변수 사용
 *          ------- 메모리 크기 결정
 *                  --------  데이터형 / 자료형
 *          정수 
 *           = byte (-128~127) => 8bit => 1byte
 *           = int  (-21억4천7백~21억4천7백) => 32bit => 4byte
 *             --- 기본 : 컴퓨터는 모든 숫자를 int로 인식한다
 *           = long => 64bit => 8byte
 *          실수 
 *           = double => 8byte => 소수점 15자리
 *             ------ 기본
 *          문자
 *           = 문자 한개만 저장 => 0~65535 (각국 언어 사용 가능)
 *             char => 표현식 ''
 *          논리
 *           = 제어문 / 연산자 (비교연산자, 부정연산자, 논리연산자)
 *             ---- 조건문, 반복문
 *             boolean => true / false
 *          문자열                                    
 *           = String : 일반 데이터형 / 참조 데이터형
 *            ------- 기능 
 *   ------------------------------------------------------------------
 *     변수 선언 : 변수는 반드시 초기값을 첨부
 *     --- 변경이 가능 / 상수는 변경이 불가능
 *         데이터형 변수, final 데이터형 : 변수
 *                    ------ final 없으면 상수
 *      1. 선언
 *         값 저장
 *         데이터형 변수;
 *         변수 = 값
 *      2. 선언과 동시에 값을 부여        
 *         데이터형 변수명 = 값
 *                       -- 리터럴 (지정된 값을 부르는 말)
 *         int a=10                   
 *               --리터럴
 *             -- 변수명
 *         --- 데이터형
 *   --------------------------------------------------------------------
 *     정수 표현법
 *        => 10,20...(10진법)
 *        => 0b11100, 0B (2진법)
 *        => 0123... (8진법)
 *        => 0x, 0X (16진법
 *     문자 표현법
 *        'A', '홍'
 *     문자열 표현법
 *        "ABC..."
 *        문장이 길어질 경우
 *        """ABC..."""
 *  ----------------------------------형변환 / 문자열 => 60p 
 *  
 *    형변환
 *      자동 형변환
 *       = 변수에 값대입
 *         int a='A'
 *               ---char => int (65)
 *         byte < char < int < long < double
 *         char c=65
 *                -- int => char ('A')
 *         double d=10
 *                  --
 *                  int => double (10.0)
 *         int a=d; => 오류
 *         ---
 *         크거나 같아야 한다
 *              --- 유지
 *         --- 형변환                     
 *       = 연산처리 (데이터형이 동일 => 연산)
 *        => 큰데이터형으로 변경후에 처리
 *         int + int => int
 *         long + int => long
 *                --- 자동으로 long으로 변환
 *         예) 10 + 'A'
 *            int  char
 *                 ----
 *                 65
 *            -----------> 75
 *         double + long + int + char = double
 *         -------------
 *            double
 *            ----------------
 *                 double
 *                 ------------------
 *                       double
 *         char + char = int => 'A' + 'B' =131
 *                               65    66
 *         byte + byte = int
 *         char + byte = int
 *         ***int이하 데이터 (byte, char, short)
 *                         ------------------- 연산처리 => int  
 *         * 결과값 int => int / long / float / double
 *           결과값 long => long / float / double
 *           결과값 float => float / double
 *                                                     
 *      강제 형변환 : 많이 나온다
 *                 -------- 연산처리x / 객체에서 많이 나옴
 *                 예)        인간
 *                           ----
 *                          ㅣ    ㅣ
 *                         남자   여자
 *                         
 *                        인간 a=남자 - o => is-a
 *                        남자 a=인간 - x  => 남자 a=(남자)인간 - o
 *        => 강제형변환 사용
 *           (데이터형)값
 *           -------
 *           ㅣ=> 큰데이터형 변경  => UpCasting
 *           ㅣ=> 작은데이터형 변경 => DownCasting
 *           
 *           예) (double)10 => 10.0
 *              (int)'A' => 65     
 *              -------------------UpCasting
 *              (char)65 => 'A'
 *              (int)10.5 => 10
 *              -------------------DownCasting
 *              **boolean은 변환이 안된다 (87p)
 *        
 *              String : 모든 데이터형을 문자열로 변환 가능
 *              int => String => int
 *              -------------
 *              String.valueof(10) =>"10"
 *                                    Integer.parseIni("10") => 10
 *              long => String => long
 *              String.valueof(10L) =>"10"
 *                                     Long.parseLong("10") => 10L
 *              double => String => double
 *              String.valueof(10.5) =>"10.5"
 *                                      Double.parseDouble("10.5") => 10.5
 *              boolean => String => boolean
 *              String.valueof(true) =>"true"
 *                                      Boolean.parseBoolean("true") => true
 *              
 *              => 각데이터형을 쉽게 사용 할 수 있게
 *              클래스화 => Wrapper
 *              int => Integer
 *              long => Long
 *              double => Double
 *              boolean => Boolean
 *         
 *    ** 윈도우 개발 / 웹 개발 => 데이터는 String    
 *       ---------------------------------
 *       <input type="text">
 *       JTextFiled       
 *       ---------------------------------
 *       
 *    입출력 (69p)
 *     System.our.printIn() : 가장 많이 사용
 *     ---------------------> 웹 => 입력값 확인, 오류 메세지 출력
 *     사용을 하면 => 줄바꿈
 *     System.our.print() : 문법 사항 => 줄바꿈x
 *                          가로 출력 => 한명에 대한 데이터 출력
 *     System.our.printf() : 출력 서식을 만들어서 출력
 *     -------------------> C언어에서 주로 사용
 *     printf("서식",값...)
 *             ---
 *             정수값 : %d
 *                    --- 정렬
 *                    왼쪽 / 오른쪽
 *                    %-3d   %3d
 *                    예) 90 출력하고자 할때
 *                        %-5d
 *                        90    5칸중 앞에서부터 출력
 *                        -----
 *              실수값 : %f
 *                     %.2f
 *                     %.3f
 *                     $.1f  소수점 갯수  
 *              문자 : %c
 *              문자열 : %s   
 *              ***특수문자
 *              \n : 줄바꿈
 *              \t : 일정간격
 *              -------------
 *              \" : "출력 => html 전송시에 주로 사용, Mybatis
 *              \\ : \출력 => 경로가져올때 많이 등장
 *                          
 *     --------------------
 *     Scanner 
 *     ------- 클래스화 => 키보드 입력값
 *     Scanner scan = new Scanner(System.in)
 *     ------- ----   ---         --------- 키보드 입력값
 *              변수   저장
 *     사용자 정의 데이터형
 *     
 *     1. 정수  => scan.nextInt()
 *     2. 실수  => scan.nextDouble()
 *     3. 논리  => scan.nextBoolean()
 *     4. 문자열 => scan.next()
 *      
 *     입력 : 공백 => 메모리에 저장 => 엔터
 *       
 *                            
 *                                             
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
/*
 *  class Scanner
 *  {
 *  }
 *  
 *  => include<stdio.h>  - C언어
 *  => using - 
 *  => import - java
 */
public class 자동형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		자동형변환 aa=new 자동형변환();
		자동형변환 b=new 자동형변환();
		System.out.println(aa);
		System.out.println(b);
		
        double d=10; //10.0 자동형변환
        System.out.println(d);
        int a=(int)d; // 강제형변환
        System.out.println(a);
        byte b1=10;
        byte b2=20;
        int b3=b1+b2;
        // byte = int, long, double, float
        System.out.printf("%-3d%-3d%-3d\n",10,20,30);
        System.out.printf("%f\n",10/3.0);
        System.out.printf("%.2f\n",10/3.0);
        System.out.printf("%.1f\n",10/3.0);
        System.out.printf("%02d\n",12);
        System.out.printf("%c\n",'A');
        System.out.printf("%s\n","홍길동");
        System.out.println(10+" "+20+" "+30+" ");
        
              //Ctrl + shift + / : 블록을 주석으로 처리 (/* */)
              //Ctrl + shift + "\" : 블록 주석 해제
              //Ctrl + / : 한줄 or 블록 주석 처리 / 해제(//)
        
        //Scanner scan=new Scanner(System.in);
//        Scanner scan=new Scanner(System.in);
//        System.out.print("국어 점수:");
//        int kor=scan.nextInt();
//        System.out.print("영어 점수:");
//        int eng=scan.nextInt();
//        System.out.print("수학 점수:");
//        int math=scan.nextInt();
//        System.out.print("국어 영어 수학입력(90 90 90):");
//        int kor=scan.nextInt();
//        int eng=scan.nextInt();
//        int math=scan.nextInt();
//        System.out.printf("%3d%3d%3d",kor,eng,math);
//        System.out.println("문자열 입력:");
//        String msg=scan.nextLine(); //공백 포함
//        System.out.println(msg);
        System.out.print("true/false입력:");
        boolean b=scan.nextBoolean();
        System.out.println(b);
        System.out.print("실수 입력:");
        double d=scan.nextDouble();
        System.out.println(d);
        
	}


}

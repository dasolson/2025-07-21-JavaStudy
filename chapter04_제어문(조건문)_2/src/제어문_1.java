/*
 *     1. 식별자
 *         = 알파벳, 한글로 시작한다 ( 알파벳은 대소문자 구분)
 *         = 숫자 사용 가능 ( 앞에 사용 금지)
 *         = 키워드 사용 불가 (빨간색글씨)
 *           ---- 자바에서 사용되는 단어
 *         = 공백 불가
 *         = 특수문자 (_. $)
 *       ------------------------------------------
 *        변수 / 상수
 *        클래스 / 인터페이스
 *        메소드
 *        
 *        => 구분(약속)
 *           1. 변수는 소문자 시작 (두개이상 단어)
 *              file_name, fileName 
 *           2. 상수는 모든 문자를 대문자로 사용
 *           3. 클래스는 대문자 시작
 *              FileName File_Name
 *           4. 인터페이스 => 클래스와 동일
 *           5. 메소드는 변수와 동일         
 *        ---------------------------------
 *      2. 다중조건문(115p)
 *          => 메뉴 / 네트워크 (내부 프로토콜) / 데이터베이스 =>SQL
 *          => 게임 => 키 값에 따라서 상황 변경
 *          형식)
 *                시작
 *                 ㅣ    
 *              if(조건문)
 *              {   ㅣ true
 *                 실행문장 (true일때 문장 수행) =====> 종료
 *              }   ㅣ fasle
 *              else if(조건문)
 *              {         ㅣtrue 
 *                 실행문장 => 문장수행 종료
 *              }    ㅣ false 다음조건
 *              else if(조건문)
 *              {         ㅣ true
 *                 실행문장 => 문장 수행 종료
 *              }         ㅣ false 다음조건
 *              ......
 *              else
 *              {
 *                 조건이 없는경우 => default => 생략 가능
 *              }
 *              
 *              => 단일 조건문 여러개와 차이점
 *                 ------- 모든 if를 검색
 *                 다중 조건문은 한개만 수행
 *                 
 *              => 90점 입력   
 *              if(score>=90) {
 *                 A
 *              }
 *              if(score>=80) {
 *                 B
 *              }
 *              if(score>=70) { 
 *                 C
 *              }
 *              if(score>=60) {
 *                 D
 *              }
 *              if(scor<>=60) {
 *                 F
 *              }
 *                 
 */ 
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int avg=( kor + eng + math)/3;
		
		System.out.println("====결과====");
		char score='A';
//		if(avg >= 90) {  // (avg>=90 && avg<==100)
//			score='A';
//		}
//		if(avg >= 80) {
//			score='B';
//		}
//		if(avg >= 70) {
//			score='C';
//		}
//		if(avg >= 60) {
//			score='D';
//		}
//		if(avg <= 60) {
//			score='F';
//		}
		if(avg>=90) {
			score='A';
		} else if(avg>=80) {
			score='B';
		} else if(avg>=70) {
			score='C';
		} else if(avg>=60) {
			score='D';
		} else if(avg<=60) {
			score='F';
		}			
			
		    System.out.println("학점:" + score);
		     

	}

}

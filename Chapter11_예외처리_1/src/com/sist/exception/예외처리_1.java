package com.sist.exception;
/*
 *      프로그램
 *        1) 가독성 => 메소드 (분석 => 유지보수)
 *                   ----- 웹 : 오라클 데이터 처리
 *                              브라우저로 전송 => 데이터
 *                                             ---- 변수
 *        2) 견고성 => 예외처리 
 *                   ------ 사용자 입력 실수 / 개발자 실수
 *        3) 최적화 => 실행속도 : 라이브러리
 *                     윈도우 => 쓰레드
 *           Buffer 
 *           
 *      예외처리
 *        1) 사전에 에러를 방지 목적  
 *        2) 비정상 종료 => 정상상태 유지
 *        3) 모든 언어(자바스크립트) => 객체지향
 *                                ------
 *                                1. 자바와 다른 경우
 *                                   for aa of 배열
 *                                   map()
 *      
 *      예외처리 방법
 *         1) 직접처리 : try ~ catch => 어떤 에러 예상을 해야함
 *                                    ------ catch 는 여러개 
 *         2) 간접처리 : 시스템에 의해 처리
 *                     메소드() throws
 *         3) 임의로 발생 => 테스트용
 *                     throw 예외처리 클래스
 *         4) 사용자 정의 => 자바에서 모든 예외 제공(X) 
 *            --------
 *               class MyException extends Exception
 *             데이터형 : 영화, 맛집, 음악...=> 자바에서 제공하지 않음
 *              클래스 : 메소드
 *             예외처리 
 *                => 첫번째 : if
 *                   
 *             -------------------------- 전부 제공을 하지는 않으므로 개발자에게 맡긴다         
 *             
 *       직접처리
 *         try 
 *         {
 *             정상 수행하는 명령문
 *         }catch(예외처리 클래스) 
 *         {
 *             에러발생시 처리 
 *         }
 *         finally ==> 생략 가능
 *         {
 *             무조건 수행하는 문장
 *             1. 오라클 서버 연결 해제
 *             2. 서버 연결 해제
 *             3. 파일 닫기
 *         }             
 *         
 *         교재 9장 => 내부클래스 
 *                     = 네크워크 / 쓰레드 프로그램
 *                               
 */
import java.io.*;

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	// 정상수행
        	System.out.println("1");
        	System.out.println("2");
        	System.out.println("3");
        	
        	// 변수 / 클래스 선언 => 블록 안에서만 사용 가능
        }catch(Exception e) {
        	// try 수행중 에러가 나는 경우 => 예측
        	System.out.println("4");
        }
        finally {
        	// 무조건 실행
        	System.out.println("5");
        }
	}

}
















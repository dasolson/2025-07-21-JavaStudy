package com.sist.lang;
// System
/*
 *     프로그램 종료 / 입출력 / 메모리 회수 => static
 *     
 *     프로그램 종료 : System.exit(0)
 *         = exit(0) : 정상 종료
 *         = exit(0이 아닌 수) : 비정상 종료
 *     입출력 : System.in / System.out
 *     메모리 회수 : System.gc()
 *     
 *     ** 윈도우
 *     ** System.out.println() => 디버깅의 기본
 */

public class 라이브러리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        for(int i=1; i<=10; i++) {
        	if(i==a) {
        		System.out.println("프로그램 종료");
        		System.exit(0);
//        		break;
        		
        	}
        	System.out.println("i=" + i);
        }
        System.out.println("시작");
        System.out.println("GO"); 
	}

}



















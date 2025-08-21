package com.sist.lang;
/*
 *     java.lang / java.text
 *     --------- 자바의 기본 클래스 (import 생략 가능)
 *      1) Object : 모든 클래스의 상속을 내리는 클래스(최상위 클래스)
 *                  모든 데이터형을 포함하고 있다
 *                  모든 클래스 : Extends Object
 *           주요 기능)
 *               String toString() : 객체 주소를 리턴한다
 *                    => 생략이 가능
 *               boolean equals(Object o) : 객체 비교(주소비교)
 *               Object clone() : 복제(새로운 메모리 생성)
 *               void finalized() : 소멸자
 *               int hachCode() : 객체의 메모리 주소를 기반으로 정수형으로 만든 구분자       
 *      2) String : 문자열을 저장하는 데이터형
 *           사용법) **String s=""  => 일반 데이터형과 동일
 *                    String s=new String("")  => 클래스 형태
 *         주요기능)
 *            문자의 갯수 : length() => int length()
 *            문자를 있는 그대로 가지고 오기 : String toString()
 *            문자변환 : replace() replaceAll()
 *                     String replace(char c1, char c2)
 *                     String replace(String c1, String c2)
 *                     String replaceAll(String regex, String s)
 *                                       ------------
 *                                        정규식
 *            문자위치 찾기 : int indexOf(char c), int indexOf(String s)
 *                         int lastIndexOf(char c)
 *                         int lastIndexOf(String c)       
 *            문자 자르기 : subString() , split()
 *                       -----------
 *                       String subString(int b)
 *                       String subString(int b, int e)    
 *                       String[] split(String regex)
 *                                      ------------- 정규식 이용
 *                       ==> 보완 클래스 : StringTokenizer
 *            공백문자제거 : trim() = 좌우 공백 제거
 *                       String trim()
 *            문자비교 : equals() => boolean equals(String s)    
 *            검색 : startsWhith(), endsWith(), contains()
 *                  ------------   ----------  ----------
 *                 시작문자열(검색)   끝문자열(확장자)  포함문자열
 *               원형) boolean startsWhith(String s)
 *                    boolean endsWith(String s)
 *                    boolean contains(String s)    
 *            문자열 변환 : valueOf(기본형)
 *                       static String valueOf(int)                                                  
 *                                
 *      3) StringBuffer / StringBuilder
 *         ------------   ------------- 문자열 결합
 *             비동기            동기
 *         => append() : 문자열 결합
 *                  -- char, String
 *         => 문자가 많은 경우 => 문자열 결합 최적화         
 *      4) Math : only static
 *           static double random() : 랜덤함수
 *           static double ceil(double d) : 올림함수
 *      5) System : 프로그램 종료 / 메모리 해제 / 콘솔 출력
 *           System.exit(int a) => a=0 정상 종료
 *           System.gc() => 가비지 컬렉션
 *           System.in.read / System.out.print => 표준 입출력
 *           ---------        ----------
 *             예외처리         예외처리(x)
 *      6) Wrapper : 기본 데이터형을 쉽게 제어가 가능하게 만든 클래스
 *                   = 제네릭을 이용하는 목적
 *                     ---- 데이터형을 통일할 경우에 사용
 *                          <클래스>
 *                   = 문자열을 해당 데이터형으로 변경       
 *          = Integer (int) => Integer.parseInt("10")
 *          = Double (double) => Double.parseDouble("10.5")
 *          = Boolean (boolean) => boolean.parseBoolean("true")
 *          = Long (long) => Long.parselong(10L)
 *      7) MessageFormat : SQL 문장 / 복잡한 문장의 출력 형식
 *      8) DecimalFormat : 숫자표현 세자리 앞에 ,
 *                          패턴 -> ###,### => 오라클 -> 999,999   
 *               DecimalFormat d=new DecimalFormat("##,###,###")           
 *      9) SimpleDateFormat : 날짜 변환
 *                            년도 : yyyy /yy
 *                             월 : MM / M
 *                             일 : dd / d  
 *                            시간 : hh / h
 *                             분 : mm / m
 *                             초 : ss / s   
 *                 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd")                             
 */
import java.io.*;
public class 라이브러리_lang_정리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        System.out.print("키보드 입력:");
        int a=System.in.read(); // 정수 변환
        System.out.println(a);
	}

}














package com.sist.lang;
/*
 *    * Wrapper
 *        
 *        기본형을 클래스화 
 *        
 *        정수형           클래스
 *           byte    ===> Byte
 *           short   ===> Short
 *       *** int     ===> Integer
 *       *** long    ===> Long
 *        문자형
 *           char    ===> Character
 *        실수형
 *           float   ===> Float
 *       *** double  ===> Double
 *        논리형
 *       *** boolean ===> Boolean 
 *        문자열형
 *       *** char[]  ===> String
 *          
 *     ==> 양쪽 호환
 *           = 오토박싱 / 언박싱 => 메소드는 한개만 ParseXxx() 
 *                                               --- Int, Double, Long...
 *              - 오토박싱 : 클래스의 값 대입
 *              - 언박싱   : 기본형에 클래스 객체 대입
 *              
 *       ex) Integer ii=10; => 오토박싱
 *           int i=ii => 언박싱  
 *                                                  
 *             String       String => 정수 변경 Integer.parseInt("10") => 10
 *     * 자바 ==========> 서버 ==========> 클라이언트   
 *               10
 *          String.valueOf(10)
 *            => "10"     
 *          => 문자열 변경                  
 *          write(String s)
 *          String read() 
 *          
 *          정수 변경 : Integer.parseInt("10")
 *          실수 변경 : Double.parseDouble("10.5")
 *          논리 변경 : Boolean.praseBoolean("true")
 *          
 *          *** 웹 / 윈도우 => 데이터형이라는 개념이 없다
 *                           only String
 *           입력창
 *             JTextField
 *             <input type=text>
 *             
 *         ex) public String boardList(HttpServletRequest req) {
 *                  String page=req.getParameter("page") 
 *             }               
 *             
 *             스프링
 *             public String boardList(int page) {
 *             
 *             }   
 *             
 *             public String boardList(MemberVO vo) {
 *             
 *             }         
 *             
 *          
 */
import java.util.*;
public class 라이브러리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Integer ii=new Integer(10); // 예전 방식
//        int i=ii.intValue();
//		  Integer ii=10;
//		  int i=ii;
		  int a=100;
		  System.out.println(Integer.toBinaryString(a)); // 2진법
		  System.out.println(Integer.toOctalString(a)); // 8진법
		  System.out.println(Integer.toHexString(a)); // 16진법
		  
          
        
        
	}

}
















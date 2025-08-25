package com.sist.collection;
/*
 *     라이브러리
 *       - Object
 *           clone / hashCode / equals / finalize / toString 
 *       - String
 *           length / equals / startsWith / endsWith / contains / indexOf / lastOf / trim / valueOf / subString / split          
 *       - StringBuffer 
 *           append
 *       - Math
 *           random / ceil
 *       - System
 *           System.out.println()
 *     -------------------------------------------------------- java.lang
 *      java.text
 *         SimpleDateFormat
 *         MessageFormat
 *         DecimalFormat
 *     -------------------------------------------------------- format()
 *      java.util
 *         StringTokenizer
 *            hasMoreTokens / countToken / nextToken
 *         Random
 *            nextInt(int bound)
 *         Collection          
 *            List => ArrayList
 *            Map  => HashMap
 *            Set  => HashSet
 *     ---------------------------------------------------
 *      정규식 / 리플렉션 / 어노테이션
 *     ---------------------------------------------------
 *      기본 java => 데이터베이스 java => 웹 java => 스프링 java
 *               J2SE                  J2EE
 *     ---------------------------------------------------
 *       
 *      제네릭
 *      ---- 컬렉션 => List<필요한 데이터형> 
 *                        -----------자바 클래스
 *                                   사용자 정의
 *                   List<empVO>
 *      제네릭 지정 => 데이터형의 한계가 있다
 *       ex) List<String> : 무조건 String 만 저장 할 수 있다
 *           add(String a)  add(Object obj) 
 *           ------------- String[]                                      
 */
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        // List<String> list=new ArrayList<String>();
        // List<String> list=new ArrayList<>();
        //list.add(1); // => 오류
        list.add("사과");
        list.add("배");
        list.add("수박");
        
        for(String f:list) {
        	System.out.println(f);
        }
        
        // 정수 => Integer <클래스형> : Wrapper
        // 제네릭 : 형변환(x), 지정값만 저장 => 리턴형도 지정된 값만 사용
        // 사용자 정의도 사용이 가능
	}

}




















package com.sist.lang;
/*
 *     1. 라이브러리 => 자바에서 지원하는 클래스의 집합
 *          = java.lang : import 생략 가능
 *              ** 1) Object
 *              ** 2) String
 *                 3) StringBuffer
 *                 4) Math
 *                 5) System
 *                 6) Wrapper
 *                  ** = Integer     => int
 *                  ** = Double      => double
 *                     = Byte, Short 
 *                     = Boolean     => boolean
 *                     = Float       => float
 *          = java.util
 *                 1) StringTokenized
 *              ** 2) Date / Calendar
 *                 3) Collection
 *                    ** = List / Set / Map
 *          = java.io
 *             = 파일 입출력
 *                 1) FileInputStream / FileReader
 *                 2) FileOutputStream / FileWriter
 *                 3) BufferedReader / bufferedWriter
 *          = java.net
 *                 1) URLEncoder
 *                 2) URL
 *                 3) Socket
 *          = java.sql
 *                 1) Connection
 *                 2) PreparedStatement
 *                 3) ResultSet
 *          = java.text
 *                 1) MessageFormat
 *                 2) DecimalFormat
 *                 3) ChoiceFormat
 *         --------------------------------------------------
 *        *** = 어노테이션
 *        ** = 람다식 
 *        ** = 리플렉션
 *        * = 정규식
 *         --------------------------------------------------
 *         Collection *x1000000000000
 *         --------------------------------------------------
 *         Thread / 네트워크 / 데이터베이스 
 *         --------------------------------------------------
 *         
 *     Object : 모든 클래스의 상위 클래스
 *                        ---------
 *                        라이브러리 / 사용자 정의 => Object 로부터 상속을 받는다
 *      1. 주요기능
 *         *** 1) finalize() : 소멸자 함수
 *         *** 2) clone()    : 복제
 *             ----------------
 *             git clone repository주소
 *         *** 3) equals()   : 객체 비교
 *             4) getClass() : 클래스의 정보 / 객체 생성
 *         *** 5) toString() : 문자열 변환
 *          ** 6) hashCode()
 *        ------------------------------------------- 모든 클래스에 사용이 가능하게 내장 되어있다       
 *      2. 모든 클래스의 상위 클래스
 *            = 클래스를 리턴하는 메소드가 있는 경우 (Object)
 *            = 형변환을 해서 받아야 한다
 *            ex) 
 *                class A {
 *                    o x
 *                }
 *                class B extends A {
 *                    // o x
 *                    p h k m n
 *                }          
 *                
 *                A a=new A(); ==> o x
 *                B b=new B(); ==> o x p h k m n
 *                A c=new B(); ==> o x                          
 */
// 복제
class Sawon implements Cloneable {
	String name;
	String sex;
	public Sawon() {
		name="홍길동";
		sex="남자";
	}
	public void print() {
		System.out.println("이름:" + name);
		System.out.println("성별:" + sex);
	}
	@Override
	// ===> 메소드 호출시에 예외처리를 한 후 사용
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Member {
	int mno=10; // 배열(주소) => 예외 : String (Call by value)
}
public class 라이브러리_1 /* extends Object*/{
    public static void getMno(Member m) {
    	// m=mm
    	m.mno=100;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon hong=new Sawon();
        hong.print();
        hong.name="박문수";
        hong.sex="남자";
        try {
            Sawon shim=(Sawon)hong.clone(); // 초기값이 같은 메모리 복제 => 새로운 메모리 생성
            // prototype = clone 
            shim.print();
            shim.name="심청이";
            shim.sex="여자";
            hong.print();
            Sawon kim=shim; // 주소 참조(Call by Reference)
            // 별칭 => 같은 주소 제어
            kim.name="김두한";
            kim.sex="남자";
            shim.print();
            shim.name="심청이";
            shim.sex="여자";
            kim.print();
        
        }catch(Exception ex) {}  
        
        Member mm=new Member();
        getMno(mm); // m=mm => 같은 메모리 제어
        System.out.println(mm.mno);
        
        
	}

}

















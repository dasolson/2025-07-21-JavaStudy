package com.sist.inter;
/*
 *     인터페이스 : 추상클래스의 일종 => 클래스와 동일
 *     -------   -------
 *     : 단일상속  : 다중상속 => 클래스(단일), 인터페이스(다중)
 *     
 *      1. 인터페이스
 *           = 인터페이스로 상속
 *                ex) interface A
 *                    interface B extends A
 *           = 클래스로 상속
 *                ex) interface A
 *                    class B implements A
 *                    
 *             interface A
 *             interface B extends A
 *             interface C extends B => c(A,B)    =>단일
 *             
 *             interface A
 *             interface B 
 *             interface C extends A,B
 *             -------------------------------  => 다중
 *             
 *             interface A
 *             interface B
 *             class C
 *             class D extends C implements A,B 
 *             
 *                               --------------- 다중
 *             ----------------- 단일
 *             
 *         인터페이스의 장점(면접 88%)
 *           1. 기능 설계 => 선언만 된 메소드
 *               => 개발시간 단축
 *                   ex) 6개월기간 개발
 *                        => 요구사항분석 / 데이터베이스 설계 => 3.5개월
 *                        => 개발 => 1.5개월
 *                        => 테스트 / 배포 => 1.5개월
 *           2. 표준화 가능 : 모든 개발자가 같은 메소드 사용
 *               => 스프링 => 장점 : 결함성이 낮은 프로그램
 *                                ---------------- 에러 발생시 다른 클래스에 영향이 없다
 *           3. 소스의 통일화(형식) => 분석하기 쉽다 *               
 *               => 1) 회사 소스 => 분석 
 *               => 2) 메뉴얼 작업
 *           4. 서로다른 클래스를 연결해서 사용이 가능
 *           5. 유지보수가 뛰어나다
 *           6. 독립적으로 사용이 가능(리모콘)   
 *                => Green project 
 *                    => 모든 기계를 한개의 리모콘으로 제어
 *           7. 관련된 클래스를 모아서 관리
 *                ex) 
 *                    List => 인터페이스
 *                     |
 *           -------------------------------------
 *           |        |          |        |      |    
 *       ArrayList  Vector  LinkedList  Stack  Queue       
 *         구현된 클래스 => 컬렉션                       
 *         
 *     *** 웹 => 3대 클래스
 *               String, Integer, ArrayList 
 *       
 *     *** 상속 : 인터페이스 => 인터페이스
 *                     extends
 *               인터페이스 => 클래스
 *                     implements
 *               클래스 => 인터페이스 =>X            
 *               
 *         다중상속 : ,로 구분
 *         ------ 인터페이스만 존재
 *         클래스, 인터페이스
 *       => class A extends B implements C,D,E
 *                ----------- ----------------  
 *         
 *         오버라이딩 
 *            = 상속 => 클래스 상속 / 인터페이스 상속
 *                     extends implements 
 *            = 메소드명이 동일
 *            = 매개변수 동일
 *            = 리턴형 동일
 *            = 접근지정어는 확장만 가능 => 모르겠을때는 public  
 *            = 오버라이딩이 된 경우엔 반드시 메소드 호출은 생성자 타입을 따라간다
 *                 ex) 
 *                     A a=new B()
 *                       a=> B가 가지고 있는 메소드를 호출한다
 *            형식)
 *                 only public
 *                 public interface A
 *                 {
 *                      ----------변수(상수형 변수)------------
 *                              int a; => int 10;
 *                              
 *                       (public static final)int a=10;
 *                           생략시에 자동 추가 
 *                       (public static)final int b=100;  
 *                       (public final)static int c=100;
 *                       // 나머지 접근지정어는 사용 불가
 *                      ----------선언만 된 메소드-------------
 *                       (public abstract)void aaa();
 *                         => 오버라이딩 =>  
 *                      ------------구현된 메소드-------------
 *                          JDK 1.5 => 개발자 요청 => 추상클래스 사용 빈도 낮아짐
 *                          (public)default void bbb()
 *                          {
 *                          }
 *                       
 *                          (public)static void ccc() 
 *                          {
 *                          }
 *                      ----------------------
 *                      
 *                      ----------------------
 *                 }                              
 *                  
 *             
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
interface A {
//	int a; => x	
	int a=10;
}
public class MainClass extends JFrame implements ActionListener, MouseListener, KeyListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}



















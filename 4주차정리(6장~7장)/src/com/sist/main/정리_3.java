package com.sist.main;
/*
 *     상속 / 오버라이딩 / 형변환
 *                     ---- 자동 형변환 / 강제 형변환
 *                          *** 자바 라이브러리 클래스 리턴 => Object
 *     *** 클래스 크기 비교
 *         ------------  상속관계 / 포함관계
 *                               ------ 포함하고 있는 클래스가 크다
 *                       ----- 논리적 => 상속내리는 클래스 > 상속받는 클래스
 *     상속
 *      정의 : 이미 만들어진 클래스의 변수/메소드를 상속 받아서 새로운 클래스를 만들어서 사용
 *                       --------------
 *                       예외) static/생성자/초기화블록은 상속이 안된다
 *                            ** private은 상속은 가능 => 접근은 불가
 *                             => getter/setter 사용시 접근 가능
 *                             
 *    
 *      => 형식
 *          class parent
 *          {
 *              int a=10;
 *              int b=20;
 *              public void aaa(){}
 *          }
 *          class Child extends parent
 *          {           -------
 *              int c=30;
 *              int d=40;
 *              public void bbb(){}
 *          }           class => class extends
 *                      interface => class implements
 *          parent p=new parent()  
 *                 p=a,b, aaa()
 *          Child c=new Child()
 *                c=a,b,aaa(), c, d, bbb()
 *          parent p2=new Child()
 *                 p2 => a, b, Child:aaa()
 *          ---------
 *              parent p=new Child()
 *                       주소가 변경 => 메소드의 주소 변경
 *              -------- -----------
 *                        | parent가 가지고 있는 메소드 호출 => 메소드의 주고 변경
 *                          Child가 오버라이딩한 메소드 호출
 *              |parent가 가지고 있는 변수  
 *              
 *        ** 상속의 목적
 *            = 코드 재사용**
 *            = 유지보수 효율성 => 기능을 미리 알고 있다 => 현실에 맞게 변경
 *            = 소스 간결(가독성은 좀 떨어짐)  
 *            = 반복 제거**
 *            *** 가독성, 재사용, 수정용이, 최적화
 *                                          
 *      => 특징
 *          = 단일 상속만 가능
 *            ------ 인터페이스는 다중 상속이 가능
 *          = 모든 클래스는 Object 클래스가 최상위 클래스이다
 *                      Object 상속을 받고 있다
 *          = private은 직접 접근은 불가능 => getter/setter 를 이용하면 접근 가능
 *          = 상위 클래스는 공통적으로 가지고 있는 변수/메소드
 *            하위 클래스는 메소드를 필요시에 변경해서 사용(오버라이딩)
 *                                      
 *      => 메소드 재정의(오버라이딩) => 프로그램에 맞게 구현
 *          조건) 
 *               상속 ============> 익명의 클래스 
 *               메소드명 동일
 *               리턴형 동일
 *               매개변수 동일
 *               접근지정어 확장 가능
 *               ---------------
 *               private < default < protected < public
 *               => 모든 메소드 public 으로 만든다 
 *               ex) interface A
 *                   {
 *                       (public abstract) void display();
 *                   }
 *                   class B implements A
 *                   {
 *                       void display() { => 앞에 public 안붙으면 오류 
 *                       
 *                       }    
 *                   }
 *              
 *      => *** 형변환
 *           1. 자동 형변환
 *                클래스는 크기 결정을 할때 : 상속 / 포함
 *           2. 강제 형변환
 *           
 *           ex) class A
 *               class B => 크기 비교 불가 => 오류발생
 *               
 *               class (extends Object)A
 *               
 *               A < Object
 *               
 *               ===========> 객체크기 비교
 *                           객체명 instanceof 클래스명  => 객체명이 클래스명 보다 크냐 
 *                           
 *               Object obj
 *               String str
 *               StringBuffer sb
 *               
 *               str instanceof Object => String은 Object냐 => ture
 *               sb instanceof Object => true
 *               
 *               obj instanceof String => false
 *               str instanceof StringBuffer => 오류
 *               
 *                    Object
 *                       |
 *                   ---------
 *                   |        |
 *                String    StringBuffer       
 *            
 *          1. 자동형변환
 *              class A
 *              class B extends A
 *              
 *              A > B
 *              
 *             A a=new A();
 *             double
 *             B b=new B();
 *             int
 *             
 *             A c=b; => 자동형변환 double d=10
 *             B D=(B)a; => int i=(int)10.5                    
 *                                              
 *             사용자 정의 데이터형 / 기본형
 *             --------------- 메모리 크기 제작
 *             ex) 12byte가 없다면 => 8byte + 4byte 나눠서 저장해야한다
 *                 ------
 *                 class A
 *                 {
 *                     int a;
 *                     double d;      => 큰 공간에 한번에 저장 => 클래스
 *                 } 
 *             
 *                    
 *                       
 *                              
 */   
class parent {
	int a=10;
	int b=20;
	// 메소드는 주소 => aaa => 변경
	public void aaa() {
		System.out.println("parent:aaa() Call...");
	}
}
class Child extends parent {
//	int a=10;
//	int b=20;
//	public void aaa() {
//		System.out.println("parent:aaa() Call...");
//	}
	int c=30;
	int d=40;
	public void bbb() {
		System.out.println("Child:bbb() Call");
	}
	public void aaa() {
		System.out.println("parent:aaa() Call...변경");
	}
 }
public class 정리_3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent(); // 자신의 변수 a, b 메소드 aaa()
		// 사용 빈도가 거의 없다
		Child c=new Child(); // c, d, bbb(), a, b, aaa()
		// 거의 대부분 사용
		parent pp=new Child(); // a, b, aaa()
		// 관련된 클래스를 모아서 관리 => 추상클래스 / 인터페이스
		// 자동 형변환
		// parent => double, Child => int 
		// 변수는 parent가 가지고 있는 변수 호출
		// 메소드는 Child가 가지고 있는 오버라이딩 메소드 호출
//		pp.aaa();
//		System.out.println(pp.a);
//		Child cc=(Child)new parent(); // int a=10.5 랑 같은 상황 => int a=(int)10.5
//		Child cc=(Child)pp; // 강제 형변환
		Object obj=new Object();
		String str="";
		StringBuffer sb=new StringBuffer();
		
		if(str instanceof Object) 
			System.out.println("True");
		if(sb instanceof Object)
			System.out.println("True");
		if(obj instanceof String)
			System.out.println("True");
		else
			System.out.println("False");
//		if(str instanceof StringBuffer) // 오류 
		

	}

}













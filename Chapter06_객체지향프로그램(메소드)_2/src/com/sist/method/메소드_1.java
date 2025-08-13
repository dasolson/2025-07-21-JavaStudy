package com.sist.method;
/*
 *     1. 메소드 : 특정 작업(기능)을 수행하는 명령문의 집합(관련된 명령문만 모아서 관리)
 *          1) 재사용 => 변경이 가능
 *          2) 다른 클래스와 통신
 *                       요청:메소드
 *               A클래스 <=====> B클래스
 *                       응답:메소드
 *             ex)        요청값 요청 
 *                 A클래스 <========> 오라클
 *                   |     데이터 전송
 *               전송받은 데이터를 메소드를 통해서 브라우저로 전송
 *               ----------- 브라우저, 휴대폰, 윈도우
 *           3) 유지보수 용이하다
 *           4) 프로그램을 구조화 (기능별 분리 가능)
 *           ** 한가지 기능만 수행
 *           ** 메소드
 *               - 사용자 정의 메소드
 *               - 라이브러리 메소드 => 암기
 *           ** 메소드는 독립적 사용이 불가 => 클래스 내부에 존재
 *      2. 형식
 *          [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *          {
 *              returne 결과값;        => 리턴형과 결과값은 데이터형이 일치해야 한다
 *          } 
 *          => 결과값이 여러개 있는 경우 : 데이터를 묶어서 전송
 *                                   -----------
 *                                   배열 / 클래스
 *          => 접근지정어 : private, default, protected, public
 *             private : 자신의 클래스 내부에서만 사용이 가능
 *                       => 데이터 보호 : 멤버변수
 *                       => 변수 => 기본형 / 참조형
 *                                        ---- 메모리 주소를 저장하고 있다
 *                                               배열 / 클래스
 *                       => 모든 변수는 private => 데이터를 보호한다(x)
 *                                   -------
 *                                   데이터값이 지정(회원, 게시판..)
 *                        ex)   class Win extends JFrame
 *                              {
 *                                  Jbutton b=new JButton() => 멤버변수
 *                                  -----------------------   = 버튼 같은건 보호 할 필요가 없다
 *                                  => public JButton
 *                                  => 클래스형 => 공개
 *                              }                            
 *             default : 같은 패키지 안에서만 접근 가능
 *                       => 테스트용 
 *             protected : 같은 패키지, 상속 과정이 있는 경우(패키지가 다른경우) 접근 가능
 *             ---------
 *              ------------- com.sist,super
 *               class Super
 *               {
 *                   ★ㅁ○  => private ★ㅁ○         
 *               }                          
 *               ------------ com.siist.sub
 *               class Sub extends Super
 *               {
 *                   //★ㅁ○ => 상속은 가능 => 접근이 불가능
 *                      => private => protected - 접근이 가능하도록   
 *               }                            
 *              ------------- 
 *              객체지향 프로그램 
 *                 특성 : 캡슐화, 상속, 추상화, 수정, 추가
 *                  => 권장사항 => OOP에 접근하지 않아도 된다
 *             public : 모든 클래스에서 접근이 가능 (패키지와 관련 없다)
 *             
 *             데이터를 저장하는 일반 변수   : private (웹)
 *             메소드 / 클래스 / 인터페이스 : 연결할 수 있게 => public
 *             메소드 : public
 *             *** 인터페이스 : 모든 변수가 public 
 *                 ------- 선언되는 변수가 상수이기 때문    
 *                 
 *             패키지 
 *               - 클래스나 인터페이스를 그룹화한 단위
 *                  => 관련된 클래스를 모아둔 폴더
 *                  => 클래스 관리가 편리
 *                  => 접근지정어 확인  
 *                  
 *             메소드의 종류
 *                - 인스턴스 메소드 (92%)
 *                               => 저장되는 시점 : new => 따로 저장
 *                                     객체명.메소드()
 *                - 정적 메소드(static)(1%) => 공통 사용 => 한글변환
 *                                       => 이미지 축소 / 확대 
 *                                       => 저장되는 시점 : 컴파일 시에 저장
 *                                             클래스명.메소드명()
 *                - 추상 메소드 => 여러개 클래스 공통 기능
 *                               추상클래스 / 인터페이스
 *                - 종단 메소드(0.000000000001%) => final 사용 빈도가 거의 없다
 *                
 *              class Human
 *              {
 *                   int age;
 *                   String name;
 *                   public void eat(){}
 *                   public void run(){}
 *              }  
 *              
 *              Humen hong=new Humen()
 *              
 *                ----- hong -----
 *                     0x100                0x100
 *                ----------------     ----- age ------
 *                                            0      =====> hong.age         
 *                                     ----- name -----
 *                                           null    =====> hong.name
 *                                     ----------------
 *                                           eat()   =====> hong.eat
 *                                     ----------------
 *                                           run()   =====> hong.run
 *                                     ----------------  OOP(객체지향프로그램)
 *            ------------------------------------------------------------
 *            
 *          객체 => 변수(클래스 / 배열) + 메소드 => 관리
 *                                     
 *                                        
 *                        
 */
//interface A {
//	int a=10; // public static final
//}             
class Calc {
	int num1, num2;
	char op; //초기화
	
	public void add() {
		System.out.println(num1 + num2);
		// void일 경우에만 return 자동 추가
	}
	public void minus() {
		System.out.println(num1 - num2);
	}
	public void gop() {
		System.out.println(num1 * num2);
	}
	public void div() {
		if(num2==0)
		    System.out.println("0으로 나눌 수 없다");
		else
			System.out.println(num1 / num2);
	}
}
public class 메소드_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=new Calc();
		c.num1 = 10;
		c.num2 = 5;
		c.add();
		c.minus();
		c.gop();
		c.div();
	}

}


















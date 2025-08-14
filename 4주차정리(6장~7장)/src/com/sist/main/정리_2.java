package com.sist.main;
// 7장 => 캡슐화 / 상속 / 다형성 / this / super / this() / super()
/*
 *     키워드 
 *       => this    : 자신의 객체
 *            class A => 설계
 *            {
 *                this를 사용하는 위치
 *                 => 생성자, 인스턴스 메소드에서만 사용이 가능
 *                 => static 메소드에서는 사용 할 수 없다
 *                 => 클래스 자신이 가지고 있는 것
 *                    ---------------------
 *                    인스턴스 변수 / 인스턴스 메소드 / 생성자
 *                    public void aaa(A this)
 *                    {               ------ 생략
 *                        this.
 *                        ----- 생략
 *                        써야할때 => 지역변수 / 매개변수가 인스턴스 변수와 동일할때 구분을 위해
 *                    }
 *                    public A(A this)
 *                    {        ------ 생략
 *                    }
 *                    
 *                    ex) int a;
 *                        public void bbb(int a)
 *                        {
 *                            this.a=a => 구분불가해서 this. 추가
 *                        }
 *                        => 지역변수 우선순위
 *                           ------------ 지역변수가 없는 경우 인스턴스변수, 정적변수 찾기
 *            }
 *            A a=new A() => 사용법
 *            ----------- 
 *            JVM
 *            --- 1. this 저장
 *                   this=a
 *            => 웹 : this가 아니고 page
 *            => 구분자 : 없는 경우는 생략이 된 것이다       
 *       => this()  : 자신의 생성자를 호출 할 경우에 사용
 *       => super   : 상위 클래스 객체
 *       => super() : 상위 클래스의 생성자 호출
 *          ------- 상속을 받는 경우 무조건 호출 => 없는 경우 자동 추가
 *       => 접근지정어 (사용자 정의 없음)
 *            public    : 모든 클래스에 접근이 가능  
 *            protected : 같은 패키지까지 접근 가능, 상속내린 클래스까지 가능(패키지가 달라도 된다)
 *            default   : 같은 패키지까지 접근 가능
 *            private   : 같은 클래스만 접근가능
 *            
 *            => 다른 클래스와 연결
 *                1. 클래스
 *                2. 메소드
 *                3. 생성자
 *                   ---- public 
 *                4. 멤버변수(인스턴스 변수)
 *                   -----------------private : 데이터 보호 목적
 *            final : 상수
 *            
 *          키워드 :  static, 접근지정어, final
 *                  ---------------------- 인스턴스변수, 정적 변수에서 사용
 *                  지역변수는 final만 사용이 가능 
 *     -------------------------------------------------------------------------------                        
 *          
 */
//class A {
//	int a;
//	public void display(int a) {
//		//a=a;
//		this.a=a;
//	}
//}
/*
 *     상속 내린 클래스 메모리 할당 => 상속 받은 클래스 메모리 할당
 *            | -------------------> 사용
 *            
 *         class A {
 *              int a=100;
 *              String name="홍길동";
 *         }
 *         class B extends A {
 *              int b=200;
 *              //int a=100;
 *              //String name="홍길동"
 *         }             
 */
class A {
	int a=100;
	public A(String name, int a) {
		   //------------------- 매개변수 있을경우 하위클래스에서 호출 , 값이 없을 경우 하위 클래스에서 호출을 안해도 된다(자동 추가됨)
		System.out.println("상위 클래스 생성자 호출"); // => super();
	}
}
class B extends A {
	int a=200; // 변수 오버라이딩
	public B() {
		// super(); // => 자동 추가
		super("홍길동", 10); // => 상위 클래스에 매개변수가 있으면 반드시 super 호출을 해야한다 (매개변수 값을 넣어줘야 한다)
		System.out.println("this.a=" + this.a);
		System.out.println("super.a=" + super.a);
	}
}

public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa=new A();
//		aa.display(100);
//		System.out.println(aa.a);
		B b=new B();
		
		

	}

}















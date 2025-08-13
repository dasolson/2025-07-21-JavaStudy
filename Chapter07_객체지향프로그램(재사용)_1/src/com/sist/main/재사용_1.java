package com.sist.main;
/*
 *    *상속
 *      장점
 *       1. 재사용 기법
 *       2. 코드를 간결하게
 *       3. 신뢰성이 뛰어나다 (검증된 클래스를 이용)
 *       4. 한개의 클래스만 상속 받는다 => 단일 상속
 *       5. 기능을 변경해서 사용 할 수 있다(오버라이딩)
 *       6. 라이브러리 상속이 많다
 *       7. 개발시간 단축
 *        ex) 
 *            지니뮤직        알라딘         메가박스
 *              | 상속         | 상속        | 상속 
 *            멜론뮤직        yes24         CGV
 *                                         | 상속
 *                                      롯데시네마   
 *      단점
 *       1. 결합성이 높아진다
 *          ---- 클래스를 수정하면 다른 클래스에 영향을 준다
 *       2. 개발에 제약이 많아진다
 *               ---- 메소드가 동일해야 한다   
 *       3. 메모리가 비대해진다 => 메모리 누수현상
 *       4. 상속내리는 클래스의 모든 내용을 알고 있어야 한다 => .jar*.class 
 *       
 *       상속 => 호불호
 *      ---------------------------------------------------------
 *      기본 구조
 *          class 상속받는 클래스 extends 상속 내리는 클래스
 *          {
 *               // 상속받은 변수/메소드 -> 안보임
 *                  상속이 안되는 것 : static / 생성자 / 초기화 블록
 *                  상속은 되는데 접근불가 : private
 *          }          
 *          
 *          ** 상속의 정의 : 기존의 클래스로부터 상속을 받아서 확장된 새로운 클래스를 작성 
 *         
 *          *상속에서 많이 사용하는 형태
 *           ex)
 *            - 게시판 : 상위 클래스는 공통기능을 가지고 있어야 한다
 *               글쓰기
 *               목록
 *               상세보기
 *               수정
 *               삭제
 *               검색
 *            - 자료실 =====> 기존 클래스의 기능 변경
 *               글쓰기 ==> 업로드 추가
 *               목록
 *               상세보기 ==> 다운로드 추가
 *               수정
 *               삭제
 *               검색  
 *               --------=> 오버라이딩  
 *            - 댓글형 게시판   
 *               글쓰기
 *               목록
 *               상세보기
 *               수정
 *               삭제
 *               검색  
 *               ==> 추가 : 댓글
 *            ---------------------------------------------
 *           상위클래스 : 상속받는 클래스의 공통점을 모아둔 것
 *                                   --------- 중복 제거
 *            - 사람
 *               이름
 *               주소
 *               성별
 *            - 학생 extends 사람
 *               학번
 *         
 *               학과
 *               학년
 *              
 *              
 *            - 회사원 extends 사람 
 *               사번
 *              
 *               부서
 *               년차
 *              
 *            - 군인 extends 사람
 *               군번
 *             
 *               부대명
 *               계급
 *           ------------------------------------------------------
 *           ===> 코드중복제거
 *           ===> 한개를 가지고 여러개 표현이 가능
 *           
 *                 
 *                    
 */
class A {
	public void aaa() {
		System.out.println("aaa() Call");
	}
	public void bbb() {
		System.out.println("bbb() Call");
	}
}
class B extends A {
//	A a=new A(); // 상속안에 메모리 생성하면 같이 사용 가능
//	   public void aaa() {
//		   System.out.println("B:aaa() Call");
//	   }
//	   public void bbb() {
//		   System.out.println("B:bbb() Call");
//	   }
	//aaa() bbb()
	public void aaa() {
		System.out.println("B:aaa() Call");
	}
	public void bbb() {
		System.out.println("B:bbb() Call");
	}
	// 자체추가
	public void ccc() {
		System.out.println("B:ccc() Call");
	}
}
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B(); //ccc 사용 불가
		

	}

}


















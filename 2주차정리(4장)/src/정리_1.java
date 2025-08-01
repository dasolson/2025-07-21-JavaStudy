/*
 *    * 자바 학습
 *    -------------------------------------- 초급 
 *      1단계 : 자바 기초 문법
 *      
 *              1) 변수 / 데이터형
 *                  ㅣ변수: 재사용 => 처리
 *                  -----------------
 *                   => 관련된 데이터 : 배열
 *                   => 문장(문제) 
 *                   => 웹
 *                   => 이미지
 *                  --------------------
 *                   * 자바
 *                      데이터저장 => 데이터 연산처리 => 프로그램 제어 => 출력
 *                      ------- 
 *                      1. 한개씩 - 변수
 *                                  1) 메모리 크기
 *                                       데이터형
 *                                        - 정수 : int / long
 *                                        - 실수 : double
 *                                        - 논리 : true / false : boolean
 *                                        - 문자 : cahr (문자하나로 저장하는 경우 잘 없음)
 *                                        - 문자열 : String
 *                                  2) 데이터 가공 (사용자 요청)
 *                                       연산자
 *                                        - 단항 : ++, --, !, ()
 *                                               ------------- 형변환 - 클래스 형변환 
 *                                        - 이항 : 산술 (+, -, *, /, %)
 *                                                비교 (==, !=, <, >, <=, >=)
 *                                                논리 (&& ||)
 *                                                대입 (=, +=, -=)
 *                                        - 삼항 : (조건)?값1:값2
 *                                        
 *                                        ==> 요청 => 통계 / 합...산술
 *                                        ==> 비교연산자 => 체크박스(true/false) 
 *                                        ==> 논리연산자 => 두개의 정보
 *                                        ==> 삼항은 출력할때 많이 씀  /=> if~else
 *                                        ex) 
 *                                           JSTL
 *                                           <c:if test="curpage>1">
 *                                               <a href="...?page=<%=curpage-1%>">
 *                                           </c:if>    
 *                                           ---------------------------------------
 *                                           <%
 *                                              if(curpage>1)
 *                                              {
 *                                           %>
 *                                              <a href="...?page=<%=curpage-1%>">
 *                                           <%
 *                                              }
 *                                              else
 *                                              {
 *                                           %>
 *                                           --------------------------------------
 *                                           <a href="...?page=<%=curpage>1?curpage-1:curpage%
 *                                                                   
 *                      2. 관련된거 묶기 - 같은 데이터형(배열)
 *                                    - 다른 데이터형(클래스) 
 *                     --------------------------------- 메모리 
 *                                                        RAM(프로그램 종료시 삭제된다)
 *                        => 영구적 저장장치  
 *                            - 파일 : 보안에 취약하다  
 *                            - REDMS(오라클)                                            
 *              2) 연산자
 *              3) 제어문
 *                  3-1. 조건문
 *                  3-2. 반복문
 *              4) 배열
 *              
 *      2단계 : 메소드와 클래스 기초
 *      
 *              1) 메소드 정의와 호출
 *              2) 매개변수 / 리턴값 => 라이브러리
 *              3) 클래스 선언 / 객체 생성
 *              4) 멤버변수 / 멤버메소드
 *              5) 생성자 / this, super
 *    -------------------------------------- 중급        
 *      3단계 : 객체지향 프로그램 (OOP)
 *      
 *      
 *              1) 접근 제어어
 *              2) 상속, 오버라이딩 / 오버로딩
 *              3) 추상클래스 / 인터페이스
 *              4) 다형성 (수정, 추가), 클래스 형변환
 *              5) static, final, abstract
 *              
 *      4단계 : 자바 활용 / 실전
 *      
 *              1) 예외처리
 *             -----------------11장  
 *              2) 라이브러리
 *                 2-1. 컬렉션 프레임워크
 *                 2-2. 자바 입출력 (파일, 네트워크, 메모리)
 *              3) 데이터베이스
 *              
 *      5단계 : 주제별 프로젝트 => 실무 연계
 *      
 *              1) swing / javaFx
 *              2) Thread => 동기화
 *    --------------------------------------- 6주
 *     6.5개월
 *     
 *      => 총 26주 => 6주 : 자바 / 3주 : 오라클 / 1주 프로젝트
 *      => 16주 : 3주 : HTML / CSS / JavaScript
 *         13주 : 2주 : Jquery / Ajax 
 *         11주 : 3주 : JSP => 3주
 *         8주  : 4주 : Spring
 *         4주  : 3주 : CI/CD
 *         1주  : 1주 : 개인 프로젝트
 *         
 *         추가 => JPA / MyBatis / Spring-Security / SNS
 *                                                  JWT
 *                VueJS / Vuex / Pinia
 *                React / Redux / TanStackQuery / TypeScript                                 
 *    -------------------------------------------------------
 *         
 *                                                
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2, c=3, d=4, e=5, f=6, k=8, m=10, n=20, o=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(f);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		// arr[0] [1] .... 변수명=arr 변수 번호=0~ 
		int[] arr= {1,2,3,4,5,6,8,10,20,30};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		int aa=10;
		int bb=20;
		
		int max=aa;
		if(max<bb) 
			max=bb;
		System.out.println(max);

	}
	
 }

/*
 *     웹 개발
 *     -----
 *     연산자 =========> 오라클 / 자바스크립트
 *       1. 산술연산자
 *       2. 비교연산자
 *       3. 증감연산자
 *       4. 형변환연산자
 *       5. 논리연산자
 *       6. 부정연산자
 *       7. 대입연산자
 *       ------------ 웹에서 많이 쓰는 연산자
 *      
 *      자바 =>    JSP      / SpringFramework / Spring-Boot          프로그램
 *            (자바서버페이지) 
 *      자바스크립트 => VueJS / ReactJS / NextJS                       프론트
 *      오라클 => MySQL / MariaDB                                    데이터  
 *      ---------------------------CI/CD => 리눅스 명령어
 *                                          ---------
 *                                            단점 
 *                                           1. AWS => 우분투
 *                                             (유료)   (무료-한도내사용시)
 *                                             
 *     ---------------------------------------------------------------------------
 *     비교연산자 : 결과값 true/false
 *     -------
 *          1) 정수
 *          2) 실수
 *          3) 문자
 *          4) 논리(boolean) 제한 => ==, != 
 *          ====> 문자열 / 날짜 => 비교 불가능
 *       1. == (같다)
 *       2. != (같지 않다)
 *       3. < (작다)
 *       4. > (크다) ===> 왼쪽 기준 a>10, a<10
 *       5. <= (작거나 같다)
 *          -- < == => 둘중 하나가 true면 true가 된다
 *          예) 6<=6 / 6<6 6==6
 *       6. >= (크거나 같다)
 *          -- > ==
 *       사용처 : 조건문 / 반복문
 *              ----
 *              if(비교연산자ㅣ논리연산자ㅣ부정연산자)
 *                 ------------------------ true/false
 *              while(비교연산자ㅣ논리연산자ㅣ부정연산자)
 *              {
 *                     
 *              }
 *              
 *              
 *                                         
 *                                             
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=10;
		boolean result1=(num1==num2); //true
		boolean result2=(num1!=num2); //false
		boolean result3=(num1<=num2); //true
		
		// num1<num2 num1==num2
		char c1='A';
		char c2='B';
		boolean result4=(c1<c2); //true
		//***char 데이터형은 모든 연산이 수행되면 정수로 변환
		// 65 < 66
		
		float f=0.1f;
		double d=0.1;
		boolean result5=(f==d); //false
		System.out.println(result5);
		
		double f1=10.5;
		double d1=10.5;
		boolean result51=(f1==d1); //false
		System.out.println(result5);
		
		boolean b1=true;
		boolean b2=false;
		boolean result6=(b1==b2); //true
		boolean result7=(b1!=b2); //false
		
		// String 참조 => 실제 메모리에는 주소값 저장
		String s1=new String("Hello");
		//new => 새로운 메모리에 "Hello"저장
		String s2="Hello";
		String s3="Hello";
		
		
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
        boolean result8=(s1==s2); //false
        boolean result9=(s1!=s2); //true
        boolean result10=(s2==s3); //true
        boolean result11=(s2!=s3); //false  => 메모리 내용을 비교 하는게 아니라 메모리 주소를 비교하는 것 (==)
	    boolean result12=(s2.equals(s2)); // => 실제 저장된 문자열만 비교
	    
	    System.out.println("result1:"+result1);
	    System.out.println("result2:"+result2);
	    System.out.println("result3:"+result3);  //반복문이 필요한 이유
	    System.out.println("result4:"+result4);
	    System.out.println("result5:"+result5);
	    
	    String ss1="Hello";
	    String ss2="hello";
	    
	    
	    boolean result13=(ss1.equals(ss2));
	    // 로그인처리 => id 찾기 / 비밀번호 찾기
	    // id 중복체크	    
	    // 대소문자 구분 => 비교 
	    boolean result14=(!ss1.equals(ss2));
	    boolean result15=(ss1.equalsIgnoreCase(ss2));
	    // true => 대소문자 구분하지 않고 비교
	    
	    System.out.println("result13:"+result13);
	    
	    System.out.println("result14:"+result14);
	    System.out.println("result15:"+result15);
	    
	    // 비교연산자 => 숫자 (정수,실수), 문자, Boolean
	    // 문자열은 자체 라이브러리를 이용한다
	    /*
	     *   String => 클래스 (기능=>메소드) => 표준화
	     *     ex) System.out.printin()
	     *   contains() => 단어 포함 => 검색
	     *   ---------
	     *   startswith() => 시작문자열이 같은 경우
	     *   endswith()   => 파일 확장자 찾기 ex) .jpg
	     *   ------------ 서제스트
	     *   
	     *   System / String / Math ...
	     */  
	    
	    
		

	}

}

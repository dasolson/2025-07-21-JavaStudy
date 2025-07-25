/*
 * 
 *     자바에서 지원하는 프로그램 형식
 *     1. 평문 : 위에서 아래로 한문장씩 수행
 *     2. 조건문 : 상황에 따라서 동작 형식 변경
 *               ----------
 *                상황 여러개 => if를 여러개 사용
 *      => if()
 *          출력 => 브라우저 => 웹
 *         if()
 *          출력
 *     3. 반복문 : 중복 제거
 *     
 *      형식)
 *           Package package명 : 한번만 사용
 *           import => 여러개 사용이 가능    
 *           class ClassName{
 *             public static void main(String[] arg)
 *             {
 *                 // 1. 변수 선언
 *                 // 2. 변수에 초기화
 *                 // 3. 사용자 요청에 따른 처리 => 제어문
 *                 // 4. 결과 출력
 *              }
 *            }  
 *            
 *       조건문 
 *        = 단일조건문
 *           형식) if(조건문)
 *                   ---- true/false가 나오는 연산자 이용
 *                          => 부정연산자 / 비교연산자 / 논리연산자
 *                {
 *                    조건이 true일때 수행하는 문장          
 *                }
 *                false일 경우에 if문 수행하지 않고 건너뛴다
 *                => 중복이 있는 경우 
 *                 ex) 1~100
 *                       => 3배수, 5배수, 7배수 출력
 *                => if문은 독립문장
 *                   모든 if(조건)를 수행 => 속도가 느리다
 *                
 *                => 여러개 문장을 동시에 수행
 *                if(조건문)
 *                {
 *                    제어하는 문장 여러개 추가
 *                }
 *                             
 *                     
 */
public class 단일조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		
		if(a%3==0)
			System.out.println("3의 배수다");
		else if(a%5==0)
			System.out.println("5의 배수다");
		// 다중 조건문
		
		
		if(a%3==0) //수행
			System.out.println("3의 배수다");
		if(a%5==0) //수행
			System.out.println("5의 배수다");
		// 단일조건문
		
		if(a%3==0) //수행
			System.out.println("3의 배수다"); // 세미콜론은 문장을 마감한다
		    System.out.println("test"); //앞에 ;이 있기때문에 독립적으로 수행한다
		if(a%5==0) //수행
			System.out.println("5의 배수다");
		
		

	}

}

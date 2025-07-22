/*
 *   변수 식별자
 *    = 알파벳이나 한글로 시작 (한글은 권장사양 아님)
 *      => 대소문자 구분
 *    = 숫자 사용 가능
 *      => 앞에 사용 불가
 *    = 특수문자 (_. $)
 *    = 키워드 사용 불가
 *      ---- 자바에서 사용하는 단어 => 빨간색(보라색)으로 표시 
 *    = 공백 사용 불가      
 *   변수 약속
 *    = 변수는 소문자로 시작
 *    = 3~7자리를 사용
 *    = 두개의 단어 사용
 *      file_name, file_count ...
 *      fileName, fileCount ...
 *    
 *   변수 선언
 *   데이터형 변수명 = 값
 *                 -- 초기화
 *   => 선언 방식
 *      int a;
 *      a=10;
 *      => 값을 저장 후 사용 => 저장 후 사용 안하면 오류 발생
 *      
 *      값을 입력하는 방식
 *      1) 명시적
 *         int a=10
 *      2) 입력값
 *         int a=san.nextInt()
 *      3) 난수(랜덤)
 *         int a=(int)(Math.random())
 *         
 *   ----------------------------------------36p~40p    
 *   
 *     41page
 *       char => 정수형 취급
 *         ㅣ => 문자 / 정수 저장이 가능
 *       정수 형식
 *       ------
 *       0b, 0B => 이진법
 *       0 => 8진법
 *       0x => 16진법
 *       일반 숫자 => 10진법 ==>43p
 *       
 *     51page
 *       문자열 타입
 *       char : 문자 한개 저장
 *       String 변수명="값" : 문자 여러개 저장
 *       => 특수 문자 (52p)
 *          \t:tab => 일정 간격
 *          \n : new => 줄바꿈
 *          \" : " 출력
 *          \\ : \ 출력
 *  ------------------------------------------
 *     웹, 윈도우 => 모든 데이터형 문자열     
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
 * 
 * 
 */
import java.util.*;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 데이터형변환 {

	public static void main(String[] args)
	throws Exception
	
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("가수명 입력:");
		String ss=scan.next();
		
        Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements title=doc.select("table.list-wrap a.title");
        Elements singer=doc.select("table.list-wrap a.artist");
        for(int i=0;i<title.size();i++)
        {
        	String s=title.get(i).text();
        	String s1=title.get(i).text();
        	if(s1.contains(ss))
        	 System.out.println(s+"("+s1+")");
        }
        
	}
	

}

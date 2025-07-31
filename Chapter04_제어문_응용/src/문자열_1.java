/*
 *     문자열
 *     ---- 자바
 *     String => 데이터형 / 클래스형 (기능=>메소드)
 *     => 사용법
 *         String 변수명 ="문자"
 *                       --- 들어가는 내용은 제한이 없다
 *         ex) 회원 정보
 *             ------- id, pwd, name, adrress. phone, post, contant .birthday...
 *             게시물 정보
 *              no name subject contant pwd regdate hit...
 *        --> 제공해주는 기능
 *            => 메소드
 *            
 *                  변환
 *                    - toUpperCase() : 대문자 변환
 *                    - toLowerCase() : 소문자 변환
 *                      ---------------------------(사용빈도가 없다) 한글 중심이라서
 *                    - *** valueOf() : 모든 데이터형을 문자열로 변환 -> 사용빈도 높음
 *                          --------- 웹 / 윈도우 => 모든 데이터형이 String  
 *                          ex) valueOf(10) => "10" 
 *                  비교
 *                    - aquals()     : 실제 문자열 비교
 *                    - contains()   : 포함 문자열
 *                    - startswith() : 시작문자열
 *                    - endswith()   : 끝문자열 => 확장자
 *                  검색
 *                    - indexOf()     : 앞에서부터 찾아오는것
 *                    - lastindexOf() : 뒤에서부터 찾아오는것
 *                    ex)   Hello Java!!
 *                          0123456789
 *                           => indexOf("a") => 7
 *                           => lastindexOf("a") => 9
 *                           => indexOf("Java") => 6
 *                  제어
 *                    - substring() : 문자를 자르기
 *                              end-1
 *                    - split()     : 문자별 자르기
 *                    - trim()      : 공백문자 제거
 *                     ex)   Hello Java!!
 *                           0123456789
 *                            => substring(1,5) => "ello" 
 *               ---------------------------------------------
 *                            
 *                                 
 *     
 *     
 *     
 */
//  substring
import java.io.*;
import java.util.*;
public class 문자열_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String msg="Hello Java";
		// 1. 문자의 갯수 => " " => 문자
		// => length() => 결과값 int 로 나옴
		int leng=msg.length();
		System.out.println("문자 갯수:"+leng);
		// 2. 자르기
		String s=msg.substring(6);
		System.out.println(s);
		
		s=msg.substring(1, 5);
		// substring(begingIndex, endIndex)
		//                        --------  endIndex -1
		System.out.println(s);
		String name="문자열_1.java";
		//           0 123456789
		String ext=name.substring(name.indexOf(".")+1);
		
//		File dir=new File("c:\\javaDev");
//		File[] lists=dir.listFiles();
//		// ./ => 현재폴더, ../ => 디렉토리를 상위 폴더로 이동해라
//		for(File f:lists) {
//			if(f.isFile()) { //directory 로 바꾸면 폴더 가져오기
//				String ss=f.getName();
//				System.out.println(ss);
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1));
//			}
//			
//		}
		String msg1=" Hello Java!! ";
		System.out.println(msg1.length());
		String ss=msg1.trim();
		System.out.println(ss.length());
		// trim() => 공백문자 제거 => 좌우(양끝) 모든 공백 삭제
		// trim() => id, pwd, 검색, 아이디 중복체크
		// 액션 | ㅁㅁㅁ|ㅁㅁㅁㅁ => 제목, 장르 자르기 => substring
		// 서울시 마포구 서교동 => 동만 자를 경우 => substring (맛집검색...)
		// => 지역 확인 02-111-1111 => 02자르면 서울
		String msg2="Java Oracle HTML CSS JavaScript " + "JSP JQuery Ajax SpringFramework VueJS " + "SpringBoot Git GitAction Docker-Compose"
		            + "Jenkins React Next TypeScript MSA Chatting NodeJS ";
		String[] datas=msg2.split(" ");
		Scanner scan=new Scanner(System.in);
		System.out.println("단어 입력:");
		String d=scan.next();
		for(String data:datas) {
			//System.out.println(data);
			//data.startsWith(d) => 시작하는 문자 찾기
			//data.endsWith(d) => 끝나는 문자 찾기
			//data.contains(d) => 포함하는거 찾기
			//data.equals(d) => 같은거 찾기(대소문자 구분)
			//data.equalsIgnoreCase(d) => 같은거 찾기(대소문자 구분하지 않음)
			if(data.equalsIgnoreCase(d)) {
				System.out.println(data);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

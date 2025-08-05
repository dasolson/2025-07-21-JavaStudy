/*
 *     배열의 특징
 *       1) 같은 데이터형만 모아서 관리
 *          --------- 관련된 데이터만 (같은 종류)
 *          ex) 뮤직 : 노래명 / 가수 / 앨범 / 등폭 / 동영상 
 *                    ---- String ----   int  String
 *                    => 배열 5개
 *                    사과 / 배 / 수박 / 귤 => 종합과일세트
 *                    --   --   ---   --   ---------
 *                           베열              클래스
 *       2) 한번 생성하면 배열의 크기를 줄이거나 늘릴 수 없다
 *          -------------------------------------
 *            고정적 => 삭제, 추가 불가
 *            가변적 => 컬렉션 (클래스화) 
 *       3) 반드시 초기화 후 사용
 *           => 배열 선언
 *               - 어떤 데이터를 모아서 관리 할건가
 *                  > 정수
 *                     int[] 배열명;
 *                     int 배열명[];
 *                  > 실수
 *                     double[] 배열명;
 *                     double 배열명[];
 *                  > 문자열
 *                     String[] 배열명;
 *                     String 배열명[]; => C언어에서 파생
 *                  > 논리형
 *                     boolean[] 배열명;
 *                     boolean 베열명[];
 *           => 초기값   
 *               - 선언과 동시에 초기화
 *                  > int[] arr={1,2,3,4,5}
 *               - 임시로 기본값 저장
 *                  > int[] arr=new int[5]
 *               - 배열마다 데이터를 추가  
 *                  > int[] arr;
 *                    arr=new int[4];
 *                    arr[0]=1
 *                    arr[1]=2
 *                    arr[2]=3
 *                    arr[3]=4
 *                    => 일반 for
 *        4) 출력
 *           for(int i=0; i<5; i++)
 *           {
 *               => 배열의 인덱스를 이용한 출력
 *               arr[i]
 *           }
 *           
 *           for(받는 변수 : 배열명)
 *           {   ------- 배열에 실제 저장 데이터 읽기
 *               
 *           }
 *           
 *           System.out.println(Arrays.toString(배열명))
 *                
 */
import java.util.Arrays;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



        int[] arr= {1,2,3,4,5};
		System.out.println("=====일반 for=====");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=====for-each=====");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======toString======");
		System.out.println(Arrays.toString(arr));
        // 확인용
	}
	// 같은 종류의 데이터가 3개 이상이면 => 배열
	// 다른 종류의 데이터가 여러개라면 => 클래스 : 상세보기 

}

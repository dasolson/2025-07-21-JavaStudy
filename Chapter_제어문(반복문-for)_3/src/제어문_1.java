/*
 *    이차 for문 => 형식 => 동작 순서
 *    --------
 *    
 *    형식)
 *            1     2 ㅣ false =>종료
 *       for(초기값;조건식;증감식)
 *       {          ㅣ
 *                  ㅣ true
 *                 3    4 ㅣfalse --
 *                           5
 *           for(초기값;조건식;증감식) ㅣ
 *           {          ㅣ         ㅣ
 *                      ㅣ true    ㅣ
 *               실행문장 5-------
 *           }
 *       }
 *       
 *       for(int i=1;i<=5;i++) {
 *           for(int J=1;J<=5;J++) {
 *                실행문장
 *           }
 *       }
 *       
 *       i=1 ===> J=1, J=2, J=3, J=4, J=5
 *       i=2 ===> J=1, J=2, J=3, J=4, J=5
 *       i=3 ===> J=1, J=2, J=3, J=4, J=5
 *       i=4 ===> J=1, J=2, J=3, J=4, J=5
 *       i=5 ===> J=1, J=2, J=3, J=4, J=5
 *       i=6 ==> 종료
 *       
 *       1차 for => 줄수
 *       2차 for => 실제내용 출력
 *       
 *       구구단 
 *       
 *       2*1=2 3*1=3 ...9*1=9
 *       ..
 *       ..
 *       2*9   3*9   ...
 *       
 *       
 *       *****     
 *       *****     
 *       *****    
 *       ***** =>  1차 for = 7줄
 *       *****     2차 for = 5개
 *       *****
 *       *****
 *       *****
 *       
 *       
 *       
 *       
 *       
 */

public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====구구단=====");
		for(int i=1; i<=9; i++) {
			for(int J=2; J<=9; J++) {
				System.out.printf("%d * %d = %d\t", J, i, J*i);
			}
			System.out.println();
		}

	}

}

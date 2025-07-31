/*
 *     break => 반복을 종료할 때 사용
 *       ㅣ => for, while, do~while, switch
 *         => if문에서는 사용이 안된다
 *         
 *         ex)  
 *             for()
 *             {
 *                 if()
 *                    break
 *             }
 *             
 *             if()
 *             {
 *                 break; => 오류
 *             }
 *             else
 *             {
 *             }
 *             
 *            종료 => break, return, System.exit(0)
 *            
 *            특정 부분을 제외하고 프로그램 유지, 처음부터 다시 실행
 *              continue : for, while, do~while
 *               => for => 증가식이동
 *               => while => 조건식으로 이동 : 무한루프일 경우가 많다
 *               
 *            *주의할점* break, continue는 자신의 반복문에서만 가능
 *            
 *            ex)
 *                for()
 *                {
 *                    for()      ㅣ
 *                    {          ㅣ
 *                        break; ㅣ =>여기만 break
 *                    }          ㅣ
 *                }        
 *             
 *                
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				if(j==2) break;
//				System.out.println("i=" +i+ "j"+j);
//			}
//		}
		/*
		 *     i=1
		 *        j=1 j=2 j=3
		 *            ------- 출력안됨
		 *     i=2
		 *        j=1 j=2 j=3
		 *            ------- 출력안됨
		 *     i=3
		 *        j=1 j=2 j=3   
		 *            ------- 출력안됨
		 *           
		 */
		for(int i=1; i<=5; i++) {
			if(i==3 || i==4 || i==5) break;
			System.out.println(i);				
		}

	}

}

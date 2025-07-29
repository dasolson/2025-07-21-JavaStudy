/*
 *    문제 : 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
 *     
 *     for => 시작점, 끝점 ; 증가식
 *           ------------------ 
 *           ex) 
 *              [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *              ip 
 *              
 *              맛있고 맜있는 맜있니...
 *               =>맜있+ (컨테인스)
 *               ------------------------------REGEXP_LIKE(ename,"[A-Z]")
 *               enamw LIKE %A% OR
 *               enamw LIKE %B% OR
 *               enamw LIKE %C% OR
 *               ....
 *               enamw LIKE %Z% OR   
 *               -------------------------
 *               
 *      => 밑에 있는 문장 한개만 수행
 *         for()
 *          문장 => for 소속
 *         
 *         for()
 *         {
 *           문장 => for 소속
 *           문장 => for 소속
 *         }    
 *         
 *         for(int i=1...)
 *                 -- for문 안에서만 사용 가능      
 *               
 *               
 */
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++) {
//			if(i%3==0) {
//				continue; //i++ => 증가식으로 올라간다
//			}
//			System.out.print(i+" ");
//		}
		//-------------------------------------위에 필기 예시 ↓
		String[] arr= {"aaa","bbb","ccc","ddd","eee","fff","ggg","kkk"};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
        
		for(int i=0;i<9;i++) {
			System.out.println(arr[i]);
		}
		
	}

}

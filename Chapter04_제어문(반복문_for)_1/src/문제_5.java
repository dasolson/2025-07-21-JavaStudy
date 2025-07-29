/*
 *     1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 */
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0, even=0;
//		for(int i=1;i<=30;i++) {
//			sum+=i;
//			if(i%2==0) {
//				even+=i;				
//			}
//			
//		}
		//-----------------------------------
		for(int i=1;i<=30;i++) {
			if(i%2==0) {
				System.out.printf("%2d ",i);
				if(i%3==0) { 
					System.out.println();// 줄바꿈
				}
			}
		}
		

	}

}

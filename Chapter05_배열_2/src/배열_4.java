import java.util.Arrays;
/*
 *    [21, 88, 93, 69, 95]
 *     --  --
 *     21  88
 *     --      --
 *     21      93
 *     --          --
 *     21          69
 *     --              --
 *     21              95  ---- for 1 (1 Round)
 *     -------------------
 *     
 *     => 5개 데이터를 4번 수행 
 *     
 *     1 round 4바퀴 => 5
 *     2 round 3바퀴 => 5
 *         ...   ========> i + j = 5  => j=5-i
 *     
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[5];
		// 초기값
		for(int i=0; i<com.length; i++) {
			com[i]=(int)(Math.random()*100)+1; 
			   
			 
		}
		System.out.println("===== 정렬 전:");
		for(int i:com) {
			System.out.print(i + " ");
		}
		System.out.println("\n ======정렬 후:");
//		for(int i=0; i<com.length-1; i++) {
//			for(int j=i; j<com.length; j++) {
//				if(com[i]<com[j]) {  // 내림차순 올림차순 바꿀 수 있음 
//					int temp=com[i];
//					com[i]=com[j];
//					com[j]=temp;
//				}
//				
//			}
//		}
		Arrays.sort(com); // 올림차순
		for(int i:com) // (int i=com.length-1; i--) => 내림차순
		{
			System.out.print(i + " "); 
		}
		

	}

}

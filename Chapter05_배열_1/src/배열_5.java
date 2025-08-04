// 10개의 임의의 정수 저장 ==> 총합 / 평균
// 전체 데이터 for => 요청값 추출 => if => 제어문
// 데이터 저장 => 제어(제어문)
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		int[] arr=new int[10];
		// 배열 초기값
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");
		}
		// 배열의 총합 / 평균
		int sum=0;
		// 62 5 95 2 20 46 9 11 72 51 
		// for (반는 변수 : 배열명)
		for(int i:arr) // for-each : 실제 배열에 저장된 값을 순차적으로 읽는다
		{
			sum+=i;
		}
		System.out.println("\n총합:" + sum);
		System.out.printf("평균:%.2f\n", sum / 10.0); 
		
		

	}

}

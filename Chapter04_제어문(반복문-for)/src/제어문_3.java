//    변수의 사용범위 => 지역변수 : 메모리 자체에서 생성/소멸
//    {} 안에서만 사용 가능
public class 제어문_3 {
    // 다른 클래스에서 사용이 가능한 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 단점 => 다른 클래스에서 사용 불가
		{
			int a=10; {
				int b=20; {
					int c=30;
					// a,b,c
				}
				//a,b
			}
			//a
		}
		
		char c='A'; // ABCD...Z 출력
		// i는 루프변수 => i는 사용금지 권장 => m/n, a/b (필기체 사용시 헷갈리지 않고 뚜렷하게 구분 가능한것 사용)
		for(int i=0;i<=26;i++) {
//			char c='A'; // 생성 = 소멸 ...36번 (A를 26개 출력)
			System.out.print(c++);
		}

	}

}

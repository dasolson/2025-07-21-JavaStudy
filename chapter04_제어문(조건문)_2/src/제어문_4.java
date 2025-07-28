/*
 *     Math.random()
 *     ------------- 모든 메소드(기능)은 결과값을 넘겨준다
 *           ㅣ
 *        0.0~0.99 => double(x) => int(o)
 *        
 *        (int)(Math.random()*100)
 *              0.0~99.0 => 0~99
 *        -------------------- 0   
 *        (int)(math.random()*10)+1 =>1~10
 *        (char)(Math,random()*26)
 *               0~25 + 65 = 65~90
 *        ------------------------- 117p
 *               
 */
public class 제어문_4 {

	public static void main(String[] args) {
	throws Exception	
		// TODO Auto-generated method stub
     	int a=(int)(Math.random()*5)+1;
	
	    if(a==1) {
	    	System.out.println("난수 1 발생");	
	    } else if(a==2) {
	    	System.out.println("난수 2 발생");
	    }
	    //난수 => 임의로 추출
	    //        ㅣ
	    else if(a==3) {
	    	System.out.println("난수 3 발생");
	    } else if(a==4) {
	    	System.out.println("난수 4 발생");
	    } else if(a==5) {
	    	System.out.println("난수 5 발생");
	    }
	    //조건에 맞는 if문 한개만 수행
	    	
//		int a=(int)(Math.random()*45)+1;
//		int b=(int)(Math.random()*45)+1;
//		int c=(int)(Math.random()*45)+1;
//		int d=(int)(Math.random()*45)+1;
//		int e=(int)(Math.random()*45)+1;
//		int f=(int)(Math.random()*45)+1;
		
		// 단점 : 중복된 수가 발생 할 수 있다
		
//		System.out.println(a+","+b+","+c+","+d+","+e+","+f);
//		System.err.println("=== 로또 번호 ===");
//		System.out.print(a+" ");
//		Thread.sleep(500);
//		System.out.print(b+" ");
//		Thread.sleep(500);
//		System.out.print(c+" ");
//		Thread.sleep(500);
//		System.out.print(d+" ");
//		Thread.sleep(500);
//		System.out.print(e+" ");
//		Thread.sleep(500);
//		System.out.print(f);
		
		

	}

}

//   정수 한개를 입력 받아서, 그 수가 50이상의 수인지 50미만의 수인지 판단해보자

import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 1개 입력:");
//		
//		
//	    int i=scan.nextInt();
//	    
//	    if((i*10)>=50) {
//	    	System.out.println("50이상입니다");
//	    } else if((i*10)<=50)
//	    	System.out.println("50미만입니다");
//	    else {
//	    	System.out.println("오류입니다");
//	    }
	    int num=(int)(Math.random()*100)+1;
	    //1~100 사이 정수
	    System.out.println("num="+num);
	    if(num>=50) {
	    	System.out.println(num+"는(은) 50이상인 수");
	    }
	    else
	    	System.out.println(num+"는(은) 50이하인 수");
	    	
	    	

	}

}

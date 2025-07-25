// => 컴퓨터와 가위 바위 보
/*
 *     경우의 수
 *      컴퓨터 (가위 0)
 *         = 사용자 (가위 0)
 *         = 사용자 (바위 1)
 *         = 사용자 (보 2)
 *      컴퓨터 (바위 1)
 *         = 사용자 (가위 0)
 *         = 사용자 (바위 1)
 *         = 사용자 (보 2)
 *      컴퓨터 (보 2)
 *         = 사용자 (가위 0)
 *         = 사용자 (바위 1)
 *         = 사용자 (보 2)   
 */
import java.util.Scanner;
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("가위(0),바위(1),보(2):");
        int user=scan.nextInt();
        if(user>2)
        	user=0;
        //컴퓨터
        int com=(int)(Math.random()*3);
        
        // 사용자 / 컴퓨터 
        if(com==0)
        	System.out.println("컴퓨터:가위");
        if(com==1)
        	System.out.println("컴퓨터:바위");
        if(com==2)
        	System.out.println("컴퓨터:보");
        if(user==0)
        	System.out.println("사용자:가위");
        if(user==1)
        	System.out.println("사용자:바위");
        if(user==2)
        	System.out.println("사용자:보");
        
        // 결과값
        System.out.println("======결과=====");
        int result=com-user;
        if(result==-1 || result==2)
           System.out.println("User win");
        if(result==1 || result==-2)
           System.out.println("Computer win");
        if(result==0)
           System.out.println("비겼다");   
           

//        if(com==0) //가위 com-user
//        {
//        	if(user==0)
//        		System.out.println("비겼다");
//        	if(user==1)
//        		System.out.println("user win");
//        	if(user==2)
//        		System.out.println("Computer win");
//        }
//        if(com==1) // 바위
//        {
//        	if(user==0)
//        		System.out.println("Computer win");
//        	if(user==1)
//        		System.out.println("비겼다");
//        	if(user==2)
//        		System.out.println("user win");
//        }
//        if(com==2) //보
//        {
//        	if(user==0)
//        		System.out.println("user win");
//        	if(user==1)
//        		System.out.println("Computer win");
//        	if(user==2)
//        		System.out.println("비겼다");
//        }
        
        
        
	}

}

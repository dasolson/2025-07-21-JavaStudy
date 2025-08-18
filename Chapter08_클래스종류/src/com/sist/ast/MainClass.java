package com.sist.ast;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		// 추상클래스는 메모리 할당이 불가 (new 사용 금지)
		/*
		 *     추상 클래스 
		 *        1. 각 사이트에 공통적으로 사용되는 데이터
		 *        2. 기능 : 공통적으로 적용되는 기능
		 *            = 다른 내용을 구현 : 추상 메소드 사용
		 *                              => 선언만 된다
		 *                              => 반드시 상속 후 처리
		 *               => 상속시 따로 따로 구현
		 *            = 같은 내용을 구현 : 일반 메소드 사용
		 *            
		 *        형식)
		 *             public abstract class ClassName
		 *             {
		 *                 //선언된 메소드 : 기능은 같은데 구현내용이 다를때
		 *                     public abstract 리턴형 메소드명(매개변수...);
		 *                     => 반드시 구현을 해야한다
		 *                 // 구현된 메소드    
		 *                     public 리턴형 메소드명(매개변수...) 
		 *                     {
		 *                     }
		 *                     => 필요에 따라 => 오버라이딩으로 사용
		 */
        MusicClass mc=new Melon();
        mc.musicAllData();
        mc.musicPrint();
        mc.musicFind("노래");
        
        mc=new GenieMusic();
        mc.musicAllData();
        mc.musicPrint();
        mc.musicFind("노래");
	}

}


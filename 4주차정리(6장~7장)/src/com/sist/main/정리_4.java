package com.sist.main;
import java.util.*;
class GenieMusic {
	public void dataIn() {
		System.out.println("지니뮤직 크롤링");
	}
	public void list() {
		System.out.println("목록 출력");
	}
	public String titleFind(String fd) {
		System.out.println("제목으로 검색");
		return fd;
	}
	// 가수 찾기 / 상세보기 / 동영상
}
class Melon extends GenieMusic {
	public void dataIn() {
		System.out.println("멜론뮤직 크롤링");
	}
}
public class 정리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ArrayList<String> list=new ArrayList<String>();
//        list.add("홍길동"); //list.get(0)
//        list.add("심청이"); // list.get(1)
//        list.add("박문수"); // list.get(2)
//        list.add(100);
//        String name=list.get(0); // 강제 형변환 (앞에 데이터형을 붙이지 않으면 오류)
	}

}

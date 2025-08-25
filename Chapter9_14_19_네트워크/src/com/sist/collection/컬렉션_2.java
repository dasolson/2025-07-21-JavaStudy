package com.sist.collection;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *     Set<String>
 *     List<Integer> list<int>
 *                   --------- 오류
 *     Map<String, Object>
 *     ------------------- 
 *                   | new A() , new B() 
 *    -------------------------------------
 *     => key , value
 *        ----------- properties, xml, json
 *                    ---------------------
 *                    xml => spring-boot : yml
 *                    
 *                    
 *          driver=oracle...                            
 */
import java.util.*;

public class 컬렉션_2 {
    public static Set<String> genieMusic() {
    	Set<String> set=new HashSet<>();
    	try {
    		for(int k=1; k<=2; k++) {
    			
    		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250825&hh=17&rtm=Y&pg="+k).get();
    		Elements title=doc.select("table.list-wrap a.title");
    		    for(int i = 0; i < title.size(); i++) {
    			String t=title.get(i).text();
    			set.add(t);
    		    }
    		}
    	}catch(Exception ex) {}
    	return set;
    }
    public static Set<String> melonMusic() {
    	Set<String> set=new HashSet<>();
        try {
    		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
    		Elements title=doc.select("div.wrap_song_info div,rank01 a");
    		for(int i = 0; i < title.size(); i++) {
    			set.add(title.get(i).text());
    		}
    	}catch(Exception ex) {}
    	return set;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ArrayList list=new ArrayList();
//        list.add("aaa");
//        list.add('A');
//        list.add(10);
//        list.add(10.5);
//        list.add(10.5F);
//        list.add(10L);
//        list.add(10);
//        list.add(10.5);
//        list.add("aaa");
//        list.add('A');
//        list.add(10);
        // 데이터형이 달라서 for 불가능
        // 데이터형을 통일 하기 위해 제네릭 써라
		/*
		 *     T => 임의의 클래스형 (type)
		 *     E => 컬렉션 요소 (Element)
		 *     K => Key
		 *     V => Value
		 *     N => Number
		 *     ? => 와일드 카드
		 *     
		 *           ex) <? extends Number> => 숫자와 관련된것 만 가능, 데이터형 한정
		 *           
		 *     ==> 타입의 안정화 / 재사용성이 뛰어나다
		 *     ==> C#, 파이썬, TypeScript
		 *     
		 *      class BoardVO
		 *       => interface BoardVO     
		 */
		Set<String> genie=genieMusic();
		int i=1;
		System.out.println("===== 지니 뮤직 top100 =====");
		for(String title:genie) {
			System.out.println(i + "." + title);
			i++;
		}
		System.out.println("===== 멜론 뮤직 top100 =====");
		i=1;
		Set<String> melon=melonMusic();
		for(String title:melon) {
			System.out.println(i + "." + title);
			i++;
		}
		// 지니 뮤직에만 있는 노래(차집합) => removeAll
		System.out.println("===== 노래명(교집합) =====");
		// removeAll ===> 오라클 : minus
		//Set<String> genie
		//genie.removeAll(melon);
		//melon.removeAll(genie);
		//genie.retainAll(melon);
		// [1,2,3,4,5].removeAll([3,4,5]) => 1,2
		System.out.println("===== Set에 있는 데이터 List 이동 =====");
		//List<String> list=new ArrayList<String>(genie);
		// Set => List로 데이터 이동
		// list.addAll(genie)
		List<String> list=new ArrayList<>();
		list.addAll(genie);
		i=1;
		for(String title:list) {
			System.out.println(i + "." + title);
			i++; 
		}
		System.out.println("===== 지니뮤직 top 10 =====");
		List<String> top=list.subList(0, 10);
		i=1;
		for(String title:top) {
			System.out.println(i + "." + title);
			i++; 
		}  
	}

}






















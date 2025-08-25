package com.sist.set;
/*
 *     Set
 *      | 
 *      ------------------
 *      |                |
 *   HashSet          TreeSet
 *   -------
 *   중복 제거 
 *   
 *     1) 특징 
 *         - 순서가 없다(인덱스 번호가 없다)
 *           일반 for 사용 불가 => forEach, Iternater
 *         - 데이터 중복을 허용하지 않는다
 *         - 주로 => ArrayList 에 있는 데이터중에 중복 제거
 *         - 구현된 클래스
 *            HashSet / TreeSet
 *     2) 주요 기능
 *         - 데이터 저장 : add()
 *         - 데이터 삭제 : remove()
 *         - 데이터 읽기 : get()
 *         - 저장된 데이터 갯수 : size()
 *         - 전체 삭제 : clear()
 *         - 존재 여부 : isEmpty()  
 *         
 *         ex) ArrayList => Set => ArrayList
 *                           |     ---------
 *                           |     중복 제거된 리스트
 *                         Cookie => MyBatis => Spring
 *                         (중복을 허용하지 않는다)         
 *                                 
 */
import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet set=new HashSet();
        // 데이터 추가 => 중복된 데이터는 제외
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("참외");
        set.add("귤");
        set.add("망고");
        set.add("사과");
        set.add("배");
        System.out.println("과일 갯수:" + set.size());
        for(Object obj:set) {
        	System.out.println(obj);
        }
        System.out.println("========== 삭제 ============");
        // CRUD = 추가 / 읽기 / 수정 / 삭제
        set.remove("배");
        System.out.println("과일 갯수:" + set.size());
        for(Object obj:set) {
        	System.out.println(obj);
        }
        System.out.println("========== 전체 삭제 ============");
        set.clear();
        System.out.println("과일 갯수:" + set.size());
        for(Object obj:set) {
        	System.out.println(obj);
        }
        
        if(set.isEmpty()) {
        	System.out.println("과일이 없다");
        }
        else {
        	System.out.println("과일이 있다");
        } 
        // 단점 : 객체 단위 저장시 => 같은 이름이 있는 경우에는 제거 할 수 없다 
        // JSP(x), Servlet(x), Spring(x)
        // websocket(o)
        // 오라클에 존재하기 때문에 Set 잘 안씀 => TreeSet
	}

}
































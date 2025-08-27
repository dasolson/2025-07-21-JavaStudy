package com.sist.io;
/*
 *     객체 스트림 : 저장 => 객체의 주소값 저장
 *        ObjectOtputStream / ObjectInputStream
 *        
 */
import java.util.*;
import java.io.*;
public class 입출력_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Sawon> list=new ArrayList<Sawon>();
        list.add(new Sawon(1,"홍길동","개발부","사원","서울",3000));
        Sawon s=new Sawon();
        s.setSabun(2);
        s.setName("심청이");
        s.setDept("기획부");
        s.setJob("과장");
        s.setLoc("부산");
        s.setPay(4500);
        list.add(s);
        list.add(new Sawon(3,"이순신","자재부","대리","제주",4000));
        list.add(new Sawon(4,"강감찬","총무부","사원","서울",3000));
        list.add(new Sawon(5,"박문수","영업부","부장","강원",6000));
        list.add(new Sawon(6, "춘향이","경영부","과장","경기",4500));
        
        try {
        	File file=new File("c:\\upload\\sawon.txt");
        	if(!file.exists()) {
        		file.createNewFile();
        	}
        	FileOutputStream fos=new FileOutputStream(file);
        	// 객체단위 변환
        	ObjectOutputStream oos=new ObjectOutputStream(fos);
        	oos.writeObject(list);
        	oos.close();
        	fos.close();
        	System.out.println("객체 저장 완료");
        }catch(Exception ex) {}
        
	}

}

























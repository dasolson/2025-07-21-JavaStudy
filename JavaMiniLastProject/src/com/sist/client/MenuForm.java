package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class MenuForm extends JPanel{
    JButton b1=new JButton("홈");
    JButton b2=new JButton("도서검색");
    JButton b3=new JButton("뉴스");
    JButton b4=new JButton("게시판");
    JButton b5=new JButton("채팅");
    JButton b6=new JButton("마이페이지");
    JButton b7=new JButton("나가기");
    
    public MenuForm() {
    	setLayout(new GridLayout(1,7,5,5));
    	add(b1); add(b2); add(b3);
    	add(b4); add(b5); add(b6); add(b7);
    	
    }
    
}

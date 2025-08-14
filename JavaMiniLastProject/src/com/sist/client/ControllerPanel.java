package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class ControllerPanel extends JPanel{
    HomeForm hf=new HomeForm();
    ChatForm cf=new ChatForm();
    BoardList bf=new BoardList();
    CardLayout card=new CardLayout(); // 화면 묶음
    public ControllerPanel() {
    	setLayout(card);
    	add("HF", hf); // 화면 출력 순서
    	add("CF", cf);
    	add("BF", bf);
    	
    }
    
}

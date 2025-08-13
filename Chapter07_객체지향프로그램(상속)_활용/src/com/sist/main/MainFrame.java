package com.sist.main;
/*
 *   상속 안됨 =  라이브러리 => java.lang => String, System, Math...final
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.*;
import com.sist.commons.*;
// 상속 = 확장
/*
 *     1. 확장을 해서 새로운 클래스 => 상속
 *     2. 있는 그대로 사용 => 포함
 *     3. 공통으로 사용되는 기능 => 패키지 : 기능을 모아서 관리 
 *                                   -------------- 공통 모듈
 *     4. 시작과 동시에 처리하는 내용 : 생성자
 *        ------------- 데이터베이스 드라이버 등록
 *                      네트워크 서버 구동
 *    * 웹에서는 명시적인 초기화가 많다 
 *             ----------
 *             int page=1 / String fd="맛집"      
 *             
 *     implements ItemListener
 *     ---------- 만들어서 써                                                 
 */
public class MainFrame extends JFrame implements ItemListener {
    // 시작과 동시에 기능 구현 => 생성자
	JComboBox box=new JComboBox();
	JLabel la=new JLabel();
	// has-a : 포함 클래스 => 제공하는 내용만 사용
	public MainFrame() {
		// south, North, West, East, Center
		/*
		 *     => BorderLayout : JFrame
		 *     => FlowLayout : 일자 배치
		 *     => GridLayout : 계산기, 퍼즐...동일 크기
		 *     => 사용자가 좌표점*** => CSS
		 */
		box.addItem("1번 이미지"); // 선택박스 0번
		box.addItem("2번 이미지"); // 1번
		box.addItem("3번 이미지"); // 2번
		Image img=Commons.getImage(new ImageIcon("c:\\javaDev\\m1.jpg"), 800, 430);
		la.setIcon(new ImageIcon(img)); // 이미지 올리기
		add("North", box); // 윈도우에 올린다
		add("Center", la);
		setSize(800, 600);
		setVisible(true); 
		box.addItemListener(this); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=new MainFrame();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			int index=box.getSelectedIndex();
			Image img=Commons.getImage(new ImageIcon("c:\\javaDev\\m"+(index+1)+".jpg"), 800, 430);
			la.setIcon(new ImageIcon(img)); 
		}
		
	}

}








 




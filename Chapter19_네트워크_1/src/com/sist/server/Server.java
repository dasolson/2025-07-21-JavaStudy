package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;
/*
 *     쓰레드 => 프로그램 1개에서 여러개 메소드가 동시 호출되게 만드는것
 *     ---- 메소드 호출
 *          접속자마다 따로 서버가 동작을 해야한다(멀티쓰레드)
 *          
 *     서버
 *       1. 대기 소켓을 생성 SetvetSocket
 *          - bind => ip/ port 연결
 *                        ---- 연결 선
 *                    -- 전화번호
 *                  => 유심
 *          - listen => 대기          
 *       2. 접속시 처리
 *          - 쓰레드로 처리
 *          - accept() : 클라이언트가 접속시에만 호출
 *            -------- 클라이언트 정보 저장
 *       ----------------------------------------
 *       3. 클라이언트와 통신
 *          - case   
 *                 
 */
public class Server implements Runnable{
	private ServerSocket ss; // 대기 소켓, 교환 소켓
	private final int PORT=3355;
	// 접속자 저장 공간 => 동기화 
	private Vector<Client> waitVc=new Vector<Client>();
	// 1. 서버 가동 => 대기 상태 (접속시까지 기다린다)
	public Server() {
		try {
			ss=new ServerSocket(PORT); // default 50명
			System.out.println("Server Start...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	// 2. 접속시에 처리 => 쓰레드로 처리		
    public void run() {
    	// 쓰레드 동작을 구현하는 메소드
    	try {
    		while(true) {
    			Socket s=ss.accept();
    			// 접속자의 IP / PORT
    			Client client=new Client(s);
    			// 접속자와 통신을 시작
    			client.start();
    		}
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}
	class Client extends Thread{
		// 접속자 정보 받기
		String id, name, address, pos;
	    Socket s;
	    BufferedReader in; // 접속자 요청
	    // HttpSevletRequest
	    OutputStream out; // 접속자 요청 처리에 대한 응답
	    // HttpSevletResponse
	    public Client(Socket s) {
	    	try {
	    		this.s=s;
	    		in=new BufferedReader(new InputStreamReader(s.getInputStream()));
	    		out=s.getOutputStream();
	    	}catch(Exception ex) {}
	    }
	    // 실제 통신
	    public void run() {
	    	try {
	    		// 100|id|name|address
	    		while(true) {
	    			String msg=in.readLine();
	    			// 클라이언트로부터 받은 값
	    			System.out.println("Client 전송값 =>" + msg);
	    			StringTokenizer st=new StringTokenizer(msg, "|");
	    			int protocol=Integer.parseInt(st.nextToken());
	    			
	    			switch(protocol) {
	    			case Function.LOGIN:{
	    				// 정보를 받는다
	    				id=st.nextToken();
	    				name=st.nextToken();
	    				address=st.nextToken();
	    				pos="대기실";
	    				
	    				// 현재 접속된 모든 Client 에 전송
	    				messageAll(Function.LOGIN + "|" + id + "|" + name + "|" + pos );
	    				// 입장 메세지 전송
	    				messageAll(Function.WAITCHAT + "|[" + "알림 ->]" + name + "님 입장하셨습니다|red");
	    				// 로그인 되는 사람 => 정보 받기
	    				// 1. 로그인창 => 대기실창으로 변경
	    				messageTo(Function.MYLOG + "|" + id + "|" + name);
	    				// 2. 이미 접속한 사람 정보를 전송
	    				for(Client c:waitVc) {
	    					messageTo(Function.LOGIN + "|" + c.id + "|" + c.name + "|" + c.pos );
	    				}
	    				// 3. 개설된 방 정보 전송
	    			}
	    			break;
	    			}
	    		}
	    	}catch(Exception ex) {}
	    }
	    // 기능 => 전송하는 방법
	    public synchronized void messageTo(String msg) {
	    	try {
	    		out.write((msg + "\n").getBytes());
	    	}catch(Exception ex) {}
	    }
        public synchronized void messageAll(String msg) {
	    	try {
	    		for(Client client:waitVc) {
	    			client.messageTo(msg);
	    		}
	    	}catch(Exception ex) {}
	    }
	    
	}

}







































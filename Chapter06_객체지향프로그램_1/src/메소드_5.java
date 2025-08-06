// 암호화 => encoding => 복구 decoding
// 시저스암호화 => 3칸 이동 ABC => DEF  요즘 암호화 => ed4559  이전에는 rsa사용
// https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDIHCAEQABiABDINCAIQABiDARixAxiABDIKCAMQABixAxiABDINCAQQABiDARixAxiABDIKCAUQABixAxiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABNIBCTMxMzVqMGoxNagCALACAA&sourceid=chrome&ie=UTF-8

// try-catch => 에러 복구
// throws Exception => 

import java.net.*;
public class 메소드_5 {
    static String encoder(String s) throws Exception
    {
    	return URLEncoder.encode(s, "UTF-8");
    }
    static String decoder(String s) throws Exception
    {
    	return URLDecoder.decode(s, "UTF-8");
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		String s="자바";
//		String en=URLEncoder.encode(s, "UTF-8");
//		System.out.println(en);
//		String ko=URLdecoder.decode(s, "UTF-8");
//		System.out.println(ko);
		int a=10;
		int b=0;
		try		
		{
			System.out.println(a/b);
		}catch(Exception e) {}
		
		System.out.println("프로그램 종료");
		
	}

}

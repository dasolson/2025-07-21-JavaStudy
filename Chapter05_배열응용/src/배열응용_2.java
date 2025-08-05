// 서울 여행
import java.io.*;
import java.util.*;
public class 배열응용_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//1. 데이터를 저장 => 메모리(배열)
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1), 자연(2):");
		int type=scan.nextInt();
		
		String filename=" ";
		int rows=0;
		if(type==1) {
			filename="c:\\javaDev\\seoul_location.txt";
			rows=273;
		} else {
			filename="c:\\javaDev\\seoul_nature.txt";
			rows=110;
		}
		// 저장
		String[] numbers=new String[rows];
		String[] names=new String[rows];
		String[] contents=new String[rows];
		String[] address=new String[rows];
		
		FileReader fr=new FileReader(filename);
		StringBuffer sb=new StringBuffer();
		int i=0;
		
		while((i=fr.read())!=-1) {
			sb.append((char)i);
		}
		fr.close();
		
		String seoul=sb.toString();
		
//		System.out.println(seoul);
		i=0;
		String[] seoul_temp=seoul.split("\n");
		for(String s:seoul_temp) {
			String[] datas=s.split("\\|");
			numbers[i]=datas[0];
			names[i]=datas[1];
			contents[i]=datas[2];
			address[i]=datas[3];
			
			i++;
			
		}
		//출력
		for(String ss:names) {
			System.out.println(ss);
		}
		

	}

}

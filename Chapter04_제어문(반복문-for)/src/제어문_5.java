//로또 번호 6개 출력
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			int lotoo=(int)(Math.random()*45)+1;
			Thread.sleep(1000);
			System.err.print(lotoo+" ");
		}
        
	}

}

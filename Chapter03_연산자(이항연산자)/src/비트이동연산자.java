/*
 *     80p
 *     //비트이동연산자
 *       << 왼쪽이동, >>오른쪽이동
 *       
 *       
 *       4<<2 (4를 왼쪽으로 2만큼 이동해라) ==16 ==> 0을 두개 붙인다
 *        x<<y == x*2^y
 *       4>>2                         ==1  ==> 0을 두개 제거
 *        x>>y == x/2^y =>4/4=1
 * 
 *       100 -> 10000 -> 16
 *             168421  
 *       100 -> 1
 *       
 *  
 *       
 *        27<<2 => 1 1 0 1100 => 108
 *       (11011)   6432168421
 *       
 *       6>>2 => 1
 *       (110) 
 *       
 *       x>>y
 *          -
 *          뒤에서 y만큼 버린다
 *       x<<y
 *          -
 *          뒤에 y만큼 채워라   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));
		System.out.println(27<<2);
		System.out.println(27>>2);
		System.out.println(6<<2);
		System.out.println(6>>2);
		

	}

}

package ex;

public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 5;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("===SWAP Before&After==");
		// 변수 값 Swap
		// 임시변수 tmp
		int tmp = x; // -> tmp = 10
		x = y;  // -> x = 5
		y = tmp; // -> y = 10
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}

package ex;

public class Ex2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "www.codechobo.com";
		float f1 = .10f; // 실수형태로 6자리까지 출력
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // %n: 줄바꿈을 의미
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);
		System.out.printf("[123456678901234567890]%n");
		System.out.printf("[%s]%n", url); // %s: (양수:앞 공백 - 음수: 뒷 공백)
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
	}

}

/*===========================
+++++지역변수와 전역변수+++++
-지역변수의 초기화 테스트
=============================
◎ Test068.java
===========================*/

// Test069.java와 비교

// ※ 지역변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
//    (자바가 자동으로 초기화를 수행해주거나 하지 않음)


public class Test068
{
	public static void main(String[] args)
	{
		// 지역변수 선언 (main 메소드 안에서만 가능)
		// 선언 후 초기화 과정을 거치지 않은 상태
		int a;
		boolean b;

		// 지역변수 a에 접근해서 그 값을 출력하고자 하는 구문
		// error: variable a might not have been initialized
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
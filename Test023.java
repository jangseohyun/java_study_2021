/*==================================
++++++++++연산자(Operator)++++++++++
- 비트 단위 연산자
====================================
◎ Test023.java
==================================*/


public class Test023
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		int a=13, b=7;
		int c, d, e;

		// 연산 및 처리(비트 단위 연산)
		c = a & b;
		d = a | b;
		e = a ^ b;

		// 결과 출력
		System.out.printf("a & b = %d\n", c);
		System.out.printf("a | b = %d\n", d);
		System.out.printf("a ^ b = %d\n", e);
	}
}

/*
	a = 13 → 00001101
  &	b = 6  → 00000111
 ---------------------
			  00000101 → 1 + 4 = 5

	a = 13 → 00001101
  |	b = 7  → 00000111
 ---------------------
			  00001111 → 1 + 2 + 4 + 8 = 15
			
	a = 13 → 00001101
  ^	b = 7  → 00000111
 ---------------------
			  00001010 → 2 + 8 = 10
*/


/*
[실행 결과]
a & b = 5
a | b = 15
a ^ b = 10
계속하려면 아무 키나 누르십시오 . . .
*/
/*=====================================
+++++++++++++변수와 자료형+++++++++++++
-변수와 자료형 실습 및 테스트: char
=======================================
◎ Test008.java
=====================================*/


public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;

		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';
		ch3 = '대';
		a = (int)'A';	// 자동 형 변환이 되나 명시적 형 변환을 써주는 것이 바람직함

		// 결과 출력
		System.out.println("ch1: "+ch1);
		System.out.println("ch2: "+ch2);	// 개행
		System.out.println("ch3: "+ch3);
		System.out.println("a: "+a);		// 아스키코드
	}
}


/*
[실행 결과]
ch1: A
ch2:

ch3: 대
a: 65
계속하려면 아무 키나 누르십시오 . . .
*/
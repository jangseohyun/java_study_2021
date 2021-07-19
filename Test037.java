/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- if~else문 실습
====================================
◎ Test037(036-2).java
==================================*/

// 사용자로부터 임의의 정수를 세 개 입력받아
// 작은 수부터 큰 수 순으로 출력하는 프로그램을 구현한다.
// 단, 입력 데이터를 한 번에 처리할 수 있도록 구성하며 (Scanner 사용)
// 『xor』 연산자를 활용하여 스왑 처리를 할 수 있도록 한다.

// 실행 예시
// 임의의 세 정수 입력(공백 구분):  25 13 27
// >> 정렬 결과: 13 25 27
// 계속하려면 아무 키나 누르십시오 . . .


import java.util.Scanner;


public class Test037
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 세 정수 입력(공백 구분): ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int temp;

		if (a > b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if (b > c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		if (a > b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		System.out.printf(">> 정렬 결과: %d %d %d\n", a, b, c);
	}
}

/*
[강사님 풀이]
if (a > b)
{
	a = a^b; b = b^a; a = a^b;
}
if (b > c)
{
b = b^c; c = c^b; b = b^c;
}
if (a > b)
{
a = a^b; b = b^a; a = a^b;
}
*/


/*
[실행 결과]
임의의 세 정수 입력(공백 구분): 25 13 27
>> 정렬 결과: 13 25 27
계속하려면 아무 키나 누르십시오 . . .
*/
/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- if~else문 실습
====================================
◎ Test036.java
==================================*/

// 사용자로부터 임의의 정수를 세 개 입력받아
// 작은 수부터 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예시
// 첫 번째 정수 입력: 45
// 두 번째 정수 입력: 81
// 세 번째 정수 입력: 13
// >> 정렬 결과: 13 45 81
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력: ");
		int c = Integer.parseInt(br.readLine());

		if (a < b && a < c)
		{
			if (b < c)
				System.out.printf(">> 정렬 결과: %d %d %d\n", a, b, c);
			else if (c < b)
				System.out.printf(">> 정렬 결과: %d %d %d\n", a, c, b);
		}
		else if (b < a && b < c)
		{
			if (a < c)
				System.out.printf(">> 정렬 결과: %d %d %d\n", b, a, c);
			else if (c < a)
				System.out.printf(">> 정렬 결과: %d %d %d\n", b, c, a);
		}
		else if (c < a && c < b)
		{
			if (a < b)
				System.out.printf(">> 정렬 결과: %d %d %d\n", c, a, b);
			else if (b < a)
				System.out.printf(">> 정렬 결과: %d %d %d\n", c, b, a);
		}
	}
}

/*
[강사님 풀이]
int a, b, c;	//--사용자가 입력하는 임의의 정수를 담을 변수
int temp;		//--임시 저장 변수(빈 컵)

// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
//       | 2 1 3         | 1 2 3
//       | 1 2 3

if (a > b)		//--① 첫 번째 정수가 두 번째 정수보다 크다면
{
	// 두 정수(a, b)의 자리를 바꾼다
	temp = a;
	a = b;
	b = temp;
}
if (b > c)		//--② 두 번째 정수가 세 번째 정수보다 크다면
{
	// 두 정수(b, c)의 자리를 바꾼다
	temp = b;
	b = c;
	c = temp;
}
if (a > b)		//--③ 첫 번째 정수가 두 번째 정수보다 크다면 (다시 a와 b를 비교해야 함)
{
	// 두 정수(a, b)의 자리를 바꾼다
	temp = a;
	a = b;
	b = temp;
}
System.out.printf(">> 정렬 결과: %d %d %d", a, b, c);
*/


/*
[실행 결과]
첫 번째 정수 입력: 45
두 번째 정수 입력: 81
세 번째 정수 입력: 13
>> 정렬 결과: 13 45 81
계속하려면 아무 키나 누르십시오 . . .
*/
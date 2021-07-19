/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (while문) 실습
====================================
◎ Test052.java
==================================*/

// 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수까지의 전체 합, 짝수의 합, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예시
// 임의의 정수 입력: 284
// >> 1 ~ 284 까지 정수의 합: xxxx
// >> 1 ~ 284 까지 짝수의 합: xxxx
// >> 1 ~ 284 까지 홀수의 합: xxxx
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test052
{
	public static void main(String[] args) throws IOException
	{
		int a = 0, n = 0;
		int sum1=0, sum2=0, sum3=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력: ");
		a = Integer.parseInt(br.readLine());

		while (n <= a)
		{
			sum1 += n;
			if (n % 2 == 0)
				sum2 += n;
			else
				sum3 += n;
			n++;
		}

		System.out.printf(">> 1 ~ %d 까지 정수의 합: %d\n", a, sum1);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합: %d\n", a, sum2);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합: %d\n", a, sum3);
	}
}


/*
[실행 결과]
임의의 정수 입력: 284
>> 1 ~ 284 까지 정수의 합: 40470
>> 1 ~ 284 까지 짝수의 합: 20306
>> 1 ~ 284 까지 홀수의 합: 20164
계속하려면 아무 키나 누르십시오 . . .
*/
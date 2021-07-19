/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (while문) 실습
====================================
◎ Test046.java
==================================*/

// 1부터 100까지 정수의 합: xxx
// 1부터 100까지 짝수의 합: xxx
// 1부터 100까지 홀수의 합: xxx
// 계속하려면 아무 키나 누르십시오 . . .


public class Test046
{
	public static void main(String[] args)
	{
		int n = 1;
		int sum1 = 0, sum2 = 0, sumTot = 0;

		while (n <= 100)
		{
			sumTot += n;
			if (n % 2 == 0)
			{
				sum2 += n;
			}
			n++;
		}

		sum1 = sumTot - sum2;

		System.out.println("1부터 100까지 정수의 합: "+sumTot);
		System.out.println("1부터 100까지 짝수의 합: "+sum2);
		System.out.println("1부터 100까지 홀수의 합: "+sum1);
	}
}


/*
[강사님 풀이]
// ○ 주요 변수 선언
int n=1, sum=0, even=0, odd=0;
// int n=1, sum, even, odd;
// sum=even=odd=0

// ○ 연산 및 처리(반복문 선언)
while (n <= 100)
{
	// 연산 수행
	// ① sum을 1만큼 증가시켜라
	sum += n;

	// ② n이 짝수일 경우: even을 n만큼 증가시켜라
	if (n % 2 == 0)
	{
		even += n;
	}

	// ③ n이 홀수일 경우: odd를 n만큼 증가시켜라
	else
	{
		odd += n;
	}

	n++;
}

// ○ 결과 출력
System.out.println("1부터 100까지 정수의 합: "+sum);
*/


/*
[실행 결과]
1부터 100까지 정수의 합: 5050
1부터 100까지 짝수의 합: 2550
1부터 100까지 홀수의 합: 2500
계속하려면 아무 키나 누르십시오 . . .
*/
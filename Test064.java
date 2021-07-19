/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- break
====================================
◎ Test064.java
==================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1~1000 범위 안에서만 가능하도록 작성한다.

// 실행 예시
// 임의의 정수 입력(1~1000): -10
// 임의의 정수 입력(1~1000): 0
// 임의의 정수 입력(1~1000): 2021
// 임의의 정수 입력(1~1000): 10
// >> 1 ~ 10 까지의 합: 55
// 계속하시겠습니까? (Y/N): y

// 임의의 정수 입력(1~1000): 100
// >> 1 ~ 100 까지의 합: 5050
// 계속하시겠습니까? (Y/N): n
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;			//--임의의 정수를 입력받을 변수
		int c;			//--y/n를 System.in.read()로 입력받을 변수
		int sum = 0;	//--합을 담을 변수 sum
		
		while (true)	//--'y'를 입력받으면 다시 반복할 수 있도록 while문 안에 작성
		{
			do
			{
				System.out.print("임의의 정수 입력(1~1000): ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 1000);	//--1~1000 범위 내의 정수를 입력받지 못하면 반복

			for (int i=1; i<=n; i++)	//--1~1000 범위 내의 정수를 입력받으면 1~n까지의 합을 구함
				sum += i;

			System.out.printf(">> 1 ~ %d 까지의 합: %d\n", n, sum);
		
			System.out.print("계속하시겠습니까? (Y/N): ");
			c = System.in.read();		//--값을 아스키코드로 받아옴
			System.in.skip(2);

			if (c == 121)		//--y
			{
				sum = 0;				//--값이 이미 저장되어 있으니 sum 초기화
				System.out.println();	//--보기 편하게 개행
			}
			else if (c == 110)	//--n
			{
				System.out.println();	//--보기 편하게 개행
				break;
			}
		}
	}
}

/*
[강사님 풀이]
int n, s;		//--사용자 입력값, 누적합
char ch;		//--계속 여부 입력값

while (true)	//--무한 루프(반복)
{
	do
	{
		System.out.print("임의의 정수 입력(1~1000): ");
		n = Integer.parseInt(br.readLine());
	}
	while (n < 1 || n > 1000)	//--반복을 수행할 조건
	
	s = 0;	//--s 초기화
	
	for (i=1; i<=n; i++)
		s += i;

	System.out.printf(">> 1 ~ %d 까지의 합: %d\n", n, s);

	System.out.print("계속하시겠습니까? (Y/N): ");
	ch = (char)System.in.read();	//--ch + \r + \n
	
	if (ch!= 'y' && ch!='Y')	//--SCE
	{
		// 반복문 → 『while(true)』을 빠져나갈 수 있는 코드 작성 필요
		// 위와 같은 의사 표현을 했다면
		// 그동안 수행했던 반복문을 멈추고 빠져나가야 한다
		break;
		// 멈춘다 (+그리고 빠져나간다)
	}
	System.in.skip(2);
}	//--end while
*/


/*
[실행 결과]
임의의 정수 입력(1~1000): 10
>> 1 ~ 10 까지의 합: 55
계속하시겠습니까? (Y/N): y

임의의 정수 입력(1~1000): 10
>> 1 ~ 10 까지의 합: 55
계속하시겠습니까? (Y/N): n

계속하려면 아무 키나 누르십시오 . . .
*/
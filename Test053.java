/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (while문) 실습
====================================
◎ Test053.java
==================================*/

// 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1~9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해버릴 수 있도록 처리한다.

// 실행 예시
// 원하는 단(구구단) 입력: 8
// 8 * 1 = 8
// 8 * 2 = 16
//   |
// 8 * 9 = 72
// 계속하려면 아무 키나 누르십시오 . . .

// 원하는 단(구구단) 입력: 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test053
{
	public static void main(String[] args) throws IOException
	{
		int i = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 단(구구단) 입력: ");
		int n = Integer.parseInt(br.readLine());

		if (n > 9)
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
		else
		{
			while (i <= 9)
			{
				System.out.printf("%d * %d = %d\n", n, i, n*i);
				i++;
			}
		}
	}
}

/*
[실행 결과]
원하는 단(구구단) 입력: 9
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력: 11
1부터 9까지의 정수만 입력 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
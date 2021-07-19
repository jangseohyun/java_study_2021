/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- 반복문 (while문) 실습
====================================
◎ Test050.java
==================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예시
// 임의의 정수 입력: 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르십시오 . . .

// 임의의 정수 입력: 11
// 11 → 소수
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 소수: 1 또는 자기 자신의 값 이외의 어떤 수로도 나눌 수 없는 값
//          단, 1은 소수 아님. 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력: ");
		int n = Integer.parseInt(br.readLine());

		int i = 2;
		
		while (i <= (n-1))	//--n을 2부터 n-1까지의 숫자로 한 번씩 나눠봄
		{
			// n이 2부터 n-1까지의 숫자 범위 내에서 나머지 0으로 나누어떨어지는 경우가 있으면 소수 아님
			if (n % i == 0)
			{
				System.out.printf("%d → 소수 아님\n", n);
				System.exit(0);  //--break를 쓰면 while문만 끝나서 뒤의 if문이 남으니까 여기서 강제 종료함
			}
			// n이 안 나눠지면 i를 1씩 증가시켜서 다시 해봄
			else
				i++;
		}

		// while문에 해당하지 않은(1과 자기 자신 빼고는 나눠지지 않는) 정수는 소수
		if (n == 1)	//--1은 위의 while문에 해당하지 않기 때문에 따로 써줌
			System.out.printf("%d → 소수 아님\n", n);
		else
			System.out.printf("%d → 소수\n", n);
	}
}

/*
[강사님 풀이]
// ○ 주요 변수 선언
int num;	//--사용자가 입력하는 임의의 정수를 담아둘 변수
int n = 2;	//--사용자의 입력값을 대상으로 나눗셈 연산을 수행할 변수(1씩 증가할 예정)

// ○ 연산 및 처리
System.out.print("임의의 정수 입력: ");
num = Integer.parseInt(br.readLine());

boolean flag = true;	//--true=소수

while (n < num)
{
	if (num % n == 0)
	{
		flag = false;	//--false=소수 아님
		break;			//--while문 탈출 (한 번 나누어떨어진 다음에는 불필요한 연산 수행하지 않음)
	}
	n++;
}

// ○ 결과 출력
//    (출력 전에 수행해야 할 추가 확인 → 1인지 여부에 대한 확인)
//    소수다 && 1이 아니다 → 최종적인 결론으로 소수다.
//    그렇지 않으면	→ 최종적인 결론으로 소수가 아니다
if (flag && num != 1)	//--1은 위의 while문 조건에 해당하지 않음
{
	System.out.printf("%d → 소수\n", num);
}
else
{
	System.out.printf("%d → 소수 아님\n", num);
}
*/


/*
[실행 결과]
임의의 정수 입력: 10
10 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력: 11
11 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/
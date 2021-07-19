/*==================================
++++++++++연산자(Operator)++++++++++
- 삼항 연산자
====================================
◎ Test028.java
==================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader의 readLine()을 통해 넘겨받도록 한다.
// 또한, 조건 연산자(삼항 연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예시
// 임의의 정수 입력: -12
// -12 → 음수
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력: ");
		int a = Integer.parseInt(br.readLine());

		String result = a == 0 ? "0" : (a > 0 ? "양수" : "음수");

		System.out.printf(" %d → %s\n ", a, result);
	}
}

/*
[강사님 풀이]
// 주요 변수 선언
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n;				//--사용자 입력값을 받을 변수
String strResult;	//--음수인지 양수인지 0인지 판별 결과를 담을 변수

// 연산 및 처리
// ① 사용자에게 안내 메세지 출력
System.out.print("임의의 정수 입력: ");
// ② 사용자 입력 데이터를 변수 n에 담아내기
n = Integer.parseInt(br.readLine());
strResult = n > 0 ? "양수" : (n < 0 ? "음수" : "0")

// n이 0보다 크다 → true  → 양수
// 			      → false → n이 0보다 작다 → true  → 음수
//                                           → false → 0

// 결과 출력
System.out.printf(" %d → %s\n ", n, strResult);


/*
[실행 결과]
임의의 정수 입력: -12
 -12 → 음수
계속하려면 아무 키나 누르십시오 . . .
임의의 정수 입력: 12
 12 → 양수
계속하려면 아무 키나 누르십시오 . . .
임의의 정수 입력: 0
 0 → 0
계속하려면 아무 키나 누르십시오 . . .
*/
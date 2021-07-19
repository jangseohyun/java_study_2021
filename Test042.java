/*==================================
+++++실행 흐름의 컨트롤(제어문)+++++
- switch문 실습
====================================
◎ Test042.java
==================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리한다.

// 실행 예시
// 첫 번째 정수 입력: 10
// 두 번째 정수 입력: 31
// 연산자 입력(+, -, *, /): +
// >> 10 + 31 = 41
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력(+, -, *, /): ");
		int cal = System.in.read();

		switch (cal)
		{
			case 43: System.out.printf(">> %d + %d = %d\n", a, b, a+b); break;
			case 45: System.out.printf(">> %d - %d = %d\n", a, b, a-b); break;
			case 42: System.out.printf(">> %d * %d = %d\n", a, b, a*b); break;
			case 47: System.out.printf(">> %d / %d = %d\n", a, b, a/b); break;
			default: System.out.println(">> 입력 오류");
		}
	}
}

/*
[강사님 풀이]
int a, b, result;
char op;

System.out.print("연산자 입력(+, -, *, /): ");
op = (char)System.in.read();

// case의 상수에는 문자형이 오지 못 하는 게 맞으나 jdk 1.5부터 문자형도 지원
switch (op)
{
	case '+': result=a+b; break;
	case '-': result=a-b; break;
	case '*': result=a*b; break;
	case '/': result=a/b; break;
	default: return;	//--메소드 종료 → main() 메소드 종료 → 프로그램 종료
	
	// ※ 『return』: ① 값의 반환 ② 메소드의 종료
}

System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/


/*
[실행 결과]
첫 번째 정수 입력: 10
두 번째 정수 입력: 31
연산자 입력(+, -, *, /): +
>> 10 + 31 = 41
계속하려면 아무 키나 누르십시오 . . .
*/
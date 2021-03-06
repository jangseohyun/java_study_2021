/*===================================
++++++++++클래스와 인스턴스++++++++++
-클래스 개념 적용 및 클래스 설계 실습
=====================================
◎ Test072.java
===================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수까지의 합을 연산하여
// 결과를 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며,
// 입력받은 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예시
// 임의의 정수 입력(1~100): 1002
// 임의의 정수 입력(1~100): -20
// 임의의 정수 입력(1~100): 100
// >> 1 ~ 100 까지의 합: 5050
// 계속하려면 아무 키나 누르십시오 . . .


import java.util.Scanner;

class Sum
{
	int input()
	{
		int n = 0;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("임의의 정수 입력(1~100): ");
			n = sc.nextInt();
		}
		while (n < 1 || n > 100);

		return n;
	}

	int calSum(int n)
	{
		int s = 0;
		
		for (int i=0; i<=n; i++)
			s += i;

		return s;
	}

	void print(int n, int s)
	{
		System.out.printf(">> 1 ~ %d 까지의 합: %d\n", n, s);
	}
}


public class Test072
{
	public static void main(String[] args)
	{
		Sum sum = new Sum();
		int n = sum.input();
		int s = sum.calSum(n);
		sum.print(n, s);
	}
}

/*
[강사님 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// ○ 주요 ㅇ변수 선언(사용자의 입력값을 담아둘 변수)
	int su;

	// ○ 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~100): ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>100);
	}

	// ○ 연산 메소드 정의
	int calculate()
	{
		int result = 0;

		for (int i=1; i<=su; i++)
			result += i;

		return result;
	}

	// ○ 결과 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합: %d\n", su, sum);
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap 클래스 인스턴스 생성
		Hap ob = new Hap();

		// 생성한 인스턴스(ob)를 통해 입력 메소드 호출 → throws IOException
		ob.input();
		
		// 생성한 인스턴스를 통해 연산 메소드 호출 → int형 결과값 반환 → 받아낼 수 있는 처리가 선행되어야 함
		int s = ob.calculate();

		// 생성한 인스턴스를 통해 출력 메소드 호출 → 매개변수 전달
		ob.print(s);
	}
}
*/


/*
[실행 결과]
임의의 정수 입력(1~100): 1002
임의의 정수 입력(1~100): -20
임의의 정수 입력(1~100): 100
>> 1 ~ 100 까지의 합: 5050
계속하려면 아무 키나 누르십시오 . . .
*/
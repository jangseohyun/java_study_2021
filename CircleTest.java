// ○ 실습 문제
//    원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// 클래스명: CircleTest → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예시
// 반지름 입력: xx
// >> 반지름이 xx인 원의
// >> 넓이: xx.xx
// >> 둘레: xx.xx
// >> 계속하려면 아무 키나 누르십시오 . . .


import java.util.Scanner;

class CircleTest
{
	int i;
	double pi = 3.141592;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		i = sc.nextInt();
	}

	double calArea()
	{
		return i * i * pi;
	}

	double calLength()
	{
		return i * 2 * pi;
	}

	void print(double area, double len)
	{
		System.out.printf("\n>> 반지름이 %d인 원의", i);
		System.out.printf("\n>> 넓이: %.2f", area);
		System.out.printf("\n>> 둘레: %.2f\n", len);
	}
}

/*
[강사님 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	int r;						//--반지름
	final double PI = 3.141592	//--원주율 (final: 변수의 상수화)

	void input() throws IOException	//--이 메소드 밖으로 throw
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력: ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calLength()
	{
		double result;
		result = r * 2 *PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의\n", r);
		System.out.printf(">> 넓이: %.2f\n", a);
		System.out.printf(">> 둘레: %.2f\n", l);
	}
}
*/
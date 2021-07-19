/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-변수와 자료형
-자바의 기본 입출력: BufferedReader 클래스
=======================================
◎ Test013.java
=====================================*/

// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예시
// ■ 삼각형의 넓이 구하기 ■
// -삼각형의 밑변 입력: 3
// -삼각형의 높이 입력: 5
// >> 밑변이 3, 높이가 5인 삼각형의 넓이: xxxx
// 계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		int a, b, c;

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("-삼각형의 밑변 입력: ");
		a = Integer.parseInt(br1.readLine());
		System.out.print("-삼각형의 높이 입력: ");
		b = Integer.parseInt(br2.readLine());

		c = (a*b) / 2;
		
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이: %d\n", a, b, c);
	}
}

/*
[강사님 풀이]

// 외부로부터 데이터를 입력받기 위해서
// BufferedReader 인스턴스 생성
// 한 번만 해도 됨
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 주요 변수 선언
int underlength, height;		// 밑변, 높이
double area;					// 넓이 체크

// 연산 및 처리
// ① 사용자에게 안내 메세지 출력
System.out.println("■ 삼각형의 넓이 구하기 ■");
System.out.print("-삼각형의 밑변 입력: ");

// ② 사용자가 입력한 데이터(밑변)를 정수 형태로 변환한 후
//    변수 underlength에 담아내기
underlength = Integer.parseInt(br.readLine());

// ③ 다시 사용자에게 안내 메세지 출력
System.out.print("-삼각형의 높이 입력: ");

// ④ 사용자가 입력한 데이터(높이)를 정수 형태로 변환한 후
//    변수 height에 담아내기
height = Integer.parseInt(br.readLine());

// ⑤ 삼각형의 넓이를 구하는 연산 처리
area = underlength * height / 2.0;
// 실수 자료형이 결과값으로 나오는 과정에서
// 실수 기반의 연산이 필요한 상황이다.
// 정수형 2가 아닌 실수형 2.0으로 나눗셈 연산을 수행하게 되면
// 이 연산은 실수 기반으로 처리된다.

// 결과 출력
System.out.println();
System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이: %.2f\n", underlength. height, area);

/*
[실행 결과]
■ 삼각형의 넓이 구하기 ■
-삼각형의 밑변 입력: 3
-삼각형의 높이 입력: 5
>> 밑변이 3, 높이가 5인 삼각형의 넓이: 7
계속하려면 아무 키나 누르십시오 . . .
*/
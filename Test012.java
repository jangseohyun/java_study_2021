/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-변수와 자료형
-자바의 기본 입출력: BufferedReader 클래스
=======================================
◎ Test012.java
=====================================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;	// 입력된 데이터를 사람이 읽을 수 있는 데이터로 변환
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성
		// 컴퓨터 본체에 키보드 장착 → 문자 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int r;
		double a, b;

		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력: ");		// println으로 쓰면 개행된 채로 입력하게 됨
		// ② 사용자가 입력한 값(문자열)을 → br.readLine()			→ ex. "50"
		//    숫자형(정수형)으로 변환 후   → Integer.parseInt()	→ ex. 50
		//    반지름 변수 r에 담아내기
		r = Integer.parseInt(br.readLine());
		// ③ 넓이 및 둘레 연산
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;

		// 결과 출력
		//System.out.println(">> 넓이: "+a);
		//System.out.println(">> 둘레: "+b);
		System.out.printf(">> 넓이: %.2f\n", a);
		//System.out.printf(">> 둘레: %f", b);

	}
}


/*
[실행 결과]
원의 반지름 입력: 10
>> 넓이: 314.1592
>> 둘레: 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/
/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-자바의 기본 입출력: java.util.Scanner
=======================================
◎ Test019.java
=====================================*/

// ※ 『java.util.Scanner』
//     단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//     디폴트(default)로 사용되는 단락 문자는 공백이다.
//     작성된 다음 토큰은 『next()』 메소드를 사용,
//     다른 형태의 값으로 변환할 수 있다.


import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 주요 변수 선언
		String name;
		int kor, eng, mat, tot;

		//연산 및 처리
		System.out.print("이름, 국어, 영어, 수학 입력(『,』 구분): ");

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		// "\\s*,\\s*"=모든(*) 문자열(\s)과 문자열(\s) 사이의 ,(사용자 정의 구분자)
		// 임의의 문자열과 문자열을 사용자 정의 구분자를 통해 분할

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// 총점 산출
		tot = kor + eng + mat;

		// 결과 출력
		System.out.println();
		System.out.printf("이름: %s\n", name);
		System.out.printf("총점: %d\n", tot);
	}
}


/*
[실행 결과]
이름, 국어, 영어, 수학 입력(『,』 구분): 장서현,90,80,70

이름: 장서현
총점: 240
계속하려면 아무 키나 누르십시오 . . .
*/
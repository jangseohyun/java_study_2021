/*=============================
++++++++++배열(array)++++++++++
-배열의 기본적인 활용
===============================
◎ Test083.java
=============================*/

// ○ 실습 문제
// 사용자로부터 인원 수를 입력받고
// 이렇게 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받아
// 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 박두팔 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 이춘배 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 장광식 010-3333-3333

// --------------------
// 전체 학생 수 : 3명
// --------------------
//	이름	 전화번호
// 박두팔 010-1111-1111
// 이춘배 010-2222-2222
// 장광식 010-3333-3333
// ---------------------
// 계속하려면 아무 키나 누르십시오...

// 이름, 전화번호 배열 따로


import java.util.Scanner;


public class Test083
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10): ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		String nameArr[];
		nameArr = new String[num];
		String phoneArr[];
		phoneArr = new String[num];
		
		
		for (int i=0; i<num; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분): ", num);
			nameArr[i] = sc.next();
			phoneArr[i] = sc.next();
		}
		
		/*
		int i = 0;

		do
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분): ", num);
			nameArr[i] = sc.next();
			phoneArr[i] = sc.next();
			i++;
		}
		while (i<num);
		*/

		System.out.println("--------------------");
		System.out.printf(" 전체 학생 수: %d명\n", num);
		System.out.println(" 이름    전화번호");
		
		for (int j=0; j<nameArr.length; j++)
			System.out.println(nameArr[j]+" "+phoneArr[j]);

		System.out.println("--------------------");
	}
}

/*
[강사님 풀이]
import java.util.Scanner;

public class Test083
{
	public static void main(String[] args) 
	{
	
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생수를 담아둘 변수
		int memCount = 0;

		// ○ 사용자 입력값 받아오기	// 일단 값을 받아야 하니까 do~while문
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		// 테스트
		// System.out.println("사용자가 입력한 인원 수 : " + memCount);
		
		// ○ 이름 저장 배열 구성 → 입력받은 인원 수 만큼의 배열방 개수
		String[] names = new String[memCount];

		// ○ 전화번호 저장 배열 구성 → 입력받은 인원 수 만큼의 배열방 개수
				// 번호 저장은 숫자 형식으로 받으면 안 됨
				// 0으로 시작하는 경우 잘못 저장될 수 있기 때문
		String[] tels = new String[memCount];	//--String[] tels = new String[names.length];

		// ○ 반복문을 활용하여 사용자의 입력 데이터를 배열에 담아내기
		for (int n=0; n<memCount; n++)	//--memCount == names.length == tels.length
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분): ", (n+1));
			names[n] = sc.next();
			tels[n] = sc.next();
		}

		// ○ 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("--------------------");
		System.out.printf(" 전체 학생 수: %d명\n", memCount);
		System.out.println(" 이름    전화번호");

		for (int m=0; m<memCount; m++)
			System.out.printf("%3s %14s\n", names[m], tels[m]);

		System.out.println("--------------------");
	}
}
*/


/*
[실행 결과]
입력 처리할 학생 수 입력(명, 1~10): 3
이름 전화번호 입력[3](공백 구분): 아이유 010-0000-0000
이름 전화번호 입력[3](공백 구분): 박효신 010-0000-0000
이름 전화번호 입력[3](공백 구분): 엔시티 127-0000-0000
--------------------
 전체 학생 수: 3명
 이름    전화번호
아이유 010-0000-0000
박효신 010-0000-0000
엔시티 127-0000-0000
--------------------
계속하려면 아무 키나 누르십시오 . . .
*/
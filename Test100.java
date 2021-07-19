/*=======================
++++++++만년 달력++++++++
=========================
◎ Test100.java
=======================*/

// ○ 다음과 같은 프로그램을 구현한다
// 실행 예시
// 『연도』를 입력하세요: 2021
// 『월』을 입력하세요  : 7
/*
	[ 2021년 7월 ]

 일 월 화 수 목 금 토
======================
              1  2  3
  4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30 31
======================
계속하려면 아무 키나 누르십시오 . . .
*/

import java.util.Scanner;


class Test100
{
	public static void main(String[] args)
	{
		int y, m;			//--입력받을 연, 월 변수
		int d;				//--입력받은 달의 1일이 무슨 요일에 시작하는지 알아내기 위해 쓸 변수
		int start;			//--입력받은 달의 1일이 무슨 요일에 시작하는지 알아낸 변수
		int last;			//--입력받은 달이 며칠까지 있는지 알아낼 변수
		int n=1;			//--달력에 숫자를 넣어줄 변수
		String blank = " ";	//--1일 이전의 자리에 공백을 넣을 변수
		String[][] arr = new String[6][7];	//--공백을 담기 위해 String배열로 생성

		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("연도 입력:  ");
			y = sc.nextInt();
		}
		while (y < 1);

		do
		{
			System.out.print("월 입력:  ");
			m = sc.nextInt();
		}
		while (m < 1 || m >12);
		

		if (y % 4 == 0 && y % 100 !=0 || y % 400 == 0)
			days[1] = 29;

		d = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<m-1; i++)
			d += days[i];
			
		d += 1;

		start = d % 7;		//--입력받은 달의 1일이 무슨 요일에 시작하는지
		last = days[m-1];	//--입력받은 달이 며칠에 끝나는지
		
		for (int j=0; j<arr[0].length; j++)		//--첫 번째 줄
		{
			if (j<start)
				arr[0][j] = blank;
			else
			{
				arr[0][j] = Integer.toString(n);
				n++;
			}
		}

		for (int i=1; i<arr.length; i++)		//--두 번째 줄부터 끝까지
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (n<=last)		
				{
					arr[i][j] = Integer.toString(n);
					n++;
				}
				else
					arr[i][j] = blank;
			}
		}

		System.out.printf("\n    [ %d년 %d월 ]\n\n", y, m);
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("======================");
			
		int cut = 0;		//--달력의 마지막 줄이 공백이면 삭제하기 위한 변수

		if (start < 5)		//--1일이 토요일 이전에 시작하면 삭제
			cut++;
		else if (m == 2)	//--위에 해당하지 않는 경우에도 2월이면 삭제
			cut++;

		for (int i=0; i<arr.length-cut; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3s", arr[i][j]);
			System.out.println();
		}

		System.out.println("======================");
	}
}

/*
[강사님 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test100_T
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// 각 달이 담고 있는 마지막 날짜(매월의 최대 날짜)
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

		// 주요 변수 선언
		int nalsu, y, m, w;		//--날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요:  ");
			y = Integer.parseInt(br.readLine());
		}
		while (y < 1);

		do
		{
			System.out.print("『월』을 입력하세요:  ");
			m = Integer.parseInt(br.readLine());
		}
		while (m < 1 || m >12);

		//-------------------------여기까지 유효한 년도, 월 입력한 상태
		
		// 입력받은 년도에 해당하는 2월의 마지막 날 계산
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			days[1] = 29;
		else	// 현재 days 배열의 1번째 요소가 기본적으로 28로 입력되어 있으므로 생략 가능
			days[1] = 28;

		// 1년 1월 1일 ~ 입력받은 년도의 이전 년도의 12월 31일까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 입력받은 년도(해당 년도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for (int i=0; i<m-1; i++)
			nalsu += days[i];

		// 입력받은 월의 1일
		nalsu += 1;

		//-------------------------여기까지 모든 날 수에 대한 종합 완료

		// 요일 산출
		w = nalsu % 7;

		// 출력(달력 그리기)
		System.out.println();
		System.out.println("\t [ " +y+"년 "+m+"월 ]");
		System.out.println("  일  월  화  수  목  금  토");	//--두 칸 공백
		System.out.println("==============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
			System.out.print("    ");	//--네 칸 공백

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);
			w++;	//--날짜가 증가하는 만큼 요일도 함께 증가할 수 있도록 처리

			if (w % 7 == 0)
				System.out.println();
		}
		
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if (w % 7 != 0)
			System.out.println();
		
		System.out.println("==============================");

	}
}
*/


/*
[실행 결과]
    [ 2021년 1월 ]

 일 월 화 수 목 금 토
======================
                 1  2
  3  4  5  6  7  8  9
 10 11 12 13 14 15 16
 17 18 19 20 21 22 23
 24 25 26 27 28 29 30
 31
======================
계속하려면 아무 키나 누르십시오 . . .

    [ 2021년 2월 ]

 일 월 화 수 목 금 토
======================
     1  2  3  4  5  6
  7  8  9 10 11 12 13
 14 15 16 17 18 19 20
 21 22 23 24 25 26 27
 28
======================
계속하려면 아무 키나 누르십시오 . . .
*/
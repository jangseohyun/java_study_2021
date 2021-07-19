/*==================================
++++++자바의 주요(중요) 클래스++++++
- Calendar 클래스
====================================
◎ Test138.java
==================================*/


/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고 Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없다.
   실제적인 메소드 구현은 Calendar클래스의 서브 클래스인
   『GregorianCalendar』 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   『getInstance()』라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고 있는 시간 정보들은
   『get()』 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   『getInstance()』 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 날짜 시간 정보를
   구할 수도 있다.
*/

// ○ 실습 문제
//    사용자로부터 연, 월을 입력받아
//    해당 연, 월의 달력을 그려주는(출력하는) 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예시
// 연도 입력: 0
// 연도 입력: 2021
// 월 입력: -2
// 월 입력: 16
// 월 입력: 7

/*
	[2021년 7월]

 일 월 화 수 목 금 토
======================
              1  2  3
  4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30 31
======================
*/


import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test138
{
	public static void main(String[] args)
	{	
		// 연, 월 입력받기
		Scanner sc = new Scanner(System.in);
		int y, m, w, w2, last, last2;
		int d = 1, n = 1;
		int n7;

		do
		{
			System.out.print("연도 입력: ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("월 입력: ");
			m = sc.nextInt();
		}
		while (m<1 | m>12);


		// 달력 설정
		Calendar cal = new GregorianCalendar();
		cal.set(y,m-1,1);	//--입력받은 연도와 월의 1일로 설정
		w = cal.get(Calendar.DAY_OF_WEEK);	//--1일이 해당하는 요일(일요일: 1)
		last = cal.getActualMaximum(Calendar.DATE);	//--날짜 최대값(마지막 날)

		Calendar cal2 = new GregorianCalendar();
		cal2.set(y,m,1);
		w2 = cal2.get(Calendar.DAY_OF_WEEK);
		last2 = cal2.getActualMaximum(Calendar.DATE);

		
		// 출력
		System.out.printf("\n     [%d년 %d월]\t\t     [%d년 %d월]",y,m,y,m+1);
		System.out.print("\n 일 월 화 수 목 금 토\t\t 일 월 화 수 목 금 토\n======================\t\t======================\n");
		
		// 1일 이전의 공백 출력
		for (int i=1; i<w; i++)
			System.out.print("   ");

		for (int i=1; i<=35; i++)
		{	
			if (d <= last)
			{
				System.out.printf("%3d", d);
				d++;
			}
			else
				System.out.print("   ");

			if (w == 7)
			{
				System.out.printf("           ");

				for (int j=1; j<w2; j++)
					System.out.print("   ");

				for (int j=1; j<=7-w2+1; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 14)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}
			
			if (w == 21)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 28)
			{
				System.out.printf("           ");
				
				n7 = n+7;

				for (int j=n; j<n7; j++)
				{
					System.out.printf("%3d", j);
					n++;
				}
			}

			if (w == 35)
			{
				System.out.printf("           ");

				for (int j=n; j<=last2; j++)
				{
					System.out.printf("%3d", j);
				}
			}

			// 개행
			if (w%7==0 && w!=35 && i != last)
				System.out.println();
			w++;
		}

		System.out.print("\n======================\t\t======================\n");
		
	}
}


/*
[실행 결과]
연도 입력: 2021
월 입력: 3

     [2021년 3월]                    [2021년 4월]
 일 월 화 수 목 금 토            일 월 화 수 목 금 토
======================          ======================
     1  2  3  4  5  6               .
  7  8  9 10 11 12 13               .
 14 15 16 17 18 19 20               .
 21 22 23 24 25 26 27               .
 28 29 30 31
======================
계속하려면 아무 키나 누르십시오 . . .

*/
/*==================================
++++++자바의 주요(중요) 클래스++++++
- Calendar 클래스
====================================
◎ Test139.java
==================================*/


// ○ 실습 문제
//    오늘을 기준으로
//    입력받는 날짜만큼 후의 연, 월, 일, 요일을 확인하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예시)
// 오늘 날짜: 2021-3-8 월요일
// 며칠 후의 날짜를 확인하고자 하십니까?: 200

// =======[ 확인 결과 ]=======
// 200일 후: 2021-xx-xx x요일
// ===========================
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 특정 날짜를 기준으로 날수를 더하는 연산 메소드
//    『날짜객체.add(Calendar.DATE, 날수)』


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Test139
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		String[] week = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

		// 오늘 날짜 출력
		System.out.printf("오늘 날짜: %d-%d-%d %s\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.print("며칠 후의 날짜를 확인하고자 하십니까?: ");
		int date = sc.nextInt();

		cal.add(Calendar.DAY_OF_MONTH, date);

		System.out.println("\n=======[ 확인 결과 ]=======");
		System.out.printf("%d일 후: %d-%d-%d %s\n", date, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), week[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("===========================");
	}
}

/*
[강사님 풀이]
// Scanner 인스턴스 생성
Scanner sc = new Scanner(System.in);

// Calendar 인스턴스 생성
Calendar now = Calendar.getInstance();

// 주요 변수 선언
int nalsu;			//--사용자로부터 입력받은 날수
int y, m, d, w;		//--연, 월, 일, 요일
Stirng[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

// 현재의 연, 월, 일, 요일 확인(가져오기: get())
y = now.get(Calendar.YEAR);
m = now.get(Calendar.MONTH)+1;
d = now.get(Calendar.DATE);
w = now.get(Calendar.DAY_OF_WEEK);

// 현재의 연, 월, 일, 요일 확인 결과 출력
System.out.printf("오늘 날짜: %tF %tA", now, now);	//--오늘 날짜: 2021-03-08 월요일

do
{
	System.out.print("며칠 후의 날짜를 확인하고자 하십니까?: ");
	nalsu = sc.nextInt();
}
while(nalsu<1);

// 날수 더하기 연산
now.add(Calendar.DATE, nalsu);

// 결과 출력
System.out.println();
System.out.println("\n=======[ 확인 결과 ]=======");
System.out.printf("%d일 후: %tF %tA\n", nalsu, now, now);
System.out.println("============================");
*/


/*
[실행 결과]
오늘 날짜: 2021-3-8 월요일
며칠 후의 날짜를 확인하고자 하십니까?: 200

=======[ 확인 결과 ]=======
200일 후: 2021-9-24 금요일
===========================
계속하려면 아무 키나 누르십시오 . . .
*/
/*
※ 문제 인식 및 분석

-서기 1년 1월 1일: 월요일

-연도가 4의 배수이면서 100의 배수가 아니거나,
 400의 배수이면 2월 29일(윤년), 나머지 2월은 28일(평년)

-2021년 7월의 달력을 그린다고 가정하면
 1. 1. 1. ~ 2021. 6. 30 까지의 전체 날 수를 구한다
 그 날 수에 +1 연산을 수행하면 2021. 7. 1 의 요일 확인

-요일 = 전체날수 % 7
 요일 = 0 → 일요일, 1 → 월요일, ...
*/

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